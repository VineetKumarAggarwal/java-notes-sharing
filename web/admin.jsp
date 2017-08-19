<%-- 
    Document   : admin
    Created on : Aug 11, 2017, 4:30:27 PM
    Author     : vinet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        
        <h1>ADMINISTRATOR</h1>
        <form>
            <input type="file" name="upload" required>
            <select id="course" onchange="myFunction()">
                <option value="">--Select streams--</option>
                <option value="CSE(B.TECH)">CSE(B.TECH)</option>
                <option value="ME(B.TECH)">ME(B.TECH)</option>
                <option value="ECE(B.TECH)">ECE(B.TECH)</option>
                <option value="CE(B.TECH)">CE(B.TECH)</option>
                <option value="EE(B.TECH)">EE(B.TECH)</option>
                <option value="CSE(M.TECH)">CSE(M.TECH)</option>
                <option value="ME(M.TECH)">ME(M.TECH)</option>
                <option value="ECE(M.TECH)">ECE(M.TECH)</option>
                <option value="BBA">BBA</option>
                <option value="MBA">MBA</option>
            </select>
            <select id="subparts">
                <option value="">--Select semester--</option>
            </select>
            <input type="submit" name="btn_upload" value="Upload file"><br><br>
            <a href="studentrecord.jsp">Students Information</a><br><br><br>
            <input type="search" name="search" id="search">
            <input type="button" name="btn_search" id="btn_search" value="Search">
            <table border="1">
                <tr>
                    <th>S.No</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Roll No.</th>
                    <th>E-Mail</th>
                    <th>Gender</th>
                </tr>
            </table>
        </form>
        <script>
            function myFunction()
            {
                var s1=["1","2","3","4","5","6","7","8"];
                var ab = document.getElementById("course").value;
                if (ab == "CSE(B.TECH)" || ab == "ME(B.TECH)" || ab == "ECE(B.TECH)" || ab == "CE(B.TECH)" || ab == "EE(B.TECH)")
                {
                    var i = 7;
                    var save=document.getElementById("subparts").options.length;
                    for(save;save>0;save--)
                    {
                        document.getElementById("subparts").options.remove(save);
                    }
                    for (j = 0; j <= i; j++)
                    {
                        var ba = document.createElement("option");
                        ba.innerHTML = "Semester "+s1[j];
                        document.getElementById("subparts").add(ba);
                    }
                }
                else if (ab == "CSE(M.TECH)" || ab == "ME(M.TECH)" || ab == "ECE(M.TECH)" || ab == "MBA")
                {
                    var i = 3;
                    var save=document.getElementById("subparts").options.length;
                    for(save;save>0;save--)
                    {                        
                        document.getElementById("subparts").options.remove(save);
                    }
                    for (j = 0; j <= i; j++)
                    {
                        var ba = document.createElement("option");
                        ba.innerHTML = "Semester "+s1[j];
                        document.getElementById("subparts").add(ba);
                    }
                }
                else if (ab == "BBA")
                {
                    var i = 5;
                    var save=document.getElementById("subparts").options.length;
                    for(save;save>0;save--)
                    {
                        document.getElementById("subparts").options.remove(save);
                    }
                    for (j = 0; j <= i; j++)
                    {
                        var ba = document.createElement("option");
                        ba.innerHTML = "Semester "+s1[j];
                        document.getElementById("subparts").add(ba);
                    }
                }
            }
        </script>
    </body>
</html>

