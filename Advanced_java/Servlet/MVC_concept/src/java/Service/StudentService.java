/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Controller.Student;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author tejswini
 */


public class StudentService {
    static Connection connection;
    int result=0;

   public StudentService() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
           out.println("Driver loaded");
            
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetail", "root", "Teju@123");
            out.println("connection established...............!!!");
         
   }

   
  
    
    public int insertRecord(Student stud) throws ClassNotFoundException, SQLException{

      
           PreparedStatement preparedStatement = connection.prepareStatement("insert into StudentInfo values(?,?,?,?)");
           preparedStatement.setString(1, stud.getRoll_number());
           preparedStatement.setString(2,stud.getName());
           preparedStatement.setString(3,stud.getAddress());
           preparedStatement.setString(4, stud.getCity());
           result=preparedStatement.executeUpdate();
          
          return result;
    }
    
  
}
