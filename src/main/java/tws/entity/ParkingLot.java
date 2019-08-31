package tws.entity;

public class ParkingLot {
    private int parkingLotID;
    private int capatity;
    private int availablePositionCount;
    private int parkingId;

    public ParkingLot() {
    }

    public ParkingLot(int parkingLotID, int capatity, int availablePositionCount, int parkingId) {
        this.parkingLotID = parkingLotID;
        this.capatity = capatity;
        this.availablePositionCount = availablePositionCount;
        this. parkingId = parkingId;
    }

    public int getParkingLotID() {

        return parkingLotID;
    }

    public void setParkingLotID(int parkingLotID) {

        this.parkingLotID = parkingLotID;
    }

    public int getCapatity()
    {
        return capatity;
    }

    public void setCapatity(int capatity) {

        this.capatity = capatity;
    }

    public int getAvailablePositionCount() {

        return availablePositionCount;
    }

    public void setAvailablePositionCount(int availablePositionCount) {
        this.availablePositionCount = availablePositionCount;
    }

    public int getParkingId() {

        return  parkingId;
    }

    public void setParkingId(int parkingId) {

        this.parkingId = parkingId;
    }
}
