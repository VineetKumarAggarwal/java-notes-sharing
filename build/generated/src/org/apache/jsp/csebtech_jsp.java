package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class csebtech_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>B.Tech</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: wheat\" link=\"black\">\n");
      out.write("        <font size=\"10\" style=\"margin-left:130px;\"><b>Computer Science Engineering</b></font>\n");
      out.write("        <table style=\"border:0; margin-left: 280px; margin-top: 50px;\">\n");
      out.write("            <tr style=\"background-color: sienna\">\n");
      out.write("                <th><font size=\"6\" style=\"padding: 10px;\">S.No.</font></th>\n");
      out.write("                <th><font size=\"6\" style=\"padding: 10px;\">Semesters</font></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>1.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"#\">Semester 1</a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"background-color: sienna\">\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>2.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"#\">Semester 2</a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>3.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"#\">Semester 3</a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"background-color: sienna\">\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>4.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"#\">Semester 4</a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>5.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"#\">Semester 5</a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"background-color: sienna\">\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>6.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"#\">Semester 6</a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>7.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"#\">Semester 7</a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"background-color: sienna\">\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>8.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"#\">Semester 8</a></b></td>\n");
      out.write("            </tr>\n");
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
