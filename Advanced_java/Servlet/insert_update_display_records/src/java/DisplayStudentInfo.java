/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class DisplayStudentInfo extends HttpServlet {

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
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","Anaisha160421");
            out.println("Connection established");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student_info");
             out.println("<!DOCTYPE html>");
                   out.println("<html>");
                   out.println("<head>");
                   out.println("<title>Servlet DisplayStudentInfo</title>");            
                   out.println("</head>");
                   out.println("<body>");
                   out.println("<center><h1>Student Details</h1></center>");
                   out.println("<table border cellspacing=0 cellpadding=10 align=center>"
                    + "<tr>"
                    + "<th>Roll No.</th>"
                    +"<th>Name</th>"
                    +"<th>Address</th>"
                    +"<th>Contact No.</th>"
                    +"</tr>");
            while (resultSet.next()){ 

                    out.println("<tr>"
                    +"<td>"+resultSet.getString(1)+"</td>"
                    +"<td>"+resultSet.getString(2)+"</td>"
                    +"<td>"+resultSet.getString(3)+"</td>"
                    +"<td>"+resultSet.getString(4)+"</td>"
                    + "</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

        } catch (Exception e) {
            System.out.println(e);
        }
            /* TODO output your page here. You may use following sample code. */

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