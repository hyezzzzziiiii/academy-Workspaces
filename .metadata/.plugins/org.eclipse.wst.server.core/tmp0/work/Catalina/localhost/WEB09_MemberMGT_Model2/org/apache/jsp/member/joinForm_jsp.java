/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.40
 * Generated at: 2021-01-02 11:47:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class joinForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function joinCheck(){\r\n");
      out.write("\tif( document.frm.name.value.length==0){\r\n");
      out.write("\t\talert(\"????????? ????????????\");\t\tfrm.name.focus();\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif( document.frm.userid.value.length<4){\r\n");
      out.write("\t\talert(\"???????????? 4?????? ??????????????? ?????????\");\t\tfrm.userid.focus();\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif( document.frm.pwd.value==\"\"){\r\n");
      out.write("\t\talert(\"????????? ????????? ??????????????? ?????????\");\t\tfrm.pwd.focus();\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif( document.frm.pwd.value != document.frm.pwd_check.value){\r\n");
      out.write("\t\talert(\"????????? ???????????? ????????????\");\t\tfrm.pwd_check.focus();\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (document.frm.reid.value != document.frm.userid.value) {\r\n");
      out.write("\t\talert(\"?????? ?????? ???????????????\");\t\tfrm.userid.focus();\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function idCheck(){\r\n");
      out.write("\t/* userid ?????? ??????????????? ?????? ???????????? ?????? ???????????? ????????????????????? ????????? ?????? ??????\r\n");
      out.write("\tuserid ?????? ????????? ????????? ???????????? ?????? ??????????????? ???????????? ???????????????*/\r\n");
      out.write("\tif( document.frm.userid.value.length <=3){\r\n");
      out.write("\t\talert(\"???????????? ???????????????\");\r\n");
      out.write("\t\tfrm.userid.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar inputid = document.frm.userid.value;  // ????????? ????????? ??????\r\n");
      out.write("\t// ????????? ??????\r\n");
      out.write("\tvar opt = \"toolbar=no, scrollbars=no, resizable=no, width=500, height=200\";\r\n");
      out.write("\t// idcheck.do ??? ?????? ????????? ??????????????? ??? ???????????? ???????????? ?????? ?????????.\r\n");
      out.write("\twindow.open(\"member.do?command=idcheck&userid=\" + inputid , \"idcheck\", opt);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>?????? ??????</h2>\r\n");
      out.write("'*' ?????? ????????? ?????? ?????? ???????????????.\r\n");
      out.write("<form action=\"member.do\" method=\"post\" name=\"frm\">\r\n");
      out.write("<input type=\"hidden\" name=\"command\" value=\"join\"> \r\n");
      out.write("<table>\r\n");
      out.write("\t<tr><td>??????</td><td><input type=\"text\" name=\"name\" size=\"20\"> * </td></tr>\r\n");
      out.write("\t<tr><td>?????????</td><td><input type=\"text\" name=\"userid\" size=\"20\"> * \r\n");
      out.write("\t\t<input type=\"button\" value=\"?????? ??????\" onClick=\"idCheck();\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"reid\" value=\"\"></td></tr>\r\n");
      out.write("\t\t<tr><td>??????</td><td><input type=\"password\" name=\"pwd\" size=\"20\"> * </td></tr>\r\n");
      out.write("\t\t<tr><td>????????????</td>\r\n");
      out.write("\t\t\t<td><input type=\"password\" name=\"pwd_check\" size=\"20\">&nbsp;*</td></tr>\r\n");
      out.write("\t\t<tr><td>?????????</td><td><input type=\"text\" name=\"email\" size=\"20\"></td></tr>\r\n");
      out.write("\t\t<tr><td>????????????</td><td><input type=\"text\" name=\"phone\" size=\"20\"></td></tr>\r\n");
      out.write("\t\t<tr><td>??????</td>\r\n");
      out.write("\t\t\t<td><input type=\"radio\" name=\"admin\" value=\"0\" checked = \"checked\">\t???????????? \r\n");
      out.write("\t\t\t\t    <input type=\"radio\" name=\"admin\" value=\"1\"> ?????????\t</td></tr>\r\n");
      out.write("\t\t<tr><td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"??????\" onclick=\"return joinCheck()\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"reset\" value=\"??????\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"????????????\" \r\n");
      out.write("\t\t\t\tonClick=\"location.href='member.do?command=login_form'\">\r\n");
      out.write("\t\t\t</td></tr>\r\n");
      out.write("</table>\t\r\n");
      out.write("</form>\r\n");
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
