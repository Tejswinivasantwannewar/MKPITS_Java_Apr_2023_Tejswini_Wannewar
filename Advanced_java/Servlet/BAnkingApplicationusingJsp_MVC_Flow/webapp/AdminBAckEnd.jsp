<%@ page import="com.example.bankingapplication_mvc_jsp.BankService" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 09-11-2023
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<jsp:useBean id="admin" class="com.example.bankingapplication_mvc_jsp.Admin" scope="application"/>
<jsp:setProperty name="admin"  property="userName" param="User_Id_Admin"/>
<jsp:setProperty name="admin" property="passWord" param="Password_Admin"/>

<jsp:useBean id="bank" class="com.example.bankingapplication_mvc_jsp.CustomerDetailEntity" scope="application"/>
<%
    BankService bankService=new BankService();
    ResultSet resultSet = bankService.adminLogin(admin);
    if(resultSet.next())
    {
        ResultSet resultSet1 = bankService.displayStatementTable();
        ResultSetMetaData resultSetMetaData = resultSet1.getMetaData();
%>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >

</head>
<body>
<table align="center"  cellpadding="6" class="col-lg-6 mt-3 table table-primary table-hover table-bordered">
    <tr>
            <%
            for(int columnIndex=1; columnIndex<=resultSetMetaData.getColumnCount(); columnIndex++)
            {
            %>

        <th><%=resultSetMetaData.getColumnName(columnIndex)%></th>

            <%
            }
            %>

            <%
    while (resultSet1.next())
         {
           %>

    <tr>
        <td><a href="SingleRecordDisplay.jsp?user_id=<%=resultSet1.getString(1)%>"><%=resultSet1.getString(1)%></></td>
        <td><%=resultSet1.getTimestamp(2)%></td>
        <td><%=resultSet1.getString(3)%></td>
    </tr>

    <%
        }
    %>

    <%
        }else {
            out.println("<h2 align=center>Username or password incorrect</h2>");
        }
    %>
</table>


</body>
</html>
