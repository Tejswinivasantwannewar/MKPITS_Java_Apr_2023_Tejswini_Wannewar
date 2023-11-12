<%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 09-11-2023
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container col-lg-4 p-5 text-dark main">
    <h2 class="text-center" class="mb-3 mt-3">Admin Page</h2>
    <form action="AdminBAckEnd.jsp" method="post">
        <label>Username : </label>
        <input type="text" name="User_Id_Admin" class="form-control">
        <br>
        <label>Password : </label>
        <input type="password" name="Password_Admin" class="form-control">
        <br>
        <div align="center">
            <br>
            <input type="submit" value="Login" class="btn btn-success w-50 mb-2">
            <br>
        </div>
    </form>
</div>
</body>
</html>
