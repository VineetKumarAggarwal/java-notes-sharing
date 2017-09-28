<%-- 
    Document   : sem1sub
    Created on : Jul 22, 2017, 7:04:45 PM
    Author     : vinet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subjects</title>
    </head>
    <body style="background-color: navajowhite; margin: 0;">
        <div>
            <div style="padding-top: 20px; padding-bottom: 20px; padding-left: 60px; background-color: peru; height: 100%">
                <font size="8">Subjects & their study material.</font>
                <form action="view_edit_info.jsp" method="get">
                        <input  type="submit" value="<%= session.getAttribute("name")%>" name="pass"</input>
                        </form>
            </div>
            <div style="padding-top: 60px; padding-left: 120px; padding-right: 120px; background-color: navajowhite; height: 100%">
                <div style="background-color: peru; padding: 10px;" id="first"><font size="4">MATHS - 1</font></div>
                <div style="background-color: navajowhite; padding: 10px;" id="second"><font size="4">PHYSICS - 1</font></div>
                                <div style="background-color: peru; padding: 10px;"><font size="4">CHEMISTRY - 1</font></div>
                                <div style="background-color: navajowhite; padding: 10px;"><font size="4">ET</font></div>
                                <div style="background-color: peru; padding: 10px;"><font size="4">EGD</font></div>
                                <div style="background-color: navajowhite; padding: 10px;"><font size="4">ENGLISH</font></div>
                                <div style="background-color: peru; padding: 10px;"><font size="4">EVS</font></div>
            </div>
            
        </div>
    </body>
</html>
