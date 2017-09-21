<%-- 
    Document   : changepassword
    Created on : Aug 23, 2017, 8:41:49 AM
    Author     : vinet
--%>
<%@page import ="com.bin.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int rollno = Integer.parseInt(request.getParameter("passw"));
    service ser = new service();
    binclass binobj = ser.view_details_admin(rollno);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="controler_signup.jsp" method="get">
            <table>
                <tr>
                    <td>Old Password</td>
                    <td><input type="text" value="<%=binobj.getPassword()%>" disabled></td>
                </tr>
                <tr>
                    <td>New Password</td>
                    <td><input type="password" name="upass" id="upass" required></td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td><input type="password" name="upass1" id="upass1" required></td>
                </tr>
            </table>
                <input type="submit" name="change_pass" value="<%=binobj.getRollno()%>" onclick="return aa()">
        </form>
        <script>
            function aa()
            {
                var pass=document.getElementById("upass").value;
                var cpass=document.getElementById("upass1").value;
                if (pass.length >= 6 && pass.length <= 14) {
                } else
                {
                    alert("Password length in between 6 to 14 characters.")
                    document.getElementById("upass").focus();
                    return false;
                }
                if (cpass.length >= 6 && cpass.length <= 14) {
                } else
                {
                    alert("Password length in between 6 to 14 characters.")
                    document.getElementById("upass1").focus();
                    return false;
                }
                if (pass != cpass)
                {
                    alert("Password doesn't match.")
                    document.getElementById("upass").focus();
                    return false;
                }
                return true;
            }
        </script>
    </body>
</html>
