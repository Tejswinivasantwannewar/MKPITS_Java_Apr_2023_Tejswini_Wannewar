<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="com.example.bankingapplication_mvc_jsp.BankService" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 06-11-2023
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="login" class="com.example.bankingapplication_mvc_jsp.CustomerDetailEntity" scope="application"/>


<jsp:setProperty name="login" property="user_id" param="userId"/>
<jsp:setProperty name="login" property="password" param="password"/>


<%
    BankService bankService=new BankService();

    ResultSet resultSet=bankService.loginRecord(login);

if (resultSet.next()){

  request.getSession(true);

session.setAttribute("User_id",login.getUser_id());

RequestDispatcher requestDispatcher= request.getRequestDispatcher("DisplayFrontEnd.jsp");
requestDispatcher.forward(request,response);

    out.println("Login Successfully...!!!");

}
else {
    out.println("Can not Login.......!!!");
}

%>




<html>
<head>
    <title>Login_Jsp</title>
</head>
<body>

</body>
</html>
