
<%@ page import="com.example.bankingapplication_mvc_jsp.BankService" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %><%--

<%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 08-11-2023
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>




<html>
<head>
    <style>
        body table{
            background: rgb(188,225,228);
            background: -moz-radial-gradient(circle, rgba(188,225,228,0.639093137254902) 0%, rgba(228,232,249,0.8099614845938375) 100%);
            background: -webkit-radial-gradient(circle, rgba(188,225,228,0.639093137254902) 0%, rgba(228,232,249,0.8099614845938375) 100%);
            background: radial-gradient(circle, rgba(188,225,228,0.639093137254902) 0%, rgba(228,232,249,0.8099614845938375) 100%);
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#bce1e4",endColorstr="#e4e8f9",GradientType=1);

        }
    </style>
</head>
<body>

    <%
    BankService bankService=new BankService();
    ResultSet resultSet= bankService.displayStatementTable();
    ResultSetMetaData resultSetMetaData= resultSet.getMetaData();

%>

<html>
<head>
    <title>Display_Table</title>
</head>
<body>
<table border="2"  align="center">
    <tr> <center> <h1>Transaction_Table_inJSP_MVC_flow</h1></center></tr>
    <tr>

        <%
            for (int columnIndex=1;columnIndex<=resultSetMetaData.getColumnCount();columnIndex++)
            {
        %>

        <th><%= resultSetMetaData.getColumnName(columnIndex)%></th>

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
