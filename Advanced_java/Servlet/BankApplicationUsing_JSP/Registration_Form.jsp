<%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 02-11-2023
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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

        button{
            margin-top: 50px;
            width: 100%;
            background-color: #ffffff;
            color: #080710;
            padding: 15px 0;
            font-size: 18px;
            font-weight: 600;
            border-radius: 5px;
            cursor: pointer;
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
<h1>REGISTRATION FORM</h1>

<div>

    <form action="RegistrationInsertData.jsp" method="post"  >
        <table border="0" cellpadding="10" align="center" cellspacing="2" class="table-primary" >
            <tr class="table-secondary">
                <td>
                    <label> User_Id</label>
                    <input type="text" name="userid"><br><br><br>
                </td>
            </tr>

            <tr>
                <td>
                    <label>    Name</label>
                    <input type="text" name="name"><br><br><br>
                </td>
            </tr>

            <tr>
                <td>
                    <label> Address</label>
                    <input type="text" name="Address"><br><br><br>

                </td>
            </tr>

            <tr>
                <td>
                    <label> City</label>
                    <input type="text" name="City"><br><br><br>
                </td>
            </tr>

            <tr>
                <td>
                    <label> Mobile_Number</label>
                    <input type="text" name="Mobile_no"><br><br><br>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Email_id</label>
                    <input type="text" name="EmailId"><br><br><br>
                </td>
            </tr>

            <tr>
                <td>
                    <label> Balance</label>
                    <input type="text" name="Balance"><br><br><br>
                </td>
            </tr>

            <tr>
                <td>
                    <label> PassWord</label>
                    <input type="text" name="Passsword"><br><br><br>
                </td>
            </tr>

            <tr>
                <td align="center">
                    <div>
                        <input type="submit" value="Resgister">
                    </div>
                </td>
            </tr>

        </table>

    </form>

</div>

</body>
</html>
