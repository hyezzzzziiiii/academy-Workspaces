/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.40
 * Generated at: 2021-01-01 05:14:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _04_005fAction_005fto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1> 아래의 내용으로 회원가입이 완료되었습니다. </h1>\r\n");
      out.write("\tget방식으로 전송된 주소경로 및 내용 : <br/>\r\n");
      out.write("\thttp://localhost:8090/WEB07_JSP_SERVELET/01/03_Action_to.jsp?\r\n");
      out.write("\tname=%ED%99%8D%EA%B8%B8%EB%8F%99&jumun_1=900203&\r\n");
      out.write("\tjumin_2=1234567&id=idid01&pwd=12345&pwd_re12345<br/><br/>\r\n");
      out.write("\t\r\n");
      out.write("\tpost방식으로 전송된 주소경로 및 내용 : <br/>\t\r\n");
      out.write("\thttp://localhost:8090/WEB07_JSP_SERVELET/01/03_Action_to.jsp?<br/><br/>\r\n");
      out.write("\t<!-- form 태그에 의해 전송된 데이터들은 대상페이지의 주소를 통해 전달됩니다\r\n");
      out.write("\t주로 get방식에서 그 모양을 확인할 수 있으며, post방식은 내용이 숨겨져전달되므로 모양을 확인 할 수 없습니다.\r\n");
      out.write("\t다만 둘다 전달되는 내용은 같은 내용이 전달되고 사용방법도 똑같습니다. -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 전달된 내용의 사용방법  -->\r\n");
      out.write("\t");

	request.setCharacterEncoding("UTF-8"); //전달내용의 한글 인코딩을 UTF8로 맞춤
		String name = request.getParameter("name");
		String jumin_1 = request.getParameter("jumin_1");
		String jumin_2 = request.getParameter("jumin_2");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String pwd_re= request.getParameter("pwd_re");
	
      out.write("\r\n");
      out.write("\t<!-- JSP에서도 변수를 선언하고 저장하여 화면에 출력될 수 있습니다.\r\n");
      out.write("\t전달된 form의 요소들을 하나하나 얻어내는 방법\r\n");
      out.write("\t변수 = request.getParameter(\"전달요소의 name값\");\r\n");
      out.write("\t위의 명령이 실행되면 전달요소의 value값(name과 같이 전달된 입력내용)이 변수에 저장됩니다 -->\r\n");
      out.write("\t성명 : ");
      out.print(name );
      out.write(" <br>\r\n");
      out.write("\t주민등록번호 : ");
      out.print(jumin_1 );
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(jumin_2 );
      out.write(" <br>\r\n");
      out.write("\t아이디 : ");
      out.print(id );
      out.write(" <br>\r\n");
      out.write("\t비밀번호 : ");
      out.print(pwd );
      out.write(" <br>\r\n");
      out.write("\t비밀번호 확인 : ");
      out.print(pwd_re );
      out.write(" <br>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
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
