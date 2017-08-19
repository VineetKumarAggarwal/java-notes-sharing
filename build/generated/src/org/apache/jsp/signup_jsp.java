package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <!--\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Sign_in_style.css\">-->\n");
      out.write("        <style>       \n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                margin-top: 50px;\n");
      out.write("                margin-left: 50px;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            input\n");
      out.write("            {\n");
      out.write("                margin :5px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("            .btn,table{\n");
      out.write("                margin-left: 450px;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"img2.jpg\");\n");
      out.write("                background-size: 100%;\n");
      out.write("            }\n");
      out.write("            .footer{\n");
      out.write("                margin-top: 160px;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("            .navbar{\n");
      out.write("                background-color: #AE94F5;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-default\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\">NOTES SHARING</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a  href=\"#\" onclick=\"return adminlogin()\">Administrator</a></li>\n");
      out.write("                            <li><a  href=\"signup.jsp\">Sign Up page for Students</a><br></li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"#\">About us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Contact us</a></li>\n");
      out.write("                                    <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("                </div><!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <form action=\"controler_signup.jsp\" method=\"get\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>First Name</b></td>\n");
      out.write("                    <td><input type=\"text\"class=\"form-control\" name=\"fname\" id=\"fname\" required></input></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Last Name</b></td>\n");
      out.write("                    <td><input type=\"text\"class=\"form-control\" name=\"lname\"  id=\"lname\" required></input></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Roll No</b></td>\n");
      out.write("                    <td><input type=\"text\" class=\"form-control\" name=\"rollno\" id=\"rollno\" required></input></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Email</b></td>\n");
      out.write("                    <td><input type=\"email\"class=\"form-control\" name=\"userid\" id=\"email\" required></input></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Password</b></td>\n");
      out.write("                    <td><input type=\"password\"class=\"form-control\"  name=\"password\" id=\"pass\" required></input></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Confirm Password</b></td>\n");
      out.write("                    <td><input type=\"password\"class=\"form-control\" name=\"confirmpassword\" id=\"pass1\" required></input></td>\n");
      out.write("                    <td><span id=\"message\"></span></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"radio\" name=\"gender\" value=\"male\" required><b>Male</b></input></td>\n");
      out.write("                    <td><input type=\"radio\" name=\"gender\" value=\"female\" required><b>Female</b></input></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" value=\"submit\" class=\"btn btn-default\" name=\"insert\" onclick=\"return aa()\">\n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("            function aa()\n");
      out.write("            {\n");
      out.write("                var pas = document.getElementById(\"pass\").value;\n");
      out.write("                var cpas = document.getElementById(\"pass1\").value;\n");
      out.write("                var rol = document.getElementById(\"rollno\").value;\n");
      out.write("                var name1 = document.getElementById(\"fname\").value;\n");
      out.write("                var name2 = document.getElementById(\"lname\").value;\n");
      out.write("                var email = document.getElementById(\"email\").value;\n");
      out.write("                var com = /^[A-Za-z]+$/;\n");
      out.write("                var num = /^[0-9]+$/;\n");
      out.write("                if (name1.match(com)) {\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    alert(\"Only alphabets are allowed in first name.\")\n");
      out.write("                    document.getElementById(\"fname\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (name2.match(com)) {\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    alert(\"Only alphabets are allowed in last name.\")\n");
      out.write("                    document.getElementById(\"lname\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }if (rol.length != 7)\n");
      out.write("                {\n");
      out.write("                    alert(\"Roll no should be of 7 digits.\")\n");
      out.write("                    document.getElementById(\"rollno\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (rol.match(num)) {\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    alert(\"Only numbers are allowed.\")\n");
      out.write("                    document.getElementById(\"rollno\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (pas.length >= 6 && pas.length <= 10) {\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    alert(\"Password length in between 6 to 10 characters.\")\n");
      out.write("                    document.getElementById(\"pass\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (cpas.length >= 6 && cpas.length <= 10) {\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    alert(\"Password length in between 6 to 10 characters.\")\n");
      out.write("                    document.getElementById(\"pass1\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (pas != cpas)\n");
      out.write("                {\n");
      out.write("                    alert(\"Password doesn't match.\")\n");
      out.write("                    document.getElementById(\"pass\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"navbar navbar-inverse navbar-fixed-bottom\" role=\"navigation\">\n");
      out.write("                <ul class=\"nav nav-pills pull-right\">\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">About Us</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Home</a></li>\n");
      out.write("                    <li role=\" presentation \"><a class=\"b1 edit5\" href=\"# \">Privacy</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Advertising</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Cookies</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Ad Choices</a></li>\n");
      out.write("                </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
