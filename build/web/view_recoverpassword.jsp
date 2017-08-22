<%-- 
    Document   : view_recoverpassword
    Created on : Jul 30, 2017, 10:39:23 PM
    Author     : vinet
--%>
<%@page import ="com.bin.*"%>
<%
    String userid = request.getParameter("userid");
    int rollno = Integer.parseInt(request.getParameter("rollno"));
    service ser = new service();
    binclass binobj = ser.recover_password(userid, rollno);
    String pass = binobj.getPassword();
    String email = binobj.getUserid();
    String roll_no=binobj.getRollno();
    if (pass!=null) {
%>
<script>
    alert("Your password is <%=binobj.getPassword()%>");
    window.location.assign("login.jsp");
</script>
<%
} else if (email==null){
%>
<script>
    alert("Wrong try again");
    window.location.assign("recoverpassword.jsp");
</script>
<%
    }
%>