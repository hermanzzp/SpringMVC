/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2015-05-20 02:13:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.company.steelTemplate1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/company/steelTemplate1/footer.jsp", Long.valueOf(1432087921633L));
    _jspx_dependants.put("/company/steelTemplate1/header.jsp", Long.valueOf(1432087917647L));
  }

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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/siteShops/steelTemplate1/styles.css\" />\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"top-header\">\r\n");
      out.write("\t\t\t\t<div id=\"company-logo\">\r\n");
      out.write("\t\t\t\t\t<h1><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/logo.png\" /></h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul id=\"main-navigation\">\r\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ee/companyShops/steelTemplate1/body.xhtml\">ä¸»é¡µ</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ee/companyShops/steelTemplate1/companyIntro.xhtml\">å³äºæä»¬</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ee/companyShops/steelTemplate1/salesInfo.xhtml\">ä¾åºäº§å</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ee/companyShops/steelTemplate1/businessInfo.xhtml\">éè´­ä¿¡æ¯</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ee/companyShops/steelTemplate1/successfulCase.xhtml\">åºç¨æ¡ä¾</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ee/companyShops/steelTemplate1/technicalArticle.xhtml\" >ææ¯æç« </a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ee/companyShops/steelTemplate1/contact.xhtml\" class=\"last\">èç³»æä»¬</a></li>\r\n");
      out.write("\t\t  \t \t</ul>\r\n");
      out.write("\t\t\t    <div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  \t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/companyShops/steelTemplate1.css\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<!-- banner -->\r\n");
      out.write("\t\t\t<div id=\"header-banner-wrap\">\r\n");
      out.write("\t\t\t\t<div id=\"header-banner\">\r\n");
      out.write("\t\t\t\t   <h2>瑞典特牢钢</h2>\r\n");
      out.write("\t\t\t\t   <h2>\r\n");
      out.write("\t\t\t\t   \t  <p>由钢厂直接预硬的淬火调质钢，不再需要热处理。<br/>\r\n");
      out.write("\t\t\t\t\t\t ◆ 钢板本身即拥有ESR电渣重熔的纯净性能。<br/>\r\n");
      out.write("\t\t\t\t\t\t ◆ 适用于高抛光，精蚀刻以及对表面进行氮化和PVD涂层处理要求的模具钢。\r\n");
      out.write("\t\t\t\t\t  </p>\r\n");
      out.write("\t\t\t\t\t  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/icon1.png\" width=\"165\" height=\"40\" />\r\n");
      out.write("\t\t\t\t    </h2>\r\n");
      out.write("\t             \t<a href=\"#\" class=\"big-button iePNG\"></a><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/globe.png\" id=\"globe\" alt=\"\" />\r\n");
      out.write("\t\t\t   \t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div class=\"wide-wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"content-container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box\">\r\n");
      out.write("\t\t\t\t\t\t<h3>我们的产品</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"services\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">瑞典特殊钢</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">国产模具钢</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">超级先锋不锈钢</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">宝山电极铜材</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">产品名称产品名称产品名称</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box wide-box\">\r\n");
      out.write("\t\t\t\t\t\t<h3>诚信赢得客户 \t</h3>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/photo-man.jpg\" class=\"photo\" alt=\"\" /> 【公司名称】有限公司，简称为神基科技或神基，公司英文名称为MiTAC Technology Corporation，为台湾联华神通集团（MiTAC Synnex Group）旗下子公司之一，并与神通电脑及神达电脑共同使用“MiTAC”商标。 神基科技以笔记型电脑代工为主，并且跨足消费性电子产品、电源产品等领域，也致力于软件专利的开发，旗下所拥有的Instant Play软件可以让使用者在电脑开机十秒内直接进入影音系统。  </p>\r\n");
      out.write("\t\t\t\t\t\t\t<p> 现有四大事业体包含:便携式强固型电脑、商规笔记型电脑、电源产品、软件开发 。 </p>\r\n");
      out.write("\t\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t \t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!--<div class=\"content-container middle-side\">\r\n");
      out.write("\t\t\t  \t<div class=\"info-box\">\r\n");
      out.write("\t\t\t\t\t<h4>咨询中心</h4>\r\n");
      out.write("\t\t\t\t\t<div class=\"align-content\">\r\n");
      out.write("\t\t\t\t\t\t<p><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/photo-girl-1.jpg\" class=\"photo\" alt=\"\" /></p>\r\n");
      out.write("\t\t\t\t\t\t<p>如果您对我们的产品和服务有什么建议可点击邮件发送。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t  \t<a href=\"#\" class=\"readmore-small\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/more.png\" width=\"111\" height=\"33\" alt=\"\" /></a>\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"info-box\">\r\n");
      out.write("\t\t\t\t\t<h4>新闻与活动</h4>\r\n");
      out.write("\t\t\t\t\t<div class=\"align-content\">\r\n");
      out.write("\t\t\t\t\t\t<p><strong class=\"date\">23/11/2010</strong> XYD参加全国测绘仪器信息交流会，  2010年全国测绘仪器信息交流会在美丽的西子湖畔召开，神达<a href=\"http://product.pcpop.com/PC/00000_1.html\" target=\"_blank\">电脑</a>受邀参加了本次大会，<a href=\"#\">...</a></p>\r\n");
      out.write("\t\t\t\t\t\t<p><strong class=\"date\">24/09/2010</strong>XYD参加全国测绘仪器信息交流会，  2010年全国测绘仪器信息交流会在美丽的西子湖畔召开 <a href=\"#\">...</a></p>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"readmore-small\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/more.png\" width=\"111\" height=\"33\" /></a>\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"info-box\">\r\n");
      out.write("\t\t\t\t\t<h4>关于我们</h4>\r\n");
      out.write("\t\t\t\t\t<div class=\"align-content\">\r\n");
      out.write("\t\t\t\t\t\t<p>为客户提供高品质、性能稳定且价格实惠的冷作刚SKD11、S7，热作钢SKD61，塑料模具钢PSTP4、PSTP4M、PSTP10，火焰淬火工具钢PST23F85。2010年11月， </p>\r\n");
      out.write("\t\t\t\t\t\t<p>公司与杭州安格力斯贸易有限公司签订协议，江苏地区的专业经销商，为模具行业带来全新的制作理念。公司拥有多套铣磨加工设备，为客户提供一条龙的光、精板加工服务。</p>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"readmore-small\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/more.png\" width=\"111\" height=\"33\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>-->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!--<div class=\"wide-wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"content-container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box\">\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<h3>联系我们</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"telmail\">\r\n");
      out.write("\t\t\t\t\t\t\t<li style=\"background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/phone.png) no-repeat;\">400-678-0626</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li style=\"background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/email.png) no-repeat;\">service@mail.com</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box\">\r\n");
      out.write("\t\t\t\t\t\t<h3>我们的使命</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>展望未来，XYD将致力于提升产品增值服务的质量，并用更前瞻性的眼光和虚心的学习态度去看待全球市场，立志在机构件行业里，成为世界舞台上所有国际大厂不可或缺的重要伙伴。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/companyShops/steelTemplate1/photo-girl-2.jpg\" alt=\"\" width=\"239\" height=\"184\" class=\"photo\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("  </body>\r\n");
      out.write("  ");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${facesContext.externalContext.requestContextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/siteShops/steelTemplate1/styles.css\" />\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\tCopyrightÂ©2009 Pexetech co. All rights reserved.Â <br />\r\n");
      out.write("\t\t\t<a href=\"http://www.miibeian.gov.cn/\" target=\"_blank\">èICPå¤09040642å·</a>Â ææ¯æ¯æï¼<a href=\"http://www.moldcio.com:8080/erp/cn/about/about.xhtml\" target=\"_blank\">Â åæºä¿¡æ¯</a> \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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