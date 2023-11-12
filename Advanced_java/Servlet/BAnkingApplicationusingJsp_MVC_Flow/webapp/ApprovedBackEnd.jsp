<%@ page import="com.example.bankingapplication_mvc_jsp.BankService" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 09-11-2023
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="registration" class="com.example.bankingapplication_mvc_jsp.CustomerDetailEntity" scope="application"/>
<jsp:useBean id="admin" class="com.example.bankingapplication_mvc_jsp.Admin" scope="application"/>

<jsp:setProperty name="registration" property="approved_at" value="<%=new java.sql.Timestamp(session.getCreationTime())%>"/>

<%
  String user_Id = request.getParameter("user_id");
  session.setAttribute("admin_id",admin.getUserName());
%>
<jsp:setProperty name="bank" property="approved_by" value='<%=session.getAttribute("admin_id")%>'/>

<%
BankService serviceClass = new BankService();
  if(serviceClass.approvedRegistration(registration,user_Id)!=0){
    response.sendRedirect("AdminBAckEnd.jsp");
  }else{
    out.println("failed to approved");
  }
%>
<html>
<head>
  <title>Title</title>
</head>
<body>

</body>
</html>
