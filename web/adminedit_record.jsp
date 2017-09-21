<%-- 
    Document   : adminedit_record
    Created on : Aug 17, 2017, 4:25:53 AM
    Author     : vinet
--%>


<%@page import ="com.bin.*"%>
<%
    int rollno = Integer.parseInt(request.getParameter("edit"));
    service ser = new service();
    binclass binobj = ser.view_details_admin(rollno);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign_in_teacher</title>
        <style>       
            .container
            {
                margin-top: 50px;
                margin-left: 50px;
                height: 100%;
                width: 100%;
            }
            input
            {
                margin :5px;
                border-radius: 4px;
            }
        </style>
</head>
<body style="margin:0px; background-color: wheat">
    <h1>Student Info</h1>
    <div class="container">
        <form action="controler_signup.jsp" method="get">
            <table>
                <tr>
                    <td><b>First Name</b></td>
                    <td><input type="text"class="form-control" name="fname" id="name" required="enter First name" value="<%=binobj.getFname()%>"></input></td>
                </tr>
                <tr>
                    <td><b>Last Name</b></td>
                    <td><input type="text"class="form-control" name="lname"  required= "enter last name" value="<%=binobj.getLname()%>"></input></td>
                </tr>
                <tr>
                    <td><b>Email</b></td>
                    <td><input type="email"class="form-control" name="userid" required="enter email" value="<%=binobj.getUserid()%>"></input></td>
                </tr>
                <tr>
                    <td><b>roll_no</b></td>
                    <td><input type="number" class="form-control"name="rollno" required=" enter address" value="<%=binobj.getRollno()%>" disabled></input></td>
                </tr>
            </table>
            <input type="submit" value="submit" class="btn btn-default" name="update">
        </form>
    </div>
                <div class="footer">
            <div class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
                <ul class="nav nav-pills pull-right">													
                    <li role="presentation "><a class="b1 edit5" href="# ">About Us</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Home</a></li>
                    <li role=" presentation "><a class="b1 edit5" href="# ">Privacy</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Advertising</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Cookies</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Ad Choices</a></li>
                </ul>
                </nav>
            </div>
</body>
</html>