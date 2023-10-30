///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Servlets;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author tejswini
// */
//public class TransactionPage extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    static Connection connection;
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException, SQLException, ClassNotFoundException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//              Class.forName("com.mysql.cj.jdbc.Driver");
//            out.println("Driver loaded");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatails", "root", "Teju@123");
//            out.println("connection established...............!!!");
//
//            String userID = request.getParameter("user_id");
//            double totalAmount = 0.0;
//            PreparedStatement statement = connection.prepareStatement("SELECT Amount, Transaction_type FROM Transactions WHERE User_Id = ?");
//
//            statement.setString(1, userID);
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                double Amount = resultSet.getDouble("Amount");
//                String transactionType = resultSet.getString("Transaction_type");
//                if ("deposit".equals(transactionType)) {
//                    totalAmount += Amount;
//                } else if ("withdraw".equals(transactionType)) {
//                    totalAmount -= Amount;
//                }
//            }
//
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        try {
//            processRequest(request, response);
//        } catch (SQLException | ClassNotFoundException ex) {
//            Logger.getLogger(TransactionPage.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        try {
//            try {
//                processRequest(request, response);
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(TransactionPage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(TransactionPage.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class TransactionPage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static Connection connection;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String Username = request.getParameter("username");
            int Amount = Integer.parseInt(request.getParameter("amount"));
            
            String credit = "Credit";
            String debit = "Debit";
            
            HttpSession httpSession = request.getSession(true);
            String userId = httpSession.getAttribute("user_id").toString();
            Date date = new java.sql.Date(httpSession.getCreationTime());
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatails", "root", "Teju@123");
            out.println("connection established...............!!!");
           
            PreparedStatement prepareStatementDebit = connection.prepareStatement("insert into Transactions values(?,?,?,?)");
            prepareStatementDebit.setString(1, Username);
            prepareStatementDebit.setDate(2, date);
            prepareStatementDebit.setInt(3, Amount);
            prepareStatementDebit.setString(4, debit);
            int resultSet = prepareStatementDebit.executeUpdate();
            if(resultSet != 0){
                out.println("<h2>Amount debited successfully</h2>");
            }else{
                out.println("Unable to debit amount");
            }
           
            PreparedStatement prepareStatementCredit = connection.prepareStatement("insert into Transactions values(?,?,?,?)");
            prepareStatementCredit.setString(1, userId);
            prepareStatementCredit.setDate(2, date);
            prepareStatementCredit.setInt(3, Amount);
            prepareStatementCredit.setString(4, credit);
            int resultSetcredit = prepareStatementCredit.executeUpdate();
            if(resultSetcredit != 0){
                out.println("<h2>Amount credited successfully</h2>");
            }else{
                out.println("Unable to credit amount");
            }
//           
            PreparedStatement preparedUpdateBalanceOfloginUser = connection.prepareStatement("update CustomerDeatails set Customer_Balance=Customer_Balance-? where User_id=?");
            preparedUpdateBalanceOfloginUser.setString(2, userId);
            preparedUpdateBalanceOfloginUser.setInt(1, Amount);
            int updateBalanceOfLoginUser = preparedUpdateBalanceOfloginUser.executeUpdate();
            if(updateBalanceOfLoginUser != 0){
                out.println("<h2>Balance updated of login user by credit amount</h2>");
            }else{
                out.println("<h2>Unable to update balance of login user account</h2>");
            }
           
            PreparedStatement preparedUpdateBalance = connection.prepareStatement("update CustomerDeatails set Customer_Balance=Customer_Balance+? where User_id=?");
            preparedUpdateBalance.setString(2, Username);
            preparedUpdateBalance.setInt(1, Amount);
            int updateBalance = preparedUpdateBalance.executeUpdate();
            if(updateBalance != 0){
                out.println("<h2>Balance updated of login user by credit amount</h2>");
            }else{
                out.println("<h2>Unable to update balance of login user account</h2>");
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
            Logger.getLogger(TransactionPage.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(TransactionPage.class.getName()).log(Level.SEVERE, null, ex);
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
