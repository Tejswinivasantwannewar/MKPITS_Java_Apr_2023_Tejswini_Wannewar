<%@ page import="com.example.studentdetail_injsp_mvc_flow.Student" %>
<%@ page import="com.example.studentdetail_injsp_mvc_flow.StudentService" %><%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 03-11-2023
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<jsp:useBean id="s" class="com.example.studentdetail_injsp_mvc_flow.Student" scope="application" />
<jsp:setProperty name="s" property="rollNumber" param="roll_no" />
<jsp:setProperty name="s" property="name" param="name"/>
<jsp:setProperty name="s" property="address" param="Address" />
<jsp:setProperty name="s" property="city" param="City"/>




<%--<jsp:getProperty name="s" property="rollNumber"/>  //ithe pn property lihili tr te screen ve display hote .--%>
<%--<jsp:getProperty name="s" property="name"/>--%>
<%--<jsp:getProperty name="s" property="address"/>--%>
<%--<jsp:getProperty name="s" property="city"/>--%>
<%
    StudentService studentService=new StudentService();


    if (studentService.inserRecord(s)!=0){
        out.println("Data inserted Successfully..!!");

    }

    else
        out.println("Data cannot inserted...!!");

%>

<html>
<head>

</head>
<body>
<a href="yourjsp.jsp">Display Table</a>
</body>
</html>