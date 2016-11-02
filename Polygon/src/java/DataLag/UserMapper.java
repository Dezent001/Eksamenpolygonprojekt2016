/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLag;

import LogikLag.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


/**
 *
 * @author Rune
 */
public class UserMapper {
    // Laver en bruger ud fra input
    public static List <User> getUser(){
       List <User> users = new ArrayList ();
       String sql = "SELECT * from 'users';";
        System.out.println("Negative");
       
       try{
           Connector DB = Connector.getInstance();
           Statement stmt = DB.getConnection().createStatement();
           ResultSet res = stmt.executeQuery(sql);
       
       while(res.next()){
            int buildingID = res.getInt("buildingID");
            int userID = res.getInt("userID");
            int zipID = res.getInt("zipID");
            int usertype = res.getInt("usertype");
            String firmName = res.getString("firmName");
            String ContactFirstName = res.getString("ContactFirstName");
            String ContactLAstName = res.getString("ContactLastName");
            String telefon = res.getString("telefon");
            String mail = res.getString("mail");
            int cvr = res.getInt("cvr");
            String gade = res.getString("gade");
            String password = res.getString("password");
            User user = new User( buildingID,userID,zipID,usertype,firmName,ContactFirstName,ContactLAstName,telefon,mail,cvr,gade,password);
            user.setUserID(res.getInt("userID"));
            users.add(user);
           
       }
       stmt.close();
       return users;
        
    } catch (SQLException | ClassNotFoundException ex){
        System.out.println("FEJL");
       // String msg = "kunne ikke finde listen af bruger(e)";
        //throw new PolygonException(msg);
}
        return null;
    }
}     //Husk at lave remove user baseret på id