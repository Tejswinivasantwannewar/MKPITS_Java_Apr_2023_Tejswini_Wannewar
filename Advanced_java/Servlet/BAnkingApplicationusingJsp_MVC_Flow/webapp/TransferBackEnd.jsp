<%@ page import="java.sql.Date" %>
<%@ page import="com.example.bankingapplication_mvc_jsp.BankService" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 08-11-2023
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%


    String User_id=session.getAttribute("User_id").toString();

    long value = session.getCreationTime();
    Date date=new java.sql.Date(value);


%>

<jsp:useBean id="transfer" class="com.example.bankingapplication_mvc_jsp.TranscationEntity" scope="application"/>

<jsp:setProperty name="transfer" property="usenameTransfer" param="username"/>
<jsp:setProperty name="transfer" property="user_id" value="<%= User_id%>"/>
<jsp:setProperty name="transfer" property="transaction_date" value="<%=date %>"/>
<jsp:setProperty name="transfer" property="amount" param="amount"/>
<jsp:setProperty name="transfer" property="transaction_type" value="transfer"/>
<jsp:setProperty name="transfer" property="credit" value="Credit"/>
<jsp:setProperty name="transfer" property="debit" value="Debit"/>


<%
    BankService bankService=new BankService();


    if (bankService.transferAmountWithType(transfer)!=0){
        out.println("<center>Amount credited Successfully...!!!</center>");
    }
    else {
        out.println("<center>Unable To Credit Amount...!!!!</center>");
    }
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
