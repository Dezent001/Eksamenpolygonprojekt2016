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
        System.out.println("tjekker for brugeren");
        
        if (firmName.length() > 0 && password.length() > 0) {
            for (User user : users) {
                if (user.getFirmName().equals(firmName) && user.getPassword().equals(password)) {
                    request.getSession().setAttribute("Username", firmName);
                    break;
                }
            }
        }
        
        response.sendRedirect("index.html");
    }

   
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
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
            rd = request.getRequestDispatcher("Login");
            rd.forward(request, response);
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}


