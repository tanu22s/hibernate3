/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2022-02-17 16:46:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project_3.controller.CourseCtl;
import in.co.rays.project_3.util.HTMLUtility;
import java.util.HashMap;
import in.co.rays.project_3.util.ServletUtility;
import in.co.rays.project_3.util.DataUtility;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.dto.RoleDTO;
import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.controller.ORSView;

public final class CourseView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1645113752313L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1645106943220L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.rays.project_3.controller.CourseCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.util.HTMLUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.util.ServletUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.RoleDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.util.DataUtility");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.UserDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.ORSView");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Course Page</title>\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/image/TitleIcon.png\" type=\"image/x-icon\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write(" <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/css/BackGround.css\"></link>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("  <style>\n");
      out.write("  .navbar{\n");
      out.write("  z-index: 999;\n");
      out.write("  /* position: fixed; */\n");
      out.write("  -webkit-font-smoothing: antialiased;\n");
      out.write("    /* background:#dbd8e3; */\n");
      out.write("    background: linear-gradient(to top, #fdd9eaec, rgb(231, 248, 232));\n");
      out.write("  \n");
      out.write(" \n");
      out.write("  }\n");
      out.write(" #navbardrop,#navbarDropdown{\n");
      out.write(" color: #003586;\n");
      out.write(" font-weight: 550;\n");
      out.write(" \n");
      out.write("  \n");
      out.write("  }\n");
      out.write("\n");
      out.write(" .dropdown-menu{\n");
      out.write(" background: #f7f6ee;\n");
      out.write(" background-repeat: ;\n");
      out.write(" }\n");
      out.write(" .dropdown-item{\n");
      out.write(" z-index: 100;\n");
      out.write(" line-height: 10%;\n");
      out.write(" }\n");
      out.write("  .dropdown-item:hover{\n");
      out.write(" /* background: linear-gradient(to right, #fdd9eaec, rgb(231, 248, 232)); */\n");
      out.write(" background: linear-gradient(to top, #fdd9eaec, rgb(231, 248, 232));\n");
      out.write("} \n");
      out.write("body{\n");
      out.write("	\n");
      out.write("  background:#f7f6ee;\n");
      out.write("  \n");
      out.write("  }\n");
      out.write("th{\n");
      out.write("  background-color: #98a3a5;\n");
      out.write("  align: center;\n");
      out.write(" }\n");
      out.write(" tr{\n");
      out.write(" font-weight: 400;\n");
      out.write(" }\n");
      out.write(" .text{\n");
      out.write(" align: center;\n");
      out.write(" }\n");
      out.write(" .font-weight-thin{\n");
      out.write(" color:#162390;\n");
      out.write(" \n");
      out.write(" }\n");
      out.write(" \n");
      out.write("  </style>\n");
      out.write("  \n");
      out.write("  </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("	");

		UserDTO userDto = (UserDTO) session.getAttribute("user");
		boolean userLoggedIn = userDto != null;
		 String welcomeMsg = "Hi, ";
		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userDto.getFirstname() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\n");
      out.write("<div id=\"navigation \">\n");
      out.write("	\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-light sticky-top shadow-sm\">\n");
      out.write("  <!-- Brand -->\n");
      out.write("  <a class=\"navbar-brand\" href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">\n");
      out.write("  	<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/image/rays.png\" width=\"100px\" height=\"35px\">\n");
      out.write("  </a>\n");
      out.write("  		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse d-flex justify-content-end\" id=\"collapsibleNavbar\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("    \n");
      out.write("    <a class=\"nav-link\" href=\"#\"><span class=\"sr-only\">(current)</span></a>\n");
      out.write("\n");
      out.write("				");

					if (userLoggedIn) {
				
      out.write("\n");
      out.write("				\n");
      out.write("				");

					if (userDto.getRoleid() == RoleDTO.STUDENT) {
				
      out.write("\n");
      out.write("				\n");
      out.write("				<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("					<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><i\n");
      out.write("						class=\"far fa-file\"></i>Add Marksheet</a> <a class=\"dropdown-item\"\n");
      out.write("						href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><i class=\"fas fa-paste\"></i>Marksheet\n");
      out.write("		List</a> <a class=\"dropdown-item\"\n");
      out.write("						href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\n");
      out.write("						class=\" far fa-file-alt\"></i>Marksheet Merit List </a> <a\n");
      out.write("						class=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i\n");
      out.write("						class=\"far fa-copy\"></i>Get Marksheet</a>\n");
      out.write("				</div>\n");
      out.write("				</li>\n");
      out.write("\n");
      out.write("				");

					}  else if (userDto.getRoleid() == RoleDTO.ADMIN) { 
				
      out.write("\n");
      out.write("				 \n");
      out.write("       \n");
      out.write("       <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link  btn dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        User\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\"><i class=\"fas fa-pen\"></i>&nbsp;Add User</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"><i class=\"fas fa-list\"></i>&nbsp;User List</a>\n");
      out.write("      </div>\n");
      out.write("    </li> \n");
      out.write("    \n");
      out.write("    	 <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown \">\n");
      out.write("      <a class=\"nav-link btn dropdown-toggle \" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        Marksheet\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><i class=\"fas fa-pen\"></i>&nbsp;Add Marksheet</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><i class=\"fas fa-tasks\"></i>&nbsp;Marksheet List</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i class=\"fas fa-star\"></i>&nbsp;Marksheet Merit List</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i class=\"fas fa-file\"></i>&nbsp;Get Marksheet</a>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link btn dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        Role\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\"><i class=\"fas fa-pen\"></i>&nbsp;Add Role</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\"><i class=\"fas fa-tasks\"></i>&nbsp;Role List</a>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("     <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link btn dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("       College\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"><i class=\"fas fa-pen\"></i>&nbsp;Add College</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><i class=\"fas fa-tasks\"></i>&nbsp;College List</a>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link btn dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        Course\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><i class=\"fas fa-pen\"></i>&nbsp;Add Course</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><i class=\"fas fa-tasks\"></i>&nbsp;Course List</a>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link btn dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        Student\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><i class=\"fas fa-pen\"></i>&nbsp;Add Student</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><i class=\"fas fa-tasks\"></i>&nbsp;Student List</a>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link btn dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        Faculty\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><i class=\"fas fa-pen\"></i>&nbsp;Add Faculty</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><i class=\"fas fa-tasks\"></i>&nbsp;Faculty List</a>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link btn dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        TimeTable\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><i class=\"fas fa-pen\"></i>&nbsp;Add Time Table</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><i class=\"fas fa-tasks\"></i>&nbsp;Time Table List</a>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link btn dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        Subject\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><i class=\"fas fa-pen\"></i>&nbsp;Add Subject</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"><i class=\"fas fa-tasks\"></i>&nbsp;Subject List</a>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    ");
} }
      out.write("\n");
      out.write("    \n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("	<a class=\"nav-link btn btn-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" \n");
      out.write("	data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><i class=\"fas fa-user-tie\"></i>&nbsp;");
      out.print(welcomeMsg);
      out.write("</a>\n");
      out.write("					\n");
      out.write("	<div class=\"dropdown-menu ml-auto\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						");

							 if (userLoggedIn) { 
						
      out.write("\n");
      out.write("						\n");
      out.write("						\n");
      out.write("	<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">\n");
      out.write("		<i	class=\"fas fa-sign-out-alt\"></i>Logout </a>\n");
      out.write("		 <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">\n");
      out.write("		 <i class=\"fas fa-user\"></i>My Profile</a>\n");
      out.write("	     <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">\n");
      out.write("		 <i	class=\"fas fa-edit\"></i>Change Password</a>\n");
      out.write("		 <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\"	target=\"blank\">\n");
      out.write("		 <i class=\"fas fa-clone\"></i>Java Doc </a>\n");
      out.write("						");

							} else { 
						
      out.write("\n");
      out.write("		<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">\n");
      out.write("		<i class=\"fas fa-sign-in-alt\"><b>Login</b></i>\n");
      out.write("		<a	class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_REGISTRATION_CTL);
      out.write("\">\n");
      out.write("		<i class=\"fas fa-registered\"><b>User Registration</b></i>\n");
      out.write("	</a>\n");
      out.write("	\n");
      out.write("	</div>\n");
      out.write("	</li>\n");
      out.write("    	\n");
      out.write("    			");

					}
				
      out.write("\n");
      out.write("    \n");
      out.write("    </ul>\n");
      out.write("  </div>  \n");
      out.write("  \n");
      out.write("  </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("</div>\n");
      out.write("<br><br>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("	<div>\n");
      out.write("		");
      in.co.rays.project_3.dto.CourseDTO dto = null;
      dto = (in.co.rays.project_3.dto.CourseDTO) _jspx_page_context.getAttribute("dto", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (dto == null){
        dto = new in.co.rays.project_3.dto.CourseDTO();
        _jspx_page_context.setAttribute("dto", dto, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\n");
      out.write("			\n");
      out.write("			<br>\n");
      out.write("\n");
      out.write("		<main>\n");
      out.write("		<form action=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("			<div class=\"row pt-3 pb-3\">\n");
      out.write("				<!-- Grid column -->\n");
      out.write("				<div class=\"col-md-4 mb-4\"></div>\n");
      out.write("				<div class=\"col-md-4 mb-4\">\n");
      out.write("					<div class=\"card rounded-lg border-secondary shadow\">\n");
      out.write("						<div class=\"card-body\">\n");
      out.write("							");

							  long id=DataUtility.getLong(request.getParameter("id"));
							
							
							if (id >0)  {
							
      out.write("\n");
      out.write("							<h3 class=\"text-center default-text text-primary\">Update Course</h3>\n");
      out.write("							");

								} else {
							
      out.write("\n");
      out.write("							<h3 class=\"text-center default-text text-primary\">Add Course</h3>\n");
      out.write("							");

								}
							
      out.write("\n");
      out.write("							<!--Body-->\n");
      out.write("							<div>\n");
      out.write("\n");
      out.write("\n");
      out.write("								<H6 align=\"center\">\n");
      out.write("									");

										if (!ServletUtility.getSuccessMessage(request).equals("")) {
									
      out.write("\n");
      out.write("									<div class=\"alert alert-success alert-dismissible\">\n");
      out.write("										<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("										");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("\n");
      out.write("									</div>\n");
      out.write("									");

										}
									
      out.write("\n");
      out.write("								</H6>\n");
      out.write("\n");
      out.write("								<H6 align=\"center\">\n");
      out.write("									");

										if (!ServletUtility.getErrorMessage(request).equals("")) {
									
      out.write("\n");
      out.write("									<div class=\"alert alert-danger alert-dismissible\">\n");
      out.write("										<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("											");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("\n");
      out.write("									</div>\n");
      out.write("									");

										}
									
      out.write("\n");
      out.write("\n");
      out.write("								</H6>\n");
      out.write("\n");
      out.write("								<input type=\"hidden\" name=\"id\" value=\"");
      out.print(dto.getId());
      out.write("\">\n");
      out.write("								<input type=\"hidden\" name=\"createdBy\"\n");
      out.write("									value=\"");
      out.print(dto.getCreatedby());
      out.write("\"> <input type=\"hidden\"\n");
      out.write("									name=\"modifiedBy\" value=\"");
      out.print(dto.getModifiedby());
      out.write("\"> <input\n");
      out.write("									type=\"hidden\" name=\"createdDatetime\"\n");
      out.write("									value=\"");
      out.print(DataUtility.getTimestamp(dto.getCreateddatetime()));
      out.write("\">\n");
      out.write("								<input type=\"hidden\" name=\"modifiedDatetime\"\n");
      out.write("									value=\"");
      out.print(DataUtility.getTimestamp(dto.getModifieddatetime()));
      out.write("\">\n");
      out.write("							</div>\n");
      out.write("							<div class=\"md-form\">\n");
      out.write("							 \n");
      out.write("								\n");
      out.write("		<div class=\"col-sm-12\">\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("       <label><b>Course Name</b></label>\n");
      out.write("	    <span style=\"color:red;\">*</span> &nbsp;&nbsp;&nbsp;\n");
      out.write("        <div class=\"input-group-prepend\">\n");
      out.write("          <div class=\"input-group-text\"><i class=\"fa fa-book grey-text\" style=\"font-size: 1rem;\"></i> </div>\n");
      out.write("        </div>\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"cname\" placeholder=\"Enter Course Name\" value=\"");
      out.print(DataUtility.getStringData(dto.getCoursename()));
      out.write("\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color=\"red\" class=\"pl-sm-5\"> ");
      out.print(ServletUtility.getErrorMessage("cname", request));
      out.write("</font></br>							\n");
      out.write("								\n");
      out.write("	\n");
      out.write("	<div class=\"col-sm-12\">\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("      <label><b>Duration</b></label>\n");
      out.write("	<span style=\"color:red;\">*</span> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; \n");
      out.write("        <div class=\"input-group-prepend\">\n");
      out.write("          <div class=\"input-group-text\"><i class=\"fa fa-clock grey-text\" style=\"font-size: 1rem;\"></i> </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("									");

										HashMap map = new HashMap();
										map.put("1Year", "1Year");
										map.put("2Year", "2Year");
										map.put("3Year", "3Year");
										map.put("4Year", "4Year");
										map.put("5Year", "5Year");
										String HtmlList = HTMLUtility.getList("duration", dto.getDuration(), map);
									
      out.write("\n");
      out.write("									");
      out.print(HtmlList);
      out.write("</div>\n");
      out.write("      \n");
      out.write("    </div>		\n");
      out.write("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <font color=\"red\" class=\"pl-sm-5\"> ");
      out.print(ServletUtility.getErrorMessage("duration", request));
      out.write("</font></br>\n");
      out.write("								\n");
      out.write("							\n");
      out.write("								\n");
      out.write("	  <div class=\"col-sm-12\">\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("      <label><b>Description</b></label>\n");
      out.write("	   <span style=\"color:red;\">*</span> &nbsp; &nbsp; &nbsp; &nbsp;\n");
      out.write("        <div class=\"input-group-prepend\">\n");
      out.write("          <div class=\"input-group-text\"><i class=\"fa fa-list grey-text\" style=\"font-size: 1rem;\"></i> </div>\n");
      out.write("        </div>\n");
      out.write("       <textarea name=\"desc\" placeholder=\"Enter description\" class=\"form-control\"\n");
      out.write("		 rows=\"5\" cols=\"5\">");
      out.print(DataUtility.getStringData(dto.getDescription()));
      out.write("</textarea>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("							</br>\n");
      out.write("							");

								if(id>0) {
							
      out.write("\n");
      out.write("							<div class=\"text-center\">\n");
      out.write("\n");
      out.write("								<input type=\"submit\" name=\"operation\"\n");
      out.write("									class=\"btn btn-success btn-md\" style=\"font-size: 17px\"\n");
      out.write("									value=\"");
      out.print(CourseCtl.OP_UPDATE);
      out.write("\"> <input type=\"submit\"\n");
      out.write("									name=\"operation\" class=\"btn btn-warning btn-md\"\n");
      out.write("									style=\"font-size: 17px\" value=\"");
      out.print(CourseCtl.OP_CANCEL);
      out.write("\">\n");
      out.write("							</div>\n");
      out.write("							");

								} else {
							
      out.write("\n");
      out.write("							<div class=\"text-center\">\n");
      out.write("\n");
      out.write("								<input type=\"submit\" name=\"operation\"\n");
      out.write("									class=\"btn btn-success btn-md\" style=\"font-size: 17px\"\n");
      out.write("									value=\"");
      out.print(CourseCtl.OP_SAVE);
      out.write("\"> <input type=\"submit\"\n");
      out.write("									name=\"operation\" class=\"btn btn-warning btn-md\"\n");
      out.write("									style=\"font-size: 17px\" value=\"");
      out.print(CourseCtl.OP_RESET);
      out.write("\">\n");
      out.write("							</div>\n");
      out.write("							");

								}
							
      out.write("\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col-md-4 mb-4\"></div>\n");
      out.write("				</div>\n");
      out.write("				\n");
      out.write("				\n");
      out.write("				\n");
      out.write("		</form>\n");
      out.write("		</main>\n");
      out.write("\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title></title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".footer{\n");
      out.write("    backdrop-filter: saturate(180%) blur(20px);\n");
      out.write("    background: linear-gradient(to bottom, #fdd9eaec, rgb(231, 248, 232));\n");
      out.write("   left: 0;\n");
      out.write("   bottom: 1px;\n");
      out.write("   height: 7%;\n");
      out.write("   text-align:center;\n");
      out.write("   position: -webkit-sticky;\n");
      out.write("	position: sticky;\n");
      out.write("	width: 100%;\n");
      out.write("	\n");
      out.write("	top: 100%;\n");
      out.write("}\n");
      out.write("#text{\n");
      out.write("    font-size: 15px;\n");
      out.write("    font-weight: 500;\n");
      out.write("    /*  color:#15293e; */\n");
      out.write("    /* color: #003586; */\n");
      out.write("     color: #000119;\n");
      out.write("     font-family: Arial, Helvetica, sans-serif;\n");
      out.write("     \n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<body>\n");
      out.write("        <div class=\"footer\"><h8 id=\"text\"  >&#169; 2021, Rays Technologies,  SunilOS Infotech Pvt Ltd.</h8></div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
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
