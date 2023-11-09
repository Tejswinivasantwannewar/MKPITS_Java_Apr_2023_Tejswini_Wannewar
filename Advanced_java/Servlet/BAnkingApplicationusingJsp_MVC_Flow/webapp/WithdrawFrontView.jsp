<%--
  Created by IntelliJ IDEA.
  User: tejswini
  Date: 07-11-2023
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>




<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
<style>
    div {
        background: rgb(181,181,210);
        background: -moz-radial-gradient(circle, rgba(181,181,210,0.639093137254902) 0%, rgba(184,188,221,0.4990371148459384) 100%);
        background: -webkit-radial-gradient(circle, rgba(181,181,210,0.639093137254902) 0%, rgba(184,188,221,0.4990371148459384) 100%);
        background: radial-gradient(circle, rgba(181,181,210,0.639093137254902) 0%, rgba(184,188,221,0.4990371148459384) 100%);
        filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#b5b5d2",endColorstr="#b8bcdd",GradientType=1);
    }
    .main{
        border: 3px solid black;
        box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
        border-radius: 10px;
    }
    form *{
        font-family: 'Poppins',sans-serif;
        color: #080710;
        letter-spacing: 0.5px;
        outline: none;
        border: none;
    }
    body div form {
        background: rgb(15,29,170);
        background: -moz-linear-gradient(90deg, rgba(15,29,170,0.42620798319327735) 5%, rgba(231,247,227,0.18531162464985995) 49%, rgba(11,28,149,0.17130602240896353) 94%);
        background: -webkit-linear-gradient(90deg, rgba(15,29,170,0.42620798319327735) 5%, rgba(231,247,227,0.18531162464985995) 49%, rgba(11,28,149,0.17130602240896353) 94%);
        background: linear-gradient(90deg, rgba(15,29,170,0.42620798319327735) 5%, rgba(231,247,227,0.18531162464985995) 49%, rgba(11,28,149,0.17130602240896353) 94%);
        filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#0f1daa",endColorstr="#0b1c95",GradientType=1);
    }

</style>
</head>
<body>
<div class="container mt-5 mb-4 col-lg-4 p-5 main" align="center">
    <form action="WithdrawBackEnd.jsp" method="post">
        <br>
        <br>
        <label><h3>Amount :</h3></label>
        <br>
        <input type="number" name="amount">
        <br>
        <br>

            <input type="submit" value="Withdraw" class="btn btn-primary fs-5 text-white" align="center">
        <br>
        <br>
    </form>
</div>
</body>
</html>


