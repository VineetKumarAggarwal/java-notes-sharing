package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fin_005fas_005fteacher_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign_in_teacher</title>\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin:0px; background-color: wheat\">\n");
      out.write("        <h1>Teacher Info</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"servlet_sign_in_as_teacher\" method=\"get\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>First Name</b></td>\n");
      out.write("                        <td><input type=\"text\" name=\"First_Name\" required=\"enter First name\"></input></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Last Name</b></td>\n");
      out.write("                        <td><input type=\"text\" name=\"Last_Name\"  required= \"enter last name\"></input></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Email</b></td>\n");
      out.write("                        <td><input type=\"email\" name=\"Email\" required=\"enter email\"></input></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Password</b></td>\n");
      out.write("                        <td><input type=\"password\" id=\"Password\" name=\"Password\" required=\"enter password\" onkeyup=\"demo();\"></input></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Confirm Password</b></td>\n");
      out.write("                        <td><input type=\"password\" id=\"Confirm_Password\" name=\"Confirm_Password\" required=\"please confirm password\" onkeyup=\"demo();\"></input></td>\n");
      out.write("                        <td><span id=\"message\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"radio\" name=\"Gender\" value=\"male\" required=\"Please select your gender\"><b>Male</b></input></td>\n");
      out.write("                        <td><input type=\"radio\" name=\"Gender\" value=\"female\" required=\"Please select your gender\"><b>Female</b></input></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Teacher Id</b></td>\n");
      out.write("                        <td><input type=\"number\" name=\"Teacher_Id\" required=\"enter your id provided by college\"></input></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Address</b></td>\n");
      out.write("                        <td><input type=\"Address\" name=\"Address\" required=\" enter address\"></input></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Mobile No</b></td>\n");
      out.write("                        <td><input type=\"number\" name=\"Mobile_No\" required=\" enter address\"></input></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <!--                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <form action=\"upload.php\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                            Select image to upload:\n");
      out.write("                                            <input type=\"file\" name=\"fileToUpload\" id=\"fileToUpload\">\n");
      out.write("                                            <input type=\"submit\" value=\"Upload Image\" name=\"submit\">\n");
      out.write("                                        </form></td></tr>-->\n");
      out.write("                </table>\n");
      out.write("                <input type=\"submit\" value=\"submit\" onclick=\"ab()\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function ab()\n");
      out.write("            {\n");
      out.write("                var a=document.getElementById('Password').value;\n");
      out.write("                var b=document.getElementById('Confirm_Password').value;\n");
      out.write("                if(a!=b)\n");
      out.write("                {\n");
      out.write("                    alert(\"Wrong Password\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
