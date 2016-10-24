/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-10-24 03:19:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class symptom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\t<head>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/js/jquery.mobile-1.4.5/jquery.mobile-1.4.5.min.css\">\r\n");
      out.write("\t\t<script src=\"/js/jquery-1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/js/jquery.mobile-1.4.5/jquery.mobile-1.4.5.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("      .choose{\r\n");
      out.write("        background-color: #373737;\r\n");
      out.write("        color: #FFFFFF;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("<div data-role=\"page\" id=\"pageone\">\r\n");
      out.write("  <div data-role=\"header\">\r\n");
      out.write("    <a href=\"#\" class=\"ui-btn ui-corner-all ui-shadow ui-icon-home ui-btn-icon-left\">主页</a>\r\n");
      out.write("    <h1>症状</h1>\r\n");
      out.write("    <a href=\"#pagetwo\" class=\"ui-btn ui-btn-right ui-corner-all ui-shadow ui-icon-plus ui-btn-icon-left\">选择</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div data-role=\"content\">\r\n");
      out.write("    <ul data-role=\"listview\" id=\"symptom\">\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"ui-btn\" data-ajax=\"false\" onclick=\"diagnose()\">诊断</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div data-role=\"page\" id=\"pagetwo\">\r\n");
      out.write("  <div data-role=\"header\">\r\n");
      out.write("    <h1>医学词典</h1>\r\n");
      out.write("    <a href=\"#pageone\" id=\"enter\" class=\"ui-btn ui-btn-right ui-corner-all ui-shadow ui-icon-check ui-btn-icon-left\">确定</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div data-role=\"main\">\r\n");
      out.write("    <div data-role=\"collapsible-set\">\r\n");
      out.write("      <div data-role=\"collapsible\">\r\n");
      out.write("        <h1>头部</h1>\r\n");
      out.write("        <div data-role=\"collapsible\">\r\n");
      out.write("          <h1>鼻</h1>\r\n");
      out.write("          <ul data-role=\"listview\"> \r\n");
      out.write("            <li data-icon=\"false\">鼻塞</li>\r\n");
      out.write("            <li data-icon=\"false\">流鼻涕</li>\r\n");
      out.write("            <li data-icon=\"false\">鼻出血</li>\r\n");
      out.write("            <li data-icon=\"false\">流鼻血</li>\r\n");
      out.write("            <li data-icon=\"false\">嗅觉障碍</li>\r\n");
      out.write("            <li data-icon=\"false\">鼻痛</li>\r\n");
      out.write("            <li data-icon=\"false\">鼻腔有异物</li>\r\n");
      out.write("            <li data-icon=\"false\">鼻子红肿</li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div data-role=\"collapsible\">\r\n");
      out.write("        <h3>颈部</h3>\r\n");
      out.write("        <p>我是可折叠的内容。</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div data-role=\"collapsible\">\r\n");
      out.write("        <h3>胸部</h3>\r\n");
      out.write("        <p>我是可折叠的内容。</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div data-role=\"collapsible\">\r\n");
      out.write("        <h3>背部</h3>\r\n");
      out.write("        <p>我是可折叠的内容。</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div data-role=\"collapsible\">\r\n");
      out.write("        <h3>上肢</h3>\r\n");
      out.write("        <p>我是可折叠的内容。</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div data-role=\"collapsible\">\r\n");
      out.write("        <h3>腹部</h3>\r\n");
      out.write("        <p>我是可折叠的内容。</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div data-role=\"collapsible\">\r\n");
      out.write("        <h3>腰部</h3>\r\n");
      out.write("        <p>我是可折叠的内容。</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div data-role=\"collapsible\">\r\n");
      out.write("        <h3>盆骨</h3>\r\n");
      out.write("        <p>我是可折叠的内容。</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div data-role=\"collapsible\">\r\n");
      out.write("        <h3>下肢</h3>\r\n");
      out.write("        <p>我是可折叠的内容。</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div data-role=\"collapsible\">\r\n");
      out.write("        <h3>其他</h3>\r\n");
      out.write("        <p>我是可折叠的内容。</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t<script>\r\n");
      out.write("      $(document).on(\"pageinit\",\"#pagetwo\",function(){\r\n");
      out.write("        $(\"li\").on(\"tap\",function(){\r\n");
      out.write("          //选中效果，背景变黑\r\n");
      out.write("          if(!$(this).hasClass(\"choose\")){\r\n");
      out.write("           $(this).css(\"background-color\",\"#373737\");\r\n");
      out.write("           $(this).css(\"color\",\"#FFFFFF\");\r\n");
      out.write("           $(this).addClass(\"choose\");\r\n");
      out.write("         }else{\r\n");
      out.write("           //取消选中，背景变白\r\n");
      out.write("           $(this).css(\"background-color\",\"#FFFFFF\");\r\n");
      out.write("           $(this).css(\"color\",\"#333333\");\r\n");
      out.write("           $(this).removeClass(\"choose\");\r\n");
      out.write("         }\r\n");
      out.write("        });\r\n");
      out.write("        //添加到症状列表\r\n");
      out.write("        $(\"#enter\").on(\"tap\",function(){\r\n");
      out.write("          var $newli = $(\"#pagetwo .choose\").clone();\r\n");
      out.write("          $newli.css(\"background-color\",\"#FFFFFF\");\r\n");
      out.write("          $newli.css(\"color\",\"#333333\");\r\n");
      out.write("          $(\"#symptom\").empty().append($newli);\r\n");
      out.write("        });                \r\n");
      out.write("      });\r\n");
      out.write("      //跳转到推荐医生列表界面\r\n");
      out.write("      function diagnose(){\r\n");
      out.write("      \tvar $link = \"recommandJsp?symptoms=\";\r\n");
      out.write("      \t$(\"#symptom li\").each(function(){\r\n");
      out.write("      \t\t$link += $(this).text()+\",\";\r\n");
      out.write("      \t});\r\n");
      out.write("      \tlocation.href = $link;\r\n");
      out.write("      \treturn false;\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
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