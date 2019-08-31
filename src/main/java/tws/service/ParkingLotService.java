package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.ParkingLot;
import tws.repository.ParkingLotMapper;

import java.util.List;

@Service
public class ParkingLotService {
    @Autowired
    private ParkingLotMapper parkingLotMapper;
    public void insertParingLot(ParkingLot parkingLot){
        parkingLotMapper.insert(parkingLot);
    }
    public List<ParkingLot> selectParkingLots(){
        return parkingLotMapper.selectAll();
    }
}
