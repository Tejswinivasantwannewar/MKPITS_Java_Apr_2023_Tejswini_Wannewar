/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class StudentRegistrationServlet extends HttpServlet {

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
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

              String rollNo=  request.getParameter("rollNo");
              String name1=  request.getParameter("name");
              String address1=  request.getParameter("address");
              String mobileNumber= request.getParameter("contactNo");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");
            connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","Anaisha160421");
            out.println("Connection Establish");
        } catch (ClassNotFoundException | SQLException ex) {
            out.println(ex);
        }

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student_info values(?,?,?,?)");
            preparedStatement.setString(1, rollNo);
            preparedStatement.setString(2,name1);
            preparedStatement.setString(3,address1);
            preparedStatement.setString(4,mobileNumber);

            int returnValue = preparedStatement.executeUpdate();
            if(returnValue!=0){
                out.println("Record inserted");
            }else{
                out.println("unable to insert record");
            }
        } catch (SQLException e) {
            out.println(e);
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
