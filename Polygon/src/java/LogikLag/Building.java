package LogikLag;
import java.util.List;
/**
 *
 * @author Morten
 */
public class Building {
    
    private int userID;
    private int buildingID;
    private int zipID;
    private String street;
    private int m2;
    private int floors;

    
    public Building(int userID, int buildingID, int zipID, String street, int m2, int floors) {
        this.userID = userID;
        this.buildingID = buildingID;
        this.zipID = zipID;
        this.street = street;
        this.m2 = m2;
        this.floors = floors;
    }
    
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(int buildingID) {
        this.buildingID = buildingID;
    }

    public int getzipID() {
        return zipID;
    }

    public void setzipID(int zipID) {
        this.zipID = zipID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
    
}