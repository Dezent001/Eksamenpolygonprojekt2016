package buildings;

/**
 *
 * @author Morten
 */
public class Building {

    private int userID;
    private int buildingID;
    private int zip;
    private String adresse;
    private int m2;
    private int floors;

    public Building(int userID, int buildingID, int zip, String street, int size, int floors) {
        
    }

    public Building(int id, String street, int zip, String city, String name, String phone) {

    }

    public Building(int buildingID, String street, int zip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the m2
     */
    public int getM2() {
        return m2;
    }

    /**
     * @param m2 the m2 to set
     */
    public void setM2(int m2) {
        this.m2 = m2;
    }

    /**
     * @return the floors
     */
    public int getFloors() {
        return floors;
    }

    /**
     * @param floors the floors to set
     */
    public void setFloors(int floors) {
        this.floors = floors;
    }

    /**
     * @return the zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * @return the buildingID
     */
    public int getBuildingID() {
        return buildingID;
    }

    /**
     * @param buildingID the buildingID to set
     */
    public void setBuildingID(int buildingID) {
        this.buildingID = buildingID;
    }
}
