<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<div>

  <form action="myjsp.jsp" method="post"  >
    <table border="5" cellpadding="10" align="center" cellspacing="2" class="table-primary">
      <tr class="table-secondary">
        <td>
          <label>  Roll_no</label>
          <input type="text" name="roll_no"><br><br><br>
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
        <td align="center">
          <div>
            <input type="submit" name="value">
          </div>
        </td>
      </tr>

    </table>

  </form>

</div>


</body>
</html>