/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import LogikLag.Building;
import buildings.DomainFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Troels
 */
@WebServlet( name = "updateBuilding", urlPatterns = { "/updateBuilding" } )
public class UpdateBuilding extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType( "text/html;charset=UTF-8" );
        try ( PrintWriter out = response.getWriter() ) {
            switch ( request.getParameter( "action" ) ) {
                case "Submit":
                    store( request, response );
                    break;
                case "Cancel":
                    break;
            }
            forward( request, response, "buildings.jsp" );
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        try {
            processRequest( request, response );
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateBuilding.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        try {
            processRequest( request, response );
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateBuilding.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void forward( HttpServletRequest req, HttpServletResponse res, String path ) throws IOException, ServletException {
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher( "/" + path );
        rd.forward( req, res );
    }

    private void store( HttpServletRequest request, HttpServletResponse response ) throws ClassNotFoundException {
       // int id = Integer.parseInt( request.getParameter( "id" ) );
        String street = request.getParameter( "street" );
        int zipID = Integer.parseInt( request.getParameter( "zip" ) );
        int floors = Integer.parseInt( request.getParameter( "floor" ) );
        int m2 = Integer.parseInt( request.getParameter( "m2" ) );
        int userID = Integer.parseInt( request.getParameter( "userID" ) );
        int buildingID = Integer.parseInt( request.getParameter( "buildingID" ) );
        
        Building b = new Building(userID,buildingID, zipID, street, m2, floors );
        DomainFacade.updateBuilding( b );
    }
}