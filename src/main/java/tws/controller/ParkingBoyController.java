package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.dto.ParkingBoyDto;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;
import tws.service.ParkingboyService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parkingboys")
public class ParkingBoyController {

    @Autowired
    private ParkingboyService parkingboyService;

    @PostMapping("")
    public ResponseEntity<ParkingBoy> insert(@RequestBody ParkingBoy parkingBoy) {
        parkingboyService.addParkingBoy(parkingBoy);
        return ResponseEntity.created(URI.create("/parkingboys" +parkingBoy.getParkingId())).build();
    }

    @GetMapping("")
    public ResponseEntity<List<ParkingBoy>> getAll() {
        return ResponseEntity.ok(parkingboyService.seletAllParkingboy());
    }
    @GetMapping("/parkingId")
    public ResponseEntity<List<ParkingBoyDto>> getAllEmployees(){
        return ResponseEntity.ok(parkingboyService.selectAllParkingLotByBoyId());
    }

}
