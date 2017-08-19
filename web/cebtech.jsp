<%-- 
    Document   : cebtech
    Created on : Jul 22, 2017, 5:30:30 PM
    Author     : vinet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CE B.Tech</title>
    </head>
    <form action="view_edit_info.jsp" method="get">
                        <input  type="submit" value="<%= session.getAttribute("name")%>" name="pass"</input>
                        </form>
    <body style="background-color: navajowhite">
        <font size="10" style="margin-left:210px;"><b>Civil Engineering (CE)</b></font>
        <table style="border:0; margin-left: 280px; margin-top: 50px;">
            <tr style="background-color: peru">
                <th><font size="6" style="padding: 10px;">S.No.</font></th>
                <th><font size="6" style="padding: 10px;">Semesters</font></th>
            </tr>
            <tr>
                <td align="center" style="padding: 10px;"><b>1.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="#"><font color="black">Semester 1</font></a></b></td>
            </tr>
            <tr style="background-color: peru">
                <td align="center" style="padding: 10px;"><b>2.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="#"><font color="black">Semester 2</font></a></b></td>
            </tr>
            <tr>
                <td align="center" style="padding: 10px;"><b>3.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="#"><font color="black">Semester 3</font></a></b></td>
            </tr>
            <tr style="background-color: peru">
                <td align="center" style="padding: 10px;"><b>4.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="#"><font color="black">Semester 4</font></a></b></td>
            </tr>
            <tr>
                <td align="center" style="padding: 10px;"><b>5.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="#"><font color="black">Semester 5</font></a></b></td>
            </tr>
            <tr style="background-color: peru">
                <td align="center" style="padding: 10px;"><b>6.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="#"><font color="black">Semester 6</font></a></b></td>
            </tr>
            <tr>
                <td align="center" style="padding: 10px;"><b>7.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="#"><font color="black">Semester 7</font></a></b></td>
            </tr>
            <tr style="background-color: peru">
                <td align="center" style="padding: 10px;"><b>8.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="#"><font color="black">Semester 8</font></a></b></td>
            </tr>
        </table>
    </body>
</html>
