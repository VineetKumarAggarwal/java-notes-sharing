<%-- 
    Document   : courses
    Created on : Jul 20, 2017, 9:59:26 PM
    Author     : vinet
--%>
<%@page import="com.bin.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Courses</title>
    </head>
    <body style="background-color: navajowhite">
        <div class="header"> 

            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#">NOTES SHARING</a>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <form action="view_edit_info.jsp" method="get">
                        <input  type="submit" value="<%= session.getAttribute("name")%>" name="pass"</input>
                        </form>
<!--                            <li><a  href="signup.jsp">Sign Up page for Students</a><br></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">About us</a></li>
                                    <li><a href="#">Contact us</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Separated link</a></li>
                                </ul>
                            </li>-->
                        
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>
        </div>
        <font size="10" style="margin-left:190px;"><b>Courses Available</b></font>
        <p style="margin-left: 370px; margin-top: 30px;"><font size="6"><u>Bachelor of Technology (B.Tech)</u></font></p>
        <ul>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="csebtech.jsp">Computer Science Engineering (CSE)</a></li>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="mebtech.jsp">Mechanical Engineering (ME)</a></li>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="ecebtech.jsp">Electronics & Communication Engineering (ECE)</a></li>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="cebtech.jsp">Civil Engineering (CE)</a></li>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="eebtech.jsp">Electrical Engineering (EE)</a></li>
        </ul>
        <p style="margin-left: 370px;"><u><font size="6">Master of Technology (M.Tech)</font></u></p>
        <ul>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="csemtech.jsp">Computer Science Engineering (CSE)</a></li>                
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="ecemtech.jsp">Electronics & Communication Engineering (ECE)</a></li>                
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="memtech.jsp">Mechanical Engineering (ME)</a></li>                
        </ul>
        <p style="margin-left: 370px;"><u><font size="6">Business Administration (BBA/MBA)</font></u></p>
        <ul>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="bba.jsp">Bachelor of Business Administration (BBA)</a></li>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="mba.jsp">Master of Business Administration (MBA)</a></li>
        </ul>
        </body>
</html>