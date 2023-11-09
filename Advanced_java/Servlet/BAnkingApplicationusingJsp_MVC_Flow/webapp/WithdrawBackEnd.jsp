<%@ page import="java.sql.Date" %>
<%@ page import="com.example.bankingapplication_mvc_jsp.BankService" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 07-11-2023
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String User_id=session.getAttribute("User_id").toString();

    long value=session.getCreationTime();
    Date date=new java.sql.Date(value);

%>

<jsp:useBean id="Withdraw" class="com.example.bankingapplication_mvc_jsp.TranscationEntity" scope="application"/>

<jsp:setProperty name="Withdraw" property="user_id" value="<%= User_id%>"/>
<jsp:setProperty name="Withdraw" property="transaction_date" value="<%= date%>"/>
<jsp:setProperty name="Withdraw" property="amount" param="amount"/>
<jsp:setProperty name="Withdraw" property="transaction_type" value="Withdraw"/>


<%

    BankService bankService=new BankService();
    bankService.withdrawAmount(Withdraw);
    if(bankService.withdrawAmount(Withdraw)!=0){
        out.println("<center> <h1> Amount Withdraw Successfully....!!!</h1></center>");
    }
    else {
        out.println("<center> <h1> Amount Can not  Withdraw...!!!</h1></center>");
    }

%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
