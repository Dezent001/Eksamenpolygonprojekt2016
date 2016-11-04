package buildings;

//import dbaccess.DBFacade;
import LogikLag.Building;
import DataLag.DBFacade;
import java.sql.SQLException;
import java.util.List;

/**
 * The purpose of DomainFacade is to provide a way for the presentation layer to
 * access the domain model
 *
 * @author kasper
 */
public class DomainFacade {

    public static List<Building> getBuildings() throws SQLException, ClassNotFoundException {
        //return Generator.randomBuildings(100);
        return DBFacade.getBuildings();
    }

    public static Building getBuilding( int id ) throws ClassNotFoundException {
        return DBFacade.getBuildings( id );
    }

    public static void updateBuilding( Building b ) throws ClassNotFoundException {
        DBFacade.updateBuilding( b );
    }
}
 