<%-- 
    Document   : upload
    Created on : Aug 30, 2017, 7:34:17 PM
    Author     : vinet
--%>
<%@page import ="com.bin.*"%>

<%
    if (request.getParameter("btn_upload") != null && request.getParameter("getfile") !=null && request.getParameter("subpart") != "--Select streams--" && request.getParameter("subpart1") !="--Select semester--")
    {
    String filename = request.getParameter("getfile");
    String branchname = request.getParameter("subpart");
    String samestername = request.getParameter("subpart1");
    service ser = new service();
    ser.addfiles(filename,branchname,samestername);
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script>
        </script>
    </body>
</html>
