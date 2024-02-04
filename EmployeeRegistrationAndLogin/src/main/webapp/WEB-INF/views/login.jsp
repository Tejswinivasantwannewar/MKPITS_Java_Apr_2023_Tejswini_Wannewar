<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        body {
            background: rgb(178, 135, 181);
            background: -moz-linear-gradient(90deg, rgba(178, 135, 181, 0.5130427170868348) 3%, rgba(155, 151, 219, 0.26934523809523814) 100%);
            background: -webkit-linear-gradient(90deg, rgba(178, 135, 181, 0.5130427170868348) 3%, rgba(155, 151, 219, 0.26934523809523814) 100%);
            background: linear-gradient(90deg, rgba(178, 135, 181, 0.5130427170868348) 3%, rgba(155, 151, 219, 0.26934523809523814) 100%);
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#b287b5", endColorstr="#9b97db", GradientType=1);
            padding-top: 50px;
        }

        h2 {
            color: #333;
           text-align: center;
        }
        button{
            color: white;
            text-decoration: none;
        }

        form {
            max-width: 300px;
            margin: 0 auto;
            background: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        p{
            text-align: center;
            color: red;
        }
        a{
            color: white;
            text-decoration: none;
        }


    </style>

</head>
<body>
<h2>Login</h2>
<% if (request.getParameter("error") != null) { %>
<p >Invalid credentials. Please try again.</p>
<% } %>
<form action="/login" method="post">
    <label for="loginId">Login ID:</label><br>
    <input type="text" id="loginId" name="loginId"><br>
    <label for="password">Password:</label><br>
    <input type="password" id="password" name="employeePassword"><br><br>&nbsp;
    <button type="submit" class="btn btn-primary btn-block">Login</button>

    <button type="button" class="btn btn-primary btn-block"><a href="/registration-list" >List</a></button>

</form>
</body>
</html>