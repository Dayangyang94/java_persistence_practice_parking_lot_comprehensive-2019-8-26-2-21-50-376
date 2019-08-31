package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.dto.ParkingBoyDto;
import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;
import tws.repository.ParkingBoyMapper;

import java.util.List;
@Service
public class ParkingboyService {
    @Autowired
    ParkingBoyMapper parkingBoyMapper;
    public void addParkingBoy(ParkingBoy parkingBoy){
        parkingBoyMapper.insert(parkingBoy);
    }
    public List<ParkingBoy> seletAllParkingboy(){
        return parkingBoyMapper.selectAll();
    }
    public List<ParkingBoyDto> selectAllParkingLotByBoyId(){
        return parkingBoyMapper.selectAllParkingDto();
    }
}
