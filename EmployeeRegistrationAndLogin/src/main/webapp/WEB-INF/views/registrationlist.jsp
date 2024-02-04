<%@ page import="com.example.EmployeeRegistrationAndLogin.model.Employee" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee Registration List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
        body {
            font-family: Arial, sans-serif;
            background: rgb(178,135,181);
            background: -moz-linear-gradient(90deg, rgba(178,135,181,0.5130427170868348) 3%, rgba(155,151,219,0.26934523809523814) 100%);
            background: -webkit-linear-gradient(90deg, rgba(178,135,181,0.5130427170868348) 3%, rgba(155,151,219,0.26934523809523814) 100%);
            background: linear-gradient(90deg, rgba(178,135,181,0.5130427170868348) 3%, rgba(155,151,219,0.26934523809523814) 100%);
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#b287b5",endColorstr="#9b97db",GradientType=1);
        }

        h2 {
            color: #333;
            text-align: center;
        }

        table {
            width: 50%;
            padding: 50px;
            margin-right: 50px;
table-border-color-dark: indigo;

        }




    </style>
    <!-- Include any necessary CSS or JS files here -->
</head>
<body>
<h2>Employee Registration List</h2>
<table border="5" class="table table-secondary  table-striped-columns  table-bordered  table-hover">

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Date of Birth</th>
        <th>Gender</th>
        <th>Address</th>
        <th>City</th>
        <th>State</th>
        <th>Login ID</th>
        <th>Password</th>
        <th>Delete Action</th>
    </tr>
    <% if (request.getAttribute("employeeList") != null && !((List<Employee>)request.getAttribute("employeeList")).isEmpty()) { %>
    <% for (Employee employee : (List<Employee>)request.getAttribute("employeeList")) { %>
    <tr>
        <td><%= employee.getId() %></td>
        <td><%= employee.getEmployeeName() %></td>
        <td><%= employee.getDateOfBirth() %></td>
        <td><%= employee.getGender() %></td>
        <td><%= employee.getAddress()%></td>
        <td><%= employee.getCity() %></td>
        <td><%= employee.getState() %></td>
        <td><%= employee.getLoginId() %></td>
        <td><%= employee.getEmployeePassword() %></td>
        <td>
            <a href="/delete/<%= employee.getId() %>">Delete</a>
        </td>
    </tr>
    <% } %>
    <% } else { %>
    <tr>
        <td colspan="9">No employees found</td>
    </tr>
    <% } %>
</table>
</body>
</html>
