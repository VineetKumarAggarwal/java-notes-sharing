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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    service ser = new service();
    List studentlist = ser.student_lsit();
    binclass objbin;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
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
      out.write("                        <input type=\"submit\" value=\"Delete\" data-value=\"");
      out.print(objbin.getRollno());
      out.write("\" name=\"delete\"></input>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                <td><form action=\"adminedit_record.jsp\" method=\"get\">\n");
      out.write("                        <input type=\"submit\" value=\"Delete\" data-value=\"");
      out.print(objbin.getRollno());
      out.write("\" name=\"edit\"></input>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>    \n");
      out.write("            ");


                    }

                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
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
