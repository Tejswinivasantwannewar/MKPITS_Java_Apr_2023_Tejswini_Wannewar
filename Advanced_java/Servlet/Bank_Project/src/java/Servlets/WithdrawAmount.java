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
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tejswini
 */
public class WithdrawAmount extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          int Withdraw = Integer.parseInt(request.getParameter("withdraw"));
            
            String transactionType = "Withdraw";
            HttpSession httpSession = request.getSession(true);
            
            String UserName = httpSession.getAttribute("user_id").toString();
            
            Date date = new java.sql.Date(httpSession.getCreationTime());
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");
            
          Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatails", "root", "Teju@123");
            out.println("connection established...............!!!");
           
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Transactions values(?,?,?,?)");
            preparedStatement.setString(1, UserName);
            preparedStatement.setDate(2, date);
            preparedStatement.setInt(3, Withdraw);
            preparedStatement.setString(4, transactionType);
            int returnValue = preparedStatement.executeUpdate();
           
            if(returnValue!= 0){
                out.println("<center><h2>Amount withdraw done  successfully.............!!!</h2></center>");
            }else{
                out.println("<center><h2>Unable to insert amount.............!!!</h2></center>");
            }
           
            PreparedStatement preparedUpdateStatement = connection.prepareStatement("update CustomerDeatails set Customer_Balance=Customer_Balance-? where user_id=?");
            preparedUpdateStatement.setString(2, UserName);
            preparedUpdateStatement.setInt(1, Withdraw);
            
            int updateReturnValue= preparedUpdateStatement.executeUpdate();
            if(updateReturnValue != 0){
                out.println("<center><h2>Balance updated.........!!!</h2></center>");
            }else{
                out.println("<center><h2>Unable to update the Balance...........!!!</h2></center>");
            }
           
        }
        catch (Exception ex) {
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
