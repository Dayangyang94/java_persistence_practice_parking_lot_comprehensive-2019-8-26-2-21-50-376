package tws.entity;

public class ParkingBoy {
    private  String employeeID;
    private String name;
    public ParkingBoy() {
    }

    public ParkingBoy(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
