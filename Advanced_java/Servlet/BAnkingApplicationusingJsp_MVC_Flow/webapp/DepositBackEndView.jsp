

<%@ page import="com.example.bankingapplication_mvc_jsp.BankService" %>
<%@ page import="java.sql.Date" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 07-11-2023
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String user_Id= session.getAttribute("User_id").toString();

    long value= session.getCreationTime();
    Date date=new java.sql.Date(value);




%>

<jsp:useBean id="Deposit" class="com.example.bankingapplication_mvc_jsp.TranscationEntity" scope="application"/>

<jsp:setProperty name="Deposit" property="user_id" value="<%= user_Id%>"/>
<jsp:setProperty name="Deposit" property="transaction_date" value="<%=date%>"/>
<jsp:setProperty name="Deposit" property="amount" param="amount"/>
<jsp:setProperty name="Deposit" property="transaction_type" value="Deposit"/>


<%--<jsp:setProperty name="Deposit" property="user_id" param="amount"/>--%>
<%--<jsp:setProperty name="Deposit" property="transaction_date" value="<%= new java.sql.Date(session.getCreationTime())%>"/>--%>
<%--<jsp:setProperty name="Deposit" property="transaction_type" value="Deposit"/>--%>
<%--<jsp:setProperty name="Deposit" property="user_id" value="<%= session.getAttribute("User_id")%>"/>--%>

<%
   BankService bankService=new BankService();
   bankService.depositAmount(Deposit);
   if (bankService.depositAmount(Deposit)!=0){
       out.println("<center><h1>Amount Deposited Successfully...!!</h1></center>");
   }
   else {
       out.println("<center><h1>Amount  Can not Deposited ...!!</h1></center>");

   }
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
