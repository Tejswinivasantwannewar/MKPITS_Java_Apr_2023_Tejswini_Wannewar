<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee Registration</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: rgb(178, 135, 181);
            background: -moz-linear-gradient(90deg, rgba(178, 135, 181, 0.5130427170868348) 3%, rgba(155, 151, 219, 0.26934523809523814) 100%);
            background: -webkit-linear-gradient(90deg, rgba(178, 135, 181, 0.5130427170868348) 3%, rgba(155, 151, 219, 0.26934523809523814) 100%);
            background: linear-gradient(90deg, rgba(178, 135, 181, 0.5130427170868348) 3%, rgba(155, 151, 219, 0.26934523809523814) 100%);
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#b287b5", endColorstr="#9b97db", GradientType=1);
            padding-top: 50px;
        }

        .container {
            max-width: 500px;
            margin: 0 auto;
            background: rgb(180,147,203);
            background: -moz-linear-gradient(0deg, rgba(180,147,203,1) 24%, rgba(166,153,204,1) 54%);
            background: -webkit-linear-gradient(0deg, rgba(180,147,203,1) 24%, rgba(166,153,204,1) 54%);
            background: linear-gradient(0deg, rgba(180,147,203,1) 24%, rgba(166,153,204,1) 54%);
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#b493cb",endColorstr="#a699cc",GradientType=1);
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }

        .form-group label {
            font-size: 18px;
        }

        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }

        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #0056b3;
        }

        .btn-block {
            display: block;
            width: 100%;
        }
    </style>
</head>
<body>
<div class="container" mt-5>
    <h2 class="text-center mb-4">Employee Registration Form</h2>
    <form action="/register" method="post">
        <div class="form-group">
            <label for="employeeName">Name:</label>
            <input type="text" class="form-control" id="employeeName" name="employeeName" required>
        </div>
        <div class="form-group">
            <label for="dateOfBirth">Date of Birth:</label>
            <input type="date" class="form-control" id="dateOfBirth" name="dateOfBirth" required>
        </div>
        <div class="form-group">
            <label for="gender">Gender:</label>
            <select class="form-control" id="gender" name="gender" required>
                <option value="">Select Gender</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <input type="text" class="form-control" id="address" name="address" required>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="city">City:</label>
                <input type="text" class="form-control" id="city" name="city" required>
            </div>
            <div class="form-group col-md-6">
                <label for="state">State:</label>
                <input type="text" class="form-control" id="state" name="state" required>
            </div>
        </div>
        <div class="form-group">
            <label for="loginId">Login ID:</label>
            <input type="text" class="form-control" id="loginId" name="loginId" required>
        </div>
        <div class="form-group">
            <label for="employeePassword">Password:</label>
            <input type="password" class="form-control" id="employeePassword" name="employeePassword" required>
        </div>
        <button type="submit" class="btn btn-primary btn-block">Register</button>
    </form>
</div>
</body>
</html>
