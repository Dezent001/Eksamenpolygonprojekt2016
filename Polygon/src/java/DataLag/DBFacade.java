package DataLag;

import buildings.Building;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Morten
 */
public class DBFacade  {

    public static List<Building> getBuildings() throws SQLException, ClassNotFoundException {
        String sql = "SELECT id,street,contactName,zip,city,contactPhone "
                + "FROM building";
        List<Building> buildings = new ArrayList<>();
        try {
                Connector DB = Connector.getInstance();
                Statement stmt = DB.getConnection().createStatement();
                ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                //int userID, int buildingID, int zip, String street, int size, int floors
                int userID = res.getInt("userID");
                int buildingID = res.getInt("buildingID");
                int zip = res.getInt("zipID");
                String street = res.getString("street");
                int size = res.getInt("m2");
                int floors = res.getInt("floors");
                buildings.add(new Building(userID, buildingID, zip, street, size, floors));
            }
        } catch (SQLException ex) {
            System.out.println("Element not gotten: " + ex.getMessage());
        }
        return buildings;
    }

    public static Building getBuildings(int buildingID) throws ClassNotFoundException {
        String sql = "SELECT buildingID,zipID,street,m2,floors "
                + "FROM building "
                + "WHERE id=?";
        try {
                PreparedStatement stmt = DataLag.Connector.prepare(sql);
            stmt.setInt(1, buildingID);
            ResultSet res = stmt.executeQuery();
            if (res.next()) {
                String street = res.getString("street");
                int zip = res.getInt("zip");
                return new Building(buildingID, street, zip);
            }
        } catch (SQLException ex) {
            System.out.println("Element not gotten: " + ex.getMessage());
        }
        return null;
    }

    public static void updateBuilding(Building b) throws ClassNotFoundException {
        /* UPDATE table_name
SET column1=value1,column2=value2,...
WHERE some_column=some_value;
         */
        String sql = "UPDATE building "
                + "SET street=?,"
                + "m2=?,"
                + "zipID=?,"
                + "floors=?"
                + "WHERE id=?";
        try {
                
            
            PreparedStatement stmt = Connector.prepare(sql);
            stmt.setString(1, b.getAdresse());
            stmt.setInt(2, b.getM2());
            stmt.setInt(3, b.getZip());
            stmt.setInt(4, b.getFloors());
            stmt.setInt(5, b.getBuildingID());
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Element inserted");
            } else {
                System.out.println("No change");
            }
        
        } catch (SQLException ex) {
            System.out.println("Element not inserted: " + ex.getMessage());
        }
    }

}

