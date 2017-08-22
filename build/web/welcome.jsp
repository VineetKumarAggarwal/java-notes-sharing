<%-- 
    Document   : login
    Created on : Jul 18, 2017, 1:01:58 PM
    Author     : vinet
--%>
<%@page import="com.bin.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login</title>
        <style>
            h1{
                position: absolute;
                top: 200px; 
                left: 0; 
                width: 100%; 
            }
            #myCarousel{
                height:672px;
                width: 1075px;
                margin-left: 136px;
            }
            .left{
                height: 672px;
                margin-left: -160px !important;
            }
            .right{
                height: 672px;
                margin-right: -160px;
            }
        </style>
    </head>
    <body>
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol> 
            <div class="carousel-inner">
                <div class="item active">
                    <h1>Heaving Problm in collecting notes ??</h1>
                </div>
                <div class="item">
                    <h1>Dont worry we have soltion</h1>
                </div>
                <div class="item">
                    <h1>lets Get Started!!</h1>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </body>
</html>

