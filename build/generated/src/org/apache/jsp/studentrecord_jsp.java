package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.bin.*;

public final class studentrecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    service ser = new service();
    List studentlist = ser.student_lsit();
    binclass objbin;

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\"> \n");
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
      out.write("<!--                            <li><a  href=\"#\" onclick=\"return adminlogin()\">Administrator</a></li>\n");
      out.write("                            <li><a  href=\"signup.jsp\">Sign Up page for Students</a><br></li>-->\n");
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
      out.write("        </div>\n");
      out.write("        <table class=\"table table-striped table table-hover\">\n");
      out.write("            <tr>\n");
      out.write("                <td>S.No</td>\n");
      out.write("                <td>First Name</td>\n");
      out.write("                <td>Last Name</td>\n");
      out.write("                <td>Roll_No</td>\n");
      out.write("                <td>E-Mail</td>\n");
      out.write("                <td>Password</td>\n");
      out.write("                <td>Gender</td>\n");
      out.write("                <td>Delete</td>\n");
      out.write("                <td>Edit</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
if (studentlist.size() > 0) {
                    for (int a = 0; a < studentlist.size(); a++) {
                        objbin = (binclass) studentlist.get(a);
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(a + 1);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(objbin.getFname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(objbin.getLname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(objbin.getRollno());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(objbin.getUserid());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(objbin.getPassword());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(objbin.getGender());
      out.write("</td>\n");
      out.write("                <td><form action=\"controler_signup.jsp\" method=\"get\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-default\" value=\"");
      out.print(objbin.getRollno());
      out.write("\" name=\"delete\"></input>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                <td><form action=\"adminedit_record.jsp\" method=\"get\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-default\" value=\"");
      out.print(objbin.getRollno());
      out.write("\" name=\"edit\"></input>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>    \n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("        </table>\n");
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
      out.write("    </body>\n");
      out.write("</html>\n");
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
