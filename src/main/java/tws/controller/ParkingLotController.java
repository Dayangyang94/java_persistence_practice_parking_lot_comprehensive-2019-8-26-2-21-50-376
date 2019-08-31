package tws.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.ParkingLot;
import tws.repository.ParkingLotMapper;
import tws.service.ParkingLotService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parkinglots")
public class ParkingLotController {
    @Autowired
    private ParkingLotService parkingLotService;

    @PostMapping("")
    public ResponseEntity<ParkingLotMapper> insert(@RequestBody ParkingLot parkingLot) {
        parkingLotService.insertParingLot(parkingLot);
        return ResponseEntity.created(
                URI.create("/parkinglots" +parkingLot.getParkingLotID())).build();
    }

    @GetMapping("")
    public ResponseEntity<List<ParkingLot>> getAll() {
        return ResponseEntity.ok(parkingLotService.selectParkingLots());
    }

}
