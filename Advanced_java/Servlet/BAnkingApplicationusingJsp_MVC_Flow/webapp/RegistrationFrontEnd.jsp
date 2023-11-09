<%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 06-11-2023
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>

<head>
    <title>Registration Front View</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>

<body>
<h1><center>REGISTRATION FORM</center></h1>

<div>

    <form action="RegistrationBackEnd.jsp" method="post"  >

        <table border="10" cellpadding="10" align="center"  class="table-primary"  >

            <tr class="table-secondary">
                <td>
                    <label> <h6>User_Id</h6></label>
                    <input type="text" name="userid"><br><br><br>
                </td>
            </tr>
            <tr>
                <td>
                    <label>  <h6>PassWord</h6></label>
                    <input type="text" name="Passsword"><br><br><br>
                </td>
            </tr>

            <tr>
                <td>
                    <label>   <h6>Name</h6>  </label>
                    <input type="text" name="name"><br><br><br>
                </td>
            </tr>

            <tr>
                <td>
                    <label>  <h6>Address</h6></label>
                    <input type="text" name="Address"><br><br><br>

                </td>
            </tr>

            <tr>
                <td>
                    <label> <h6>City</h6> </label>
                    <input type="text" name="City"><br><br><br>
                </td>
            </tr>

            <tr>
                <td>
                    <label> <h6>Mobile_Number</h6> </label>
                    <input type="text" name="Mobile_no"><br><br><br>
                </td>
            </tr>


            <tr>
                <td>
                    <label> <h6>Balance</h6> </label>
                    <input type="text" name="Balance"><br><br><br>
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
