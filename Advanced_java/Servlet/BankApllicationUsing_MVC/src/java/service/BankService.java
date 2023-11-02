/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controller.RegistrationController;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author tejswini
 */
public class BankService {
    static Connection connection;
     int result=0;
    public BankService() throws ClassNotFoundException, SQLException{
        
         Class.forName("com.mysql.cj.jdbc.Driver");
           out.println("Driver loaded");
            
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatailsMVC", "root", "Teju@123");
            out.println("connection established...............!!!");
    }
    
    public int  insertRecordInBank(RegistrationController rs) throws SQLException{
           
        PreparedStatement preparedStatement = connection.prepareStatement("insert into BankDeatailsMVCTable values(?,?,?,?,?,?,?)");
        
           preparedStatement.setString(1, rs.getUserId());
           preparedStatement.setString(2, rs.getPassword());
           preparedStatement.setString(3, rs.getName());
           preparedStatement.setString(4, rs.getAddress());
           preparedStatement.setString(5, rs.getCity());
           preparedStatement.setString(6, rs.getMobile());
           preparedStatement.setInt(7, rs.getBalance());
           result=preparedStatement.executeUpdate();
           
          return result; 
    }
    
    
    
    
}
