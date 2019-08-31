package tws.entity;

public class ParkingBoy {
    private  int parkingId;
    private String name;
    public ParkingBoy() {
    }

    public ParkingBoy(int parkingId, String name) {
        this.parkingId = parkingId;
        this.name = name;
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
}
