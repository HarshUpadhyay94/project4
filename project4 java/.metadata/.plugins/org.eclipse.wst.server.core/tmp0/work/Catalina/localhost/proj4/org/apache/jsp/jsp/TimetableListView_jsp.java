/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2022-01-09 14:00:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.sunrays.model.TimetableModel;
import in.co.sunrays.controller.TimetableListCtl;
import in.co.sunrays.util.DataUtility;
import in.co.sunrays.util.HTMLUtility;
import in.co.sunrays.bean.TimetableBean;
import java.util.Iterator;
import java.util.List;
import in.co.sunrays.util.ServletUtility;
import in.co.sunrays.controller.ORSView;
import in.co.sunrays.controller.LoginCtl;
import in.co.sunrays.bean.RoleBean;
import in.co.sunrays.bean.UserBean;
import in.co.sunrays.controller.ORSView;

public final class TimetableListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1640861516979L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1641734794522L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.sunrays.bean.UserBean");
    _jspx_imports_classes.add("in.co.sunrays.util.DataUtility");
    _jspx_imports_classes.add("in.co.sunrays.bean.TimetableBean");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.sunrays.controller.ORSView");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("in.co.sunrays.model.TimetableModel");
    _jspx_imports_classes.add("in.co.sunrays.controller.TimetableListCtl");
    _jspx_imports_classes.add("in.co.sunrays.bean.RoleBean");
    _jspx_imports_classes.add("in.co.sunrays.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.sunrays.util.HTMLUtility");
    _jspx_imports_classes.add("in.co.sunrays.util.ServletUtility");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16*16\"/>\r\n");
      out.write("<title> TimeTable List</title>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT );
      out.write("/js/jquery.min.js\"\"></script>\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT );
      out.write("/js/Checkbox11.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script >\r\n");
      out.write("function DisableSunday(date){\r\n");
      out.write("\tvar day = date.getDay();\r\n");
      out.write("\tif(day == 0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\treturn [false];\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\treturn [true];\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("$(function() {\r\n");
      out.write("\t\t    $(\"#udate6\").datepicker({\r\n");
      out.write("\t\t      beforeShowDay : DisableSunday,\r\n");
      out.write("\t\t    \tchangeMonth: true,\r\n");
      out.write("\t\t      \t changeYear: true,\r\n");
      out.write("\t\t\t\t  yearRange:'0:+2',\r\n");
      out.write("\t\t\t\t  dateFormat:'mm/dd/yy',\r\n");
      out.write("\t\t  \t  });\r\n");
      out.write("\t\t  \t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      in.co.sunrays.bean.TimetableBean bean = null;
      bean = (in.co.sunrays.bean.TimetableBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.sunrays.bean.TimetableBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<HEAD>\r\n");
      out.write("\t<style>\r\n");
      out.write("\tform {height:85%!important;}\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#datepicker\").datepicker({\r\n");
      out.write("\t\t\tdateFormat : 'mm/dd/yy',\r\n");
      out.write("\t\t\tchangeMonth : true,\r\n");
      out.write("\t\t\tchangeYear : true,\r\n");
      out.write("\t\t\tmaxDate:'12/31/2003',\r\n");
      out.write("\t\t \tminDate:'01/01/1981'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
      out.write("\t");

    UserBean ub = (UserBean)session.getAttribute("user");
    boolean userLoggedIn = ub != null;
    String welcomeMsg = "Hi, ";
    if (userLoggedIn) {
        String role = (String)session.getAttribute("role");
        welcomeMsg += ub.getFirstName() + " (" + role + ")";
    } else {
        welcomeMsg += "Guest";
    }
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table >\r\n");
      out.write("    <tr ><th></th>\r\n");
      out.write("       <td width=\"90%\" >\r\n");
      out.write("       <a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</b></a> |\r\n");
      out.write("            \t");

            		if (userLoggedIn) {
      		 	 
      out.write(" \r\n");
      out.write("       <a href=\" ");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</b></a>\r\n");
      out.write("\r\n");
      out.write("            ");

                } else {
            
      out.write(" \r\n");
      out.write("            <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</b></a> \r\n");
      out.write("            ");

  			   } 
       
      out.write(" \r\n");
      out.write(" \t\t</td>\r\n");
      out.write("        <td rowspan=\"2\" >\r\n");
      out.write("            <h1 align=\"right\" >\r\n");
      out.write("                <img src= \"");
      out.print(ORSView.APP_CONTEXT );
      out.write("/img/Logo.jpg\"  width=\"350\" height=\"90\">\r\n");
      out.write("            </h1>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <tr><th></th>\r\n");
      out.write("      <td>\r\n");
      out.write("        <h3>");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \r\n");
      out.write("    ");

        if (userLoggedIn) {
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr><th></th>\r\n");
      out.write("      <td colspan=\"2\" >    \r\n");
      out.write("      \r\n");
      out.write("        <font style=\"font-size: 18px\">\r\n");
      out.write("       \t \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</b></a> |       \r\n");
      out.write("         <a href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</b></a> |\r\n");
      out.write("       \t <a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</b></a> |              \r\n");
      out.write("       \t <a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet MeritList</b></a> |\r\n");
      out.write("        \r\n");
      out.write("        ");

            if (ub.getRoleId() == RoleBean.ADMIN) {
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</b></a> | \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</b></a> |         \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</b></a> |        \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</b></a> |        \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</b></a> |        \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_CTL );
      out.write("\" >Add Course</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_CTL );
      out.write("\" >Add Subject</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\">Subject List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_CTL );
      out.write("\" >Add Faculty</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_CTL );
      out.write("\" >Add TimeTable</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a target=\"blank\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\">Java Doc</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (ub.getRoleId() == RoleBean.STUDENT) {
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\">Subject List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\t");

            if (ub.getRoleId() == RoleBean.KIOSK) {
        
      out.write(" \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (ub.getRoleId() == RoleBean.FACULTY) {
         	
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_CTL );
      out.write("\" >Add Subject</b></a> |   \r\n");
      out.write("        <br>    \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\">Subject List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_CTL );
      out.write("\" >Add TimeTable</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (ub.getRoleId() == RoleBean.COLLEGE_SCHOOL) {
           System.out.println("======>><><>"+ub.getRoleId());	
          
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t</font>\r\n");
      out.write(" \t\t</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \t");

        	}
   		 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<hr>\r\n");
      out.write("</body>\t\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\" method=\"post\"> \r\n");
      out.write("\t\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t<h1>TimeTable List</h1>\r\n");
      out.write("\t<h1>\r\n");
      out.write("\t\t<font style=\"font: bold ; color: red\">");
      out.print(ServletUtility.getErrorMessage(request) );
      out.write("</font>\t\r\n");
      out.write("\t\t<font style=\"font: bold ; color: green\">");
      out.print(ServletUtility.getSuccessMessage(request) );
      out.write("</font>\t\r\n");
      out.write("\t</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");

		List cList = (List) request.getAttribute("courseList");
		List sList = (List) request.getAttribute("subjectList"); 
	
      out.write('\r');
      out.write('\n');
      out.write('	');

	int pageNo = ServletUtility.getPageNo(request);
	int pageSize = ServletUtility.getPageSize(request);	
	int index = ((pageNo-1)*pageSize)+1;

	List list = ServletUtility.getList(request);
	Iterator<TimetableBean> it = list.iterator();
	 
	if(list.size() !=0){

	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<table width =\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td align=\"center\">\r\n");
      out.write("\t\t<label>Course Name :</label>\r\n");
      out.write("\t\t");
      out.print(HTMLUtility.getList("clist", String.valueOf(bean.getCourse_Id()), cList) );
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<label>Subject Name :</label>\r\n");
      out.write("\t\t");
      out.print(HTMLUtility.getList("slist", String.valueOf(bean.getSubject_Id()), sList) );
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t<label>Date Of Exam :</label>\r\n");
      out.write("\t\t<input type =\"text\"  name=\"Date\" readonly=\"readonly\" id =\"udate6\" placeholder=\"Select Date\" value=\"");
      out.print(ServletUtility.getParameter("Date", request));
      out.write("\">\t\t\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t<input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableListCtl.OP_SEARCH);
      out.write("\">\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t<input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableListCtl.OP_RESET );
      out.write("\">\r\n");
      out.write("\t\t</td>\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("<br>\t\r\n");
      out.write("\t<table border=\"1\" width=\"100%\" align=\"center\" cellpadding=6px cellspacing=\".2\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<th><input type=\"checkbox\" id=\"select_all\">Select All</th>\r\n");
      out.write("\t\t\t<th>S.No.</th>\t\r\n");
      out.write("\t\t\t<th>Course Name.</th>\r\n");
      out.write("\t\t\t<th>Subject Name.</th>\r\n");
      out.write("<!-- \t\t\t<th>DESCRIPTION.</th> -->\r\n");
      out.write("\t\t\t<th>SEMESTER.</th>\r\n");
      out.write("\t\t\t<th>ExamDate.</th>\r\n");
      out.write("\t\t\t<th>ExamTime.</th>\r\n");
      out.write("\t\t\t<th>Edit</th>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");

	while(it.hasNext()){
	bean =it.next();	
	
      out.write("\r\n");
      out.write("\t<tr align=\"center\">\r\n");
      out.write("\t\t<td><input type = \"checkbox\" class=\"checkbox\" name=\"ids\" value=\"");
      out.print(bean.getId());
      out.write("\"></td>\r\n");
      out.write("\t\t<td>");
      out.print(index++ );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getCourse_Name() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getSubject_Name() );
      out.write("</td>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<td>");
      out.print(bean.getSemester() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getExam_Date() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getExam_Time() );
      out.write("</td>\r\n");
      out.write("\t\t<td><a href =\"TimetableCtl?id=");
      out.print(bean.getId());
      out.write("\">Edit</a></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t");
 
		}
		
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<table width = \"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t");
if(pageNo==1){ 
      out.write("\r\n");
      out.write("\t\t\t<td align=\"left\"><input type=\"submit\" name=\"operation\" disabled=\"disabled\" value=\"");
      out.print(TimetableListCtl.OP_PREVIOUS);
      out.write("\" ></td>\r\n");
      out.write("\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t<td align=\"left\"><input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableListCtl.OP_PREVIOUS);
      out.write("\" ></td>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t<td><input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableListCtl.OP_DELETE);
      out.write("\"></td>\r\n");
      out.write("\t\t\t<td><input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableListCtl.OP_NEW);
      out.write("\"></td>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");

					TimetableModel model = new TimetableModel();
				
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t ");
if(list.size()<pageSize ||model.nextPK()-1 == bean.getId()){ 
		 
				
		 
      out.write("\t\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\t<td align=\"right\"><input type=\"submit\" disabled=\"disabled\" name=\"operation\" value=\"");
      out.print(TimetableListCtl.OP_NEXT);
      out.write("\" ></td>\r\n");
      out.write("\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t<td align=\"right\"><input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableListCtl.OP_NEXT);
      out.write("\" ></td>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t");
}if(list.size() == 0){ 
      out.write("\r\n");
      out.write("            \t\t<td align=\"center\"><input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableListCtl.OP_BACK);
      out.write("\"></td>\t\r\n");
      out.write("            \t\t");
 } 
      out.write("\r\n");
      out.write("            \r\n");
      out.write("\t\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"operation\" value=\"");
      out.print(pageNo );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"operation\" value=\"");
      out.print(pageSize);
      out.write("\">\r\n");
      out.write("</form>\r\n");
      out.write("</center>\r\n");
      out.write("<br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<style >\r\n");
      out.write(".footer{\r\n");
      out.write("position: fixed;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  background-color: white;\r\n");
      out.write("  color: black;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  }</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class = \"footer\">\r\n");
      out.write("<HR>\r\n");
      out.write("     <H3>&copy; Copyright RAYS Technologies</H3>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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
