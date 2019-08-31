package tws.dto;
import tws.entity.ParkingLot;


import java.util.List;

public class ParkingBoyDto {
    private  int parkingId;
    private String name;
    private List<ParkingLot> parkingLotList;

    public ParkingBoyDto() {
    }

    public ParkingBoyDto(int parkingId, String name, List<ParkingLot> parkingLotList) {
        this.parkingId = parkingId;
        this.name = name;
        this.parkingLotList = parkingLotList;
    }

    public int getParkingId() {
        return parkingId;
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }
}
