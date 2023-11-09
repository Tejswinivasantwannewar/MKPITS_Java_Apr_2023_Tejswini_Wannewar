package com.example.bankingapplication_mvc_jsp;
import java.sql.*;




public class BankService {
    Connection connection;

    public BankService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatailsMVC_JSP", "root", "Teju@123");

        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public int insertRecordIntoTable(CustomerDetailEntity custDeatil) throws SQLException {

        int returnValue = 0;

        PreparedStatement preparedStatement = connection.prepareStatement("insert into BankDeatailsMVC_JSP_Table values(?,?,?,?,?,?,?)");
        preparedStatement.setString(1, custDeatil.getUser_id());
        preparedStatement.setString(2, custDeatil.getPassword());
        preparedStatement.setString(3, custDeatil.getName());
        preparedStatement.setString(4, custDeatil.getAddress());
        preparedStatement.setString(5, custDeatil.getCity());
        preparedStatement.setString(6, custDeatil.getMobile_number());
        preparedStatement.setInt(7, Integer.parseInt(custDeatil.getBalance()));

        returnValue= preparedStatement.executeUpdate();
        return returnValue;
    }


    public ResultSet loginRecord(CustomerDetailEntity custDeatil) {

        ResultSet returnLoginvalue=null;

        PreparedStatement preparedStatement= null;
    try {
        preparedStatement = connection.prepareStatement("select  * from BankDeatailsMVC_JSP_Table where  User_id=? and UserPassword=?");

        preparedStatement.setString(1, custDeatil.getUser_id());
        preparedStatement.setString(2, custDeatil.getPassword());
        returnLoginvalue=preparedStatement.executeQuery();
    }
    catch (Exception ex){
        System.out.println(ex);
    }

        return  returnLoginvalue;
    }

    public ResultSet displayTable() throws SQLException {
        ResultSet resultSet=null;
        Statement statement= connection.createStatement();
        resultSet=statement.executeQuery("select * from BankDeatailsMVC_JSP_Table ");

return  resultSet;
    }


    public int depositAmount(TranscationEntity transcationEntity){
        int result=0;
        try {
            PreparedStatement preparedInsertStatement = connection.prepareStatement("insert into Transactions_MVC_JSP values(?,?,?,?)");
            preparedInsertStatement.setString(1,transcationEntity.getUser_id());
            preparedInsertStatement.setDate(2, transcationEntity.getTransaction_date());
            preparedInsertStatement.setInt(3,transcationEntity.getAmount());
            preparedInsertStatement.setString(4,transcationEntity.getTransaction_type());
            result = preparedInsertStatement.executeUpdate();

            PreparedStatement preparedStatement = connection.prepareStatement("update BankDeatailsMVC_JSP_Table set Customer_Balance=Customer_Balance+? where User_id=?");
            preparedStatement.setInt(1,transcationEntity.getAmount());
            preparedStatement.setString(2, transcationEntity.getUser_id());
            result = preparedStatement.executeUpdate();


        }catch (Exception e){
            System.out.println(e);
        }
        return result;




    }

    public int withdrawAmount(TranscationEntity transcationEntity) throws SQLException {
        int returnValue=0;
        try {
        PreparedStatement preparedStatement1 = connection.prepareStatement("insert into Transactions_MVC_JSP values(?,?,?,?) ");
        preparedStatement1.setString(1,transcationEntity.getUser_id());
        preparedStatement1.setDate(2,transcationEntity.getTransaction_date());
        preparedStatement1.setInt(3,transcationEntity.getAmount());
        preparedStatement1.setString(4,transcationEntity.getTransaction_type());

        returnValue=preparedStatement1.executeUpdate();



        PreparedStatement preparedStatement= connection.prepareStatement("update BankDeatailsMVC_JSP_Table set Customer_Balance=Customer_Balance-? where  User_id=? ");
        preparedStatement.setInt(1,transcationEntity.getAmount());
        preparedStatement.setString(2,transcationEntity.getUser_id());

        returnValue=preparedStatement.executeUpdate();


        }catch (Exception e){
            System.out.println(e);
        }
        return  returnValue;


    }
    public ResultSet displayStatementTable() throws SQLException {
        ResultSet resultSet=null;
        Statement statement= connection.createStatement();
        resultSet=statement.executeQuery("select * from Transactions_MVC_JSP ");

        return  resultSet;
    }
    public int transferAmountWithType(TranscationEntity transcationEntity){
        int result=0;

        try {

            PreparedStatement preparedStatementTransfer= connection.prepareStatement("insert into Transactions_MVC_JSP values (?,?,?,?)");
            preparedStatementTransfer.setString(1,transcationEntity.getUsenameTransfer());
            preparedStatementTransfer.setDate(2,transcationEntity.getTransaction_date());
            preparedStatementTransfer.setInt(3,transcationEntity.getAmount());
            preparedStatementTransfer.setString(4,transcationEntity.getCredit());

            result=preparedStatementTransfer.executeUpdate();


         PreparedStatement preparedStatement=connection.prepareStatement("update BankDeatailsMVC_JSP_Table set Customer_Balance=Customer_Balance+? where User_id=?");
         preparedStatement.setInt(1,transcationEntity.getAmount());
         preparedStatement.setString(2,transcationEntity.getUsenameTransfer());
         result=preparedStatement.executeUpdate();


            PreparedStatement preparedStatementTransfer1= connection.prepareStatement("insert into Transactions_MVC_JSP values (?,?,?,?)");
            preparedStatementTransfer1.setString(1,transcationEntity.getUser_id());
            preparedStatementTransfer1.setDate(2,transcationEntity.getTransaction_date());
            preparedStatementTransfer1.setInt(3,transcationEntity.getAmount());
            preparedStatementTransfer1.setString(4,transcationEntity.getDebit());

            result=preparedStatementTransfer1.executeUpdate();


            PreparedStatement preparedStatement1=connection.prepareStatement("update BankDeatailsMVC_JSP_Table set Customer_Balance=Customer_Balance-? where User_id=?");
            preparedStatement1.setInt(1,transcationEntity.getAmount());
            preparedStatement1.setString(2,transcationEntity.getUser_id());
            result=preparedStatement1.executeUpdate();


        }catch (Exception e){
            System.out.println(e);
        }


        return result;

    }

}
