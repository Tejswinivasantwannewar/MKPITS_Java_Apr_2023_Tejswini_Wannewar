<%@ page import="java.sql.*" %>

<%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 02-11-2023
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetail", "root", "Teju@123");

    Statement statement= connection.createStatement();

    ResultSet resultSet= statement.executeQuery("select * from StudentInfo ");

   ResultSetMetaData resultSetMetaData= resultSet.getMetaData();

%>



<html>
<head>
    <title>Student_Details Jsp </title>
</head>
<body>

<table border="1" align="center" >
    <tr>
        <center><h1>Student Details</h1></center>
    </tr>

    <tr>
       <%
           for(int columnIndex=1;columnIndex<=resultSetMetaData.getColumnCount();columnIndex++)
           {
       %>

        <th><%= resultSetMetaData.getColumnName(columnIndex) %> </th>

        <%
            }
        %>

    </tr>

   <%
       while (resultSet.next())
       {
   %>

    <tr>
        <td><%= resultSet.getString(1)%></td>
        <td><%= resultSet.getString(2)%></td>
        <td><%= resultSet.getString(3)%></td>
        <td><%= resultSet.getString(4)%></td>
    </tr>


    <%
        }
    %>

</table>
</body>
</html>
