<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title> Banking Application Mvc_Flow in jsp</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <style>
    body div form {
      background: rgb(161,214,219);
      background: -moz-linear-gradient(90deg, rgba(161,214,219,1) 19%, rgba(181,198,201,1) 91%);
      background: -webkit-linear-gradient(90deg, rgba(161,214,219,1) 19%, rgba(181,198,201,1) 91%);
      background: linear-gradient(90deg, rgba(161,214,219,1) 19%, rgba(181,198,201,1) 91%);
      filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#a1d6db",endColorstr="#b5c6c9",GradientType=1);

    }
    form {

      height: 500px;
      width: 600px;
      background-color: rgba(255,255,255,0.13);
      position: absolute;
      transform: translate(-50%,-50%);
      top: 50%;
      left: 50%;
      border-radius: 10px;
      backdrop-filter: blur(10px);
      border: 2px solid rgba(255,255,255,0.1);
      box-shadow: 0 0 40px rgba(8,7,16,0.6);
      padding: 50px 35px;
    }
    input{
      display: block;
      height: 50px;
      width: 100%;
      background-color: rgba(255,255,255,0.07);
      border-radius: 3px;
      padding: 0 10px;
      margin-top: 8px;
      font-size: 14px;
      font-weight: 300;
    }


    form *{
      font-family: 'Poppins',sans-serif;
      color: #080710;
      letter-spacing: 0.5px;
      outline: none;
      border: none;
    }
  </style>


</head>
<body>
<h1> <center>LOGIN FORM</center></h1>

<div class="container col-lg-6" >

  <form action="LoginJsp.jsp" method="post"  >

    <table border="0" cellpadding="10" align="center" cellspacing="2" class="table-primary" >
      <tr class="table-secondary">
        <td colspan="2">
          <label>  <h5>User_Id</h5></label><br>
          <input type="text" name="userId" class="form-control"> <br>
        </td>
      </tr>

      <tr>

        <td colspan="2">
          <label> <h5>PassWord</h5></label>
          <input type="text" name="password" class="form-control"><br>
        </td>

      </tr>

      <td>  <button type="submit" class="btn btn-dark btn-lg">LogIn</button></td>
      <td>  <button type="submit" class="btn btn-dark btn-lg"><a href="RegistrationFrontEnd.jsp"> Registration</a></button>   </td>


    </table>

  </form>

</div>

</body>
</html>