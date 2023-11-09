<%@ page import="com.example.bankingapplication_mvc_jsp.CustomerDetailEntity" %>
<%@ page import="com.example.bankingapplication_mvc_jsp.BankService" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 06-11-2023
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="registration" class="com.example.bankingapplication_mvc_jsp.CustomerDetailEntity" scope="application"/>

<jsp:setProperty name="registration" property="user_id" param="userid"/>
<jsp:setProperty name="registration" property="password" param="Passsword"/>
<jsp:setProperty name="registration" property="name" param="name"/>
<jsp:setProperty name="registration" property="address" param="Address"/>
<jsp:setProperty name="registration" property="city" param="City"/>
<jsp:setProperty name="registration" property="mobile_number"  param="Mobile_no"/>
<jsp:setProperty name="registration" property="balance" param="Balance"/>


<%
    BankService bankService=new BankService();
if (bankService.insertRecordIntoTable(registration)!=0){
    out.println("data inserted successfully....!!!");

}
else{
    out.println("data cannot inserted ............!!!");
}
%>



<html>
<head>
    <title>Registration Back End</title>
</head>
<body>

</body>
</html>
