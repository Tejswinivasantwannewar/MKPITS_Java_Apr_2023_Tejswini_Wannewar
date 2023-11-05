
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 01-11-2023
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--static Connection connection;--%>

<%
    String rollno=request.getParameter("roll_no");
    String name=request.getParameter("name");
    String address=request.getParameter("Address");
    String city=request.getParameter("City");

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetail", "root", "Teju@123");

    PreparedStatement preparedStatement= connection.prepareStatement("insert into StudentInfo values(?,?,?,?)");
    preparedStatement.setString(1,rollno);
    preparedStatement.setString(2,name);
    preparedStatement.setString(3,address);
    preparedStatement.setString(4,city);
    int returnValue=preparedStatement.executeUpdate();

    PrintWriter printWriter=response.getWriter();

    if (returnValue!=0)
        printWriter.println("Inserted data successfully");
    else
        printWriter.println("Record Inserted successfuly ");
%>



<%--     <%= "Inserted Values In table successfully" %>--%>
<%--else--%>
<%--<%= "Values Cannot Inserted Successfully" %>--%>




<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="yourJsp.jsp">Display Your Student Deatils Table</a>
</body>
</html>
