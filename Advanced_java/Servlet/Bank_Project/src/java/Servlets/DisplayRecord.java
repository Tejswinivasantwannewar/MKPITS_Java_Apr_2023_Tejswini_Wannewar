/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tejswini
 */
public class DisplayRecord extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    
    static Connection connection;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatails", "root", "Teju@123");
            out.println("connection established...............!!!");
            
            HttpSession httpSession = request.getSession(true);
//            String username = httpSession.getAttribute("user_id").toString();
            out.println("<h2>UserId : "+httpSession.getAttribute("user_id").toString()+"</h2>");
            
            PreparedStatement preparedStatement = connection.prepareCall("select Transaction_date,Amount,Transaction_type from Transactions where User_Id=?");
            preparedStatement.setString(1, httpSession.getAttribute("user_id").toString());
            ResultSet resultSet = preparedStatement.executeQuery();
            
           
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayRecord</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border cellpadding=8>");
            out.println("<tr>"
                    + "<td>Transaction_date</td>"
                    + "<td>Amount</td>"
                    + "<td>Transaction_Type</td>"
                    + "</tr>");
            while(resultSet.next()){
                out.println("<tr>"
                        + "<td>"+resultSet.getDate(1)+"</td>"
                        + "<td>"+resultSet.getInt(2)+"</td>"
                        + "<td>"+resultSet.getString(3)+"</td>"        
                        + "</tr>");
                
                
                
            }
          
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            
              
              preparedStatement=connection.prepareStatement("select Customer_Balance from CustomerDeatails where User_id=? ");
              preparedStatement.setString(1, httpSession.getAttribute("user_id").toString());
              ResultSet   resultSetTotalAmount = preparedStatement.executeQuery();
            
             if(resultSetTotalAmount.next()){
                 
                out.println("<h2 align=center>Total Balance :" +resultSetTotalAmount.getLong(1)+ "</h2>");
            }
            else
            {
                    out.println("Unable to calculate the balance");
            }
             
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
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DisplayRecord.class.getName()).log(Level.SEVERE, null, ex);
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

}
