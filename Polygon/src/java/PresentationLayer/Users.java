/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DataLag.UserMapper;
import LogikLag.PolygonException;
import LogikLag.User;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author Rune
 */
public class Users extends HttpServlet{
    
    RequestDispatcher rd = null;
    
    public static List<User>getUsers() throws PolygonException{
        
        List<User>users = null;
        try{
            users=UserMapper.getUser();
        } catch (Exception ex){
                String msg = " Fejl i getUser()";
                throw new PolygonException(msg);
                }
                    return users;
        }
       
    }
    

