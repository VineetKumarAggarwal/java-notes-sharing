<%-- 
    Document   : view_edit_info
    Created on : Aug 2, 2017, 5:48:57 PM
    Author     : Desmon
--%>

<%@page import ="com.bin.*"%>

<%
    String name = request.getParameter("pass");
    service ser = new service();
    binclass binobj = ser.view_details(name);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
    </script>
</head>
<body style="margin:0px; background-color: wheat">
    <h1>Student Info</h1>
    <div class="container">
        <form action="controler_signup.jsp" method="get">
            <table>
                <tr>
                    <td><b>First Name</b></td>
                    <td><input type="text" name="fname" id="name" required="enter First name" value="<%=binobj.getFname()%>"></input></td>
                </tr>
                <tr>
                    <td><b>Last Name</b></td>
                    <td><input type="text" name="lname"  required= "enter last name" value="<%=binobj.getLname()%>"></input></td>
                </tr>
                <tr>
                    <td><b>Email</b></td>
                    <td><input type="email" name="userid" required="enter email" value="<%=binobj.getUserid()%>"></input></td>
                </tr>
                <tr>
                    <td><b>roll_no</b></td>
                    <td><input type="number" name="rollno" required=" enter address" value="<%=binobj.getRollno()%>"></input></td>
                </tr>
            </table>
            <input type="submit" value="submit" name="update">
        </form>
    </div>
</body>
</html>