<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Login Success</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/src/main/webapp/resources/style/login.css">
  <style>
    body {
      background: rgb(178, 135, 181);
      background: -moz-linear-gradient(90deg, rgba(178, 135, 181, 0.5130427170868348) 3%, rgba(155, 151, 219, 0.26934523809523814) 100%);
      background: -webkit-linear-gradient(90deg, rgba(178, 135, 181, 0.5130427170868348) 3%, rgba(155, 151, 219, 0.26934523809523814) 100%);
      background: linear-gradient(90deg, rgba(178, 135, 181, 0.5130427170868348) 3%, rgba(155, 151, 219, 0.26934523809523814) 100%);
      filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#b287b5", endColorstr="#9b97db", GradientType=1);
      padding-top: 50px;
    }

    h1 {
      color: #333;
      text-align: center;
    }

    h2 {
      color: #007bff;
      text-align: center;
    }
  </style>
</head>
<body>
<h1>Welcome ${empName}</h1>
<h2>Login Successful</h2>
<!-- Add any content you want to display after successful login -->
</body>
</html>
