/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2022-02-08 11:21:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>ORS </title>\r\n");
      out.write("  <title>ORS</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-expand navbar-dark flex-column flex-md-row bd-navbar\" style=\"height:50px ; background-color:#007bff;  \">\r\n");
      out.write("     <img src=\"../resources/IMG/logoRays.png\" class = \"navbar-brand\" height=\"40\" width=\"80\" style=\"margin-top: 0.2%\" align=\"left\" > \r\n");
      out.write("     <div class = \"navbar-header\">\r\n");
      out.write("     <a class=\"navbar-brand\"><strong> ORS </strong></a>\r\n");
      out.write("     </div>\r\n");
      out.write("     </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class = \"container-fluid   m-5  pt-4\"  >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        	\r\n");
      out.write("        \r\n");
      out.write("        	<div class = \"container border col-sm-6  \" >\r\n");
      out.write("        		<h2 class = \"border-bottom text-center text-primary\"> User Registration</h2>\r\n");
      out.write("\r\n");
      out.write("        		<form action=\"/ORSProject3_test/CTL\"  method=\"post\">\r\n");
      out.write("        		\r\n");
      out.write("                    <div class=\"form-group form-row\">\r\n");
      out.write("                    <label for=\"firstName\" class=\"col-sm-2 col-form-label col-form-label-sm col\">\r\n");
      out.write("                        FirstName <i class=\"fas fa-asterisk\" style=\"color:red\"></i>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <input class=\"form-control form-control-sm\" type=\"text\" id=\"fname\" name=\"firstName\" placeholder=\"First Name\" required >\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group form-row\">\r\n");
      out.write("                    <label for=\"lastName\" class=\"col-sm-2 col-form-label col-form-label-sm col\">\r\n");
      out.write("                        Last Name <i class=\"fas fa-asterisk\" style=\"color:red\"></i>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <input class=\"form-control form-control-sm\" type=\"text\" id=\"lname\" name=\"lastName\" placeholder=\"Last Name\" required >\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group form-row\">\r\n");
      out.write("                    <label for=\"login\" class=\"col-sm-2 col-form-label col-form-label-sm col\">\r\n");
      out.write("                        Login <i class=\"fas fa-asterisk\" style=\"color:red\"></i>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <input class=\"form-control form-control-sm\" type=\"email\" id=\"login\" name=\"login\" placeholder=\"Login\" required >\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group form-row\">\r\n");
      out.write("                    <label for=\"pwd\" class=\"col-sm-2 col-form-label col-form-label-sm col\">\r\n");
      out.write("                        Password <i class=\"fas fa-asterisk\" style=\"color:red\"></i>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <input class=\"form-control form-control-sm\" type=\"password\" id=\"password\" name=\"pwd\" placeholder=\"Password\" required >\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"form-group form-row\">\r\n");
      out.write("                    <label for=\"pwd\" class=\"col-sm-2 col-form-label col-form-label-sm col\">\r\n");
      out.write("                        MobileNo<i class=\"fas fa-asterisk\" style=\"color:red\"></i>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <input class=\"form-control form-control-sm\" type=\"text\" id=\"mobileNo\" name=\"Mobileno\" placeholder=\"mobile no\" required >\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-group form-row justify-content-end\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-outline-primary btn-sm\">\r\n");
      out.write("                        <i class=\"fa fa-user-plus\"></i> Sign Up\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        		</form>\r\n");
      out.write("        	</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p class=\"d-flex justify-content-center\">?? 2022, Rays Technologies, SunilOS Infotech Pvt Ltd. </p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
