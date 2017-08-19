<%-- 
    Document   : studentrecord
    Created on : Aug 17, 2017, 1:44:58 AM
    Author     : Desmon
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import ="com.bin.*"%>
<%
    service ser = new service();
    List studentlist = ser.student_lsit();
    binclass objbin;
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td>S.No</td>
                <td>First Name</td>
                <td>Last Name</td>
                <td>Roll_No</td>
                <td>E-Mail</td>
                <td>Password</td>
                <td>Gender</td>
                <td>Delete</td>
                <td>Edit</td>
            </tr>
            <%if (studentlist.size() > 0) {
                    for (int a = 0; a < studentlist.size(); a++) {
                        objbin = (binclass) studentlist.get(a);
            %>

            <tr>
                <td><%=a + 1%></td>
                <td><%=objbin.getFname()%></td>
                <td><%=objbin.getLname()%></td>
                <td><%=objbin.getRollno()%></td>
                <td><%=objbin.getUserid()%></td>
                <td><%=objbin.getPassword()%></td>
                <td><%=objbin.getGender()%></td>
                <td><form action="controler_signup.jsp" method="get">
                        <input type="submit" value="<%=objbin.getRollno()%>" name="delete"></input>
                    </form>
                </td>
                <td><form action="adminedit_record.jsp" method="get">
                        <input type="submit" value="<%=objbin.getRollno()%>" name="edit"></input>
                    </form>
                </td>
                
            </tr>    
            <%

                    }

                }
            %>

        </table>
    </body>
</html>
