package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.ParkingBoy;
import tws.entity.Employee;
import tws.repository.ParkingBoyMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parkingboys")
public class ParkingBoyController {

    @Autowired
    private ParkingBoyMapper parkingBoyMapper;

    @PostMapping("")
    public ResponseEntity<ParkingBoy> insert(@RequestBody ParkingBoy parkingBoy) {
        parkingBoyMapper.insert(parkingBoy);
        return ResponseEntity.created(URI.create("/parkingboys" +parkingBoy.getEmployeeID())).build();
    }

    @GetMapping("")
    public ResponseEntity<List<ParkingBoy>> getAll() {

        return ResponseEntity.ok(parkingBoyMapper.selectAll());
    }
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = parkingBoyMapper.selectAllEmployees();
        System.out.println(employees.toString());
        return ResponseEntity.ok(employees);
    }

}
