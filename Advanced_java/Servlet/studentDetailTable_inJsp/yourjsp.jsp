<%@ page import="com.example.studentdetail_injsp_mvc_flow.StudentService" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 03-11-2023
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

    StudentService studentService=new StudentService();
     ResultSet resultSet=studentService.getRecord();
    ResultSetMetaData resultSetMetaData=resultSet.getMetaData();



%>




<html>
<head>



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
</body>
</html>
