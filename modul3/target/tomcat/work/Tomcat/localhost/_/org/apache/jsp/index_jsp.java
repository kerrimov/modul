/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-11 19:33:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Database</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\"\r\n");
      out.write("          integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form class=\"form-group\"\r\n");
      out.write("      method=\"post\"\r\n");
      out.write("      action=\"/createtable\">\r\n");
      out.write("    <label>Create a table </label>\r\n");
      out.write("    <div>\r\n");
      out.write("        <input type=\"text\" id=\"nametable1\" name=\"nametablecreate\" placeholder=\"Enter a name table\">\r\n");
      out.write("        <input type=\"text\" id=\"col\" name=\"col\" placeholder=\"Enter a number col\">\r\n");
      out.write("        <input type=\"submit\" value=\"Create table\" class=\"btn btn-primary\" id=\"create-table\">\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<form class=\"form-group\"\r\n");
      out.write("      method=\"post\"\r\n");
      out.write("      action=\"/droptable\">\r\n");
      out.write("    <label>Delete a table by number</label>\r\n");
      out.write("    <div>\r\n");
      out.write("        <input type=\"text\" id=\"nametable4\" name=\"nametabledrop\" placeholder=\"Enter a name table\">\r\n");
      out.write("        <input type=\"submit\" value=\"Delete table\" class=\"btn btn-primary\" id=\"drop-table\">\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<form class=\"form-group\"\r\n");
      out.write("      method=\"post\"\r\n");
      out.write("      action=\"/deleterow\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <label>Delete row </label>\r\n");
      out.write("        <div>\r\n");
      out.write("            <input type=\"text\" id=\"nametable5\" name=\"nametable5\" placeholder=\"Enter a name table\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter a number row\" name=\"row3\">\r\n");
      out.write("            <input type=\"submit\" value=\"Delete row\" class=\"btn btn-primary\" id=\"delete-row\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<form class=\"form-group\"\r\n");
      out.write("      method=\"post\"\r\n");
      out.write("      action=\"/getdata\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <label>Add data to the table by number row</label>\r\n");
      out.write("        <div>\r\n");
      out.write("            <input type=\"text\" id=\"nametable2\" name=\"nametabledata1\" placeholder=\"Enter a name table\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter a number row\" name=\"row2\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter a data\" name=\"data1\">\r\n");
      out.write("            <input type=\"submit\" value=\"Insert data\" class=\"btn btn-primary\" id=\"insert-data\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<form class=\"form-group\"\r\n");
      out.write("      method=\"post\"\r\n");
      out.write("      action=\"/json\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <input type=\"text\" placeholder=\"Enter a nametable\" name=\"tablename7\">\r\n");
      out.write("        <input type=\"submit\" value=\"JSON\" class=\"btn btn-primary\" id=\"json\">\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<script src=\"js/test.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
