<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 02-11-2023
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  String id=request.getParameter("userId");
  String pass=request.getParameter("password");

  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatails", "root", "Teju@123");

    PreparedStatement preparedStatement=connection.prepareStatement("select * from CustomerDeatails where User_id=? and UserPassword=?");

    preparedStatement.setString(1,id);
    preparedStatement.setString(2,pass);

    ResultSet resultSet= preparedStatement.executeQuery();

    if (resultSet.next()){
        out.println("<h1>Login Successfully..!!!</h1>");
    }
    else {
        out.println("<h1> Can Not Login...!!!</h1>");
    }

%>

<html>
<head>
    <title>Login Page Connectivity</title>
</head>
<body>

</body>
</html>
