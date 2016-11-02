package buildings;
import java.util.List;
/**
 *
 * @author Morten
 */
public class Building {
    
    private String adresse;
    private int m2;
    private int floor;
    private int zip;

   
    

      public Building(String adresse, int zip, int floor, int m2) {
       this.adresse = adresse;
       this.floor = floor;
       this.m2 =m2;
       this.zip = zip;
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
    public int getFloor() {
        return floor;
    }

    /**
     * @param floors the floors to set
     */
    public void setFloors(int floors) {
        this.floor = floor;
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
}
