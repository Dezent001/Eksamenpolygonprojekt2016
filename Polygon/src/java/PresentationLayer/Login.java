/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;


import LogikLag.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author Rune
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    RequestDispatcher rd = null;
    List<User> users;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, List<User> users) throws ServletException, IOException{
        String firmName = request.getParameter("Username");
        String password = request.getParameter("password");
        int logged_in_type = 0;
        System.out.println("tjekker for brugeren");
        
        if (firmName.length() > 0 && password.length() > 0) {
            for (User user : users) {
                if (user.getFirmName().equals(firmName) && user.getPassword().equals(password)) {
                    logged_in_type = user.getUsertype();
                    request.getSession().setAttribute("Username", firmName);
                    request.getSession().setAttribute("logged_in_type", user.getUsertype());
                    System.out.println("Test0");
                    break;
                }
            }
        }
        System.out.println("Test1");
        switch (logged_in_type) {
            case 1:
                request.getRequestDispatcher("/homePage.html").forward(request, response);
                break;
            case 2:
                request.getRequestDispatcher("/login.html").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("/login.html").forward(request, response);
                break;
        }
 
    }

   
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Test2");
        response.sendRedirect("/login.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            System.out.println("gik i try (login)");
            users = Users.getUsers();
            processRequest(request, response, users);
        } catch (Exception ex) {
            System.out.println("gik i catch (login)");
            request.setAttribute("errorMsg",ex.getMessage());
            rd = request.getRequestDispatcher("/Login");
            rd.forward(request, response);
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}


