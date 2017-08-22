<%-- 
    Document   : getimg
    Created on : Aug 14, 2017, 3:13:40 AM
    Author     : vinet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import ="com.bin.*"%>
<jsp:useBean id="objbin" class="com.bin.binclass">
<jsp:setProperty name="objbin"  property="*"/>
</jsp:useBean>
<%
    if (request.getParameter("image") != null) 
    {
        service ser = new service();
        //String result = ser.addRecord(objbin);
        response.sendRedirect("login.jsp");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
