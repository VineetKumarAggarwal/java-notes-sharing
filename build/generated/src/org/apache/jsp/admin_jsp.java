package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>ADMINISTRATOR</h1>\n");
      out.write("        <form>\n");
      out.write("            <input type=\"file\" name=\"upload\" required>\n");
      out.write("            <select id=\"course\" onchange=\"myFunction()\">\n");
      out.write("                <option value=\"\">--Select streams--</option>\n");
      out.write("                <option value=\"CSE(B.TECH)\">CSE(B.TECH)</option>\n");
      out.write("                <option value=\"ME(B.TECH)\">ME(B.TECH)</option>\n");
      out.write("                <option value=\"ECE(B.TECH)\">ECE(B.TECH)</option>\n");
      out.write("                <option value=\"CE(B.TECH)\">CE(B.TECH)</option>\n");
      out.write("                <option value=\"EE(B.TECH)\">EE(B.TECH)</option>\n");
      out.write("                <option value=\"CSE(M.TECH)\">CSE(M.TECH)</option>\n");
      out.write("                <option value=\"ME(M.TECH)\">ME(M.TECH)</option>\n");
      out.write("                <option value=\"ECE(M.TECH)\">ECE(M.TECH)</option>\n");
      out.write("                <option value=\"BBA\">BBA</option>\n");
      out.write("                <option value=\"MBA\">MBA</option>\n");
      out.write("            </select>\n");
      out.write("            <select id=\"subparts\">\n");
      out.write("                <option value=\"\">--Select semester--</option>\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" name=\"btn_upload\" value=\"Upload file\"><br><br>\n");
      out.write("            <a href=\"\">Students Information</a><br><br><br>\n");
      out.write("            <input type=\"search\" name=\"search\" id=\"search\">\n");
      out.write("            <input type=\"button\" name=\"btn_search\" id=\"btn_search\" value=\"Search\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>S.No</th>\n");
      out.write("                    <th>First Name</th>\n");
      out.write("                    <th>Last Name</th>\n");
      out.write("                    <th>Roll No.</th>\n");
      out.write("                    <th>E-Mail</th>\n");
      out.write("                    <th>Gender</th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("            function myFunction()\n");
      out.write("            {\n");
      out.write("                var s1=[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"];\n");
      out.write("                var ab = document.getElementById(\"course\").value;\n");
      out.write("                if (ab == \"CSE(B.TECH)\" || ab == \"ME(B.TECH)\" || ab == \"ECE(B.TECH)\" || ab == \"CE(B.TECH)\" || ab == \"EE(B.TECH)\")\n");
      out.write("                {\n");
      out.write("                    var i = 7;\n");
      out.write("                    var save=document.getElementById(\"subparts\").options.length;\n");
      out.write("                    for(save;save>0;save--)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"subparts\").options.remove(save);\n");
      out.write("                    }\n");
      out.write("                    for (j = 0; j <= i; j++)\n");
      out.write("                    {\n");
      out.write("                        var ba = document.createElement(\"option\");\n");
      out.write("                        ba.innerHTML = \"Semester \"+s1[j];\n");
      out.write("                        document.getElementById(\"subparts\").add(ba);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                else if (ab == \"CSE(M.TECH)\" || ab == \"ME(M.TECH)\" || ab == \"ECE(M.TECH)\" || ab == \"MBA\")\n");
      out.write("                {\n");
      out.write("                    var i = 3;\n");
      out.write("                    var save=document.getElementById(\"subparts\").options.length;\n");
      out.write("                    for(save;save>0;save--)\n");
      out.write("                    {                        \n");
      out.write("                        document.getElementById(\"subparts\").options.remove(save);\n");
      out.write("                    }\n");
      out.write("                    for (j = 0; j <= i; j++)\n");
      out.write("                    {\n");
      out.write("                        var ba = document.createElement(\"option\");\n");
      out.write("                        ba.innerHTML = \"Semester \"+s1[j];\n");
      out.write("                        document.getElementById(\"subparts\").add(ba);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                else if (ab == \"BBA\")\n");
      out.write("                {\n");
      out.write("                    var i = 5;\n");
      out.write("                    var save=document.getElementById(\"subparts\").options.length;\n");
      out.write("                    for(save;save>0;save--)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"subparts\").options.remove(save);\n");
      out.write("                    }\n");
      out.write("                    for (j = 0; j <= i; j++)\n");
      out.write("                    {\n");
      out.write("                        var ba = document.createElement(\"option\");\n");
      out.write("                        ba.innerHTML = \"Semester \"+s1[j];\n");
      out.write("                        document.getElementById(\"subparts\").add(ba);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
