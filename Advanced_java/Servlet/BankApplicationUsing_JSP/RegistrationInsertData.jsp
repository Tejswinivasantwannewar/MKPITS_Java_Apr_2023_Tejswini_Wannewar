<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 02-11-2023
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String id=request.getParameter("userid");
    String name=request.getParameter("name");
    String address=request.getParameter("Address");
    String city=request.getParameter("City");
    String mobilenum=request.getParameter("Mobile_no");
    String emailId=request.getParameter("EmailId");
    int balance=Integer.parseInt(request.getParameter("Balance"));
    String Passs=request.getParameter("Passsword");


    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatails", "root", "Teju@123");

    PreparedStatement preparedStatement=connection.prepareStatement("Insert into CustomerDeatails values (?,?,?,?,?,?,?,?)");
    preparedStatement.setString(1,id);
    preparedStatement.setString(2,name);
    preparedStatement.setString(3,address);
    preparedStatement.setString(4,city);
    preparedStatement.setString(5,mobilenum);
    preparedStatement.setString(6,emailId);
    preparedStatement.setInt(7,balance);
    preparedStatement.setString(8,Passs);

  int returnValue= preparedStatement.executeUpdate();

  if (returnValue!=0){
      out.println("<h1>Data Inserted Successfuly..!!!</h1>");

  }
  else {
      out.println("<h1>Data cannot inserted...!!!</h1>");
  }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
