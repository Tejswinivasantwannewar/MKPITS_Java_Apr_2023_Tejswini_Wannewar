/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tejswini
 */
public class connectionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("userid");
        String name = request.getParameter("Name");
        String custAddress = request.getParameter("address");
        String Cust_city = request.getParameter("city");
        String mobileNo = request.getParameter("mobile");
        String email = request.getParameter("email");
        int custBalance = Integer.parseInt(request.getParameter("balance"));
        String CustPass = request.getParameter("password");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("driver load");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatails", "root", "Teju@123");
            out.println("Establish connection");
            
      

            PreparedStatement preparedStatement = connection.prepareStatement("insert into CustomerDeatails values (?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, custAddress);
            preparedStatement.setString(4, Cust_city);
            preparedStatement.setString(5, mobileNo);
            preparedStatement.setString(6, email);
            preparedStatement.setInt(7, custBalance);
            preparedStatement.setString(8, CustPass);
            
            int returnValue =preparedStatement.executeUpdate();
            if(returnValue!=0){
                out.println("Inserted  Record");    
            }
            else{
                out.println("unable to insert record");
            }
            

        } catch (Exception ex) {
            out.println(ex);
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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

}
