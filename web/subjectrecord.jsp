<%-- 
    Document   : subjectrecord
    Created on : Sep 7, 2017, 4:44:01 PM
    Author     : vinet
--%>

<%@page import="com.bin.service"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.bin.binclass"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.InputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            service sc = new service();
            binclass bn = sc.view_addfiles();
            
        %>
        <table>
            <tr>
                <%
                    
                        int c = 0,i=0;
                     InputStream binaryStream = bn.getFile().getBinaryStream(1, bn.getFile().length());   
                     System.out.println(binaryStream);
                     %>
                </tr><tr>
                <%
                     OutputStream f = new FileOutputStream(new File("hello1"+i+".pdf"));
                        while ((c = binaryStream.read()) > -1) {
					f.write(c);
				}%>
                </tr>
                    <%
//            ResultSet rs=null;
//            int i=0;
//            try{
//            while (rs.next()) {
//				InputStream in = rs.getBinaryStream(1);
//				OutputStream f = new FileOutputStream(new File("hello1"+i+".jpg"));
//				i++;
//				int c = 0;
//				while ((c = in.read()) > -1) {
//					f.write(c);
//				}
//				f.close();
//				in.close();
//			}
//                }catch(Exception ex){
//			System.out.println(ex.getMessage());
//		}
                %>
        </table>
    </body>
</html>
