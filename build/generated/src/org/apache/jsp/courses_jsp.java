package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bin.*;

public final class courses_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String userid = request.getParameter("userid");
String password = request.getParameter("password");
service ser = new service();
binclass binobj=ser.login_permission(userid,password);
//response.sendRedirect("courses.jsp");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Courses</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: navajowhite\">\n");
      out.write("        <font size=\"10\" style=\"margin-left:190px;\"><b>Courses Available</b></font>\n");
      out.write("        <p style=\"margin-left: 370px; margin-top: 30px;\"><font size=\"6\"><u>Bachelor of Technology (B.Tech)</u></font></p>\n");
      out.write("            <ul>\n");
      out.write("                <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"csebtech.jsp\">Computer Science Engineering (CSE)</a></li>\n");
      out.write("                <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"mebtech.jsp\">Mechanical Engineering (ME)</a></li>\n");
      out.write("                <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"ecebtech.jsp\">Electronics & Communication Engineering (ECE)</a></li>\n");
      out.write("                <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"cebtech.jsp\">Civil Engineering (CE)</a></li>\n");
      out.write("                <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"eebtech.jsp\">Electrical Engineering (EE)</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <p style=\"margin-left: 370px;\"><u><font size=\"6\">Master of Technology (M.Tech)</font></u></p>\n");
      out.write("            <ul>\n");
      out.write("                <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"csemtech.jsp\">Computer Science Engineering (CSE)</a></li>                \n");
      out.write("                <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"ecemtech.jsp\">Electronics & Communication Engineering (ECE)</a></li>                \n");
      out.write("                <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"memtech.jsp\">Mechanical Engineering (ME)</a></li>                \n");
      out.write("            </ul>\n");
      out.write("            <p style=\"margin-left: 370px;\"><u><font size=\"6\">Business Administration (BBA/MBA)</font></u></p>\n");
      out.write("            <ul>\n");
      out.write("                <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"bba.jsp\">Bachelor of Business Administration (BBA)</a></li>\n");
      out.write("                <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"mba.jsp\">Master of Business Administration (MBA)</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <form action=\"view_edit_info.jsp\" method=\"get\">\n");
      out.write("                \n");
      out.write("                <input type=\"Submit\" name=\"pass\" value=\"");
      out.print(binobj.getRollno());
      out.write("\">\n");
      out.write("</form></body>\n");
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
