package org.apache.jsp.xitongguanli;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class taskOrganizationBrowsing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty_005fonclick_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty_005fonclick_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty_005fonclick_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=gbk");
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
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<html>\r\n");
          out.write("\t<head>\r\n");
          out.write("\t\t<title>工作流权限分配</title>\r\n");
          out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
          out.write("\t\t<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
          out.write("\t\t<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
          out.write("\t\t<script>\r\n");
          out.write("\t\tfunction selectTask(obj, xml){\r\n");
          out.write("\t\t\tlocation.href=\"workflowAction.do?method=preOrganizationTask&task=\"+obj.options[obj.selectedIndex].value+\"&xml=\"+xml;\t\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\tfunction deleteO(){\r\n");
          out.write("\t\t\tdocument.getElementById(\"organizationTaskForm\").submit();\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\tfunction create(){\r\n");
          out.write("\t\t\tlocation.href = \"workflowAction.do?method=preCreateOrganizationTask&task=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\tfunction selectOrganization(){\r\n");
          out.write("\t\t\topen_window('OrganizationSelector.htm',600,400);\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\tfunction confirmUser(userId,select){\r\n");
          out.write("\t\t\tvar flag = window.parent.opener.document.getElementById(\"_OrganizationSelector\").value;\t\t\t\t\t\r\n");
          out.write("\t\t\tif(flag == \"organizationToAuthorization\")\t\r\n");
          out.write("\t\t\t\twindow.parent.opener.location.href=\"safeControlAction.do?method=searchAllByOrganization&Id=\" + userId;\r\n");
          out.write("\t\t\telse\r\n");
          out.write("\t\t\t\twindow.parent.opener.location.href=\"safeControlAction.do?method=searchActorByOrganization&Id=\" + userId;\r\n");
          out.write("\t\t\twindow.parent.close();\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\t</script>\r\n");
          out.write("\t</head>\r\n");
          out.write("\t<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" class=mainbody>\r\n");
          out.write("\t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          _jspx_th_html_005fform_005f0.setAction("/xitongguanli/workflowAction?method=deleteOrganizationTask");
          int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
          if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=title>\r\n");
              out.write("\t\t\t<tr>\r\n");
              out.write("\t\t\t\t<td align=\"left\">\r\n");
              out.write("\t\t\t\t\t工作流权限分配\r\n");
              out.write("\t\t\t\t</td>\r\n");
              out.write("\t\t\t</tr>\r\n");
              out.write("\t\t</table>\r\n");
              out.write("\t\t<table border=0 width='100%' cellSpacing=6>\r\n");
              out.write("\t\t\t<tr>\r\n");
              out.write("\t\t\t\t<td align=\"left\" width=\"20%\">\r\n");
              out.write("\t\t\t\t\t当前配置文件：");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${xml}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\r\n");
              out.write("\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t</td>\r\n");
              out.write("\t\t\t</tr>\r\n");
              out.write("\t\t\t<tr>\r\n");
              out.write("\t\t\t\t<td align=\"left\" width=\"20%\">\r\n");
              out.write("\t\t\t\t\t选择工作流任务名称：\r\n");
              out.write("\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t<td width=\"80%\">\r\n");
              out.write("\t\t\t\t");
              if (_jspx_meth_html_005fselect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t</td>\r\n");
              out.write("\t\t\t</tr>\r\n");
              out.write("\t\t</table>\r\n");
              out.write("\t\t<hr color=#97D2FF>\r\n");
              out.write("\t\t<div class=list>\r\n");
              out.write("\t\t");
              if (_jspx_meth_html_005fhidden_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t");
              if (_jspx_meth_html_005fhidden_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t");
              if (_jspx_meth_html_005fhidden_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("<!--\t\t\t<input type=\"hidden\" id=\"_OrganizationSelector\" value=\"createOrganizationTask\"/>-->\r\n");
              out.write("<!--\t\t\t<input type=\"hidden\" id=\"taskName\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\"/>-->\r\n");
              out.write("<!--\t\t\t<input type=\"hidden\" id=\"xml\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${xml}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\"/>-->\r\n");
              out.write("\t\t\t<table border=\"0\">\r\n");
              out.write("\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t<th width=\"10%\" height=\"26\">\r\n");
              out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"boxa\" value=\"checkbox\" onclick=\"checkBoxAll('selectedOrganization')\">\r\n");
              out.write("\t\t\t\t\t</th>\r\n");
              out.write("\t\t\t\t\t<th align=\"center\" colspan='1' width=\"20%\">\r\n");
              out.write("\t\t\t\t\t\t人员姓名\r\n");
              out.write("\t\t\t\t\t</th>\r\n");
              out.write("\t\t\t\t\t<th align=\"center\" colspan='1' width=\"20%\">\r\n");
              out.write("\t\t\t\t\t\t人员登录名\r\n");
              out.write("\t\t\t\t\t</th>\r\n");
              out.write("\t\t\t\t\t<th align=\"center\" colspan='1' width=\"10%\">\r\n");
              out.write("\t\t\t\t\t\t性别\r\n");
              out.write("\t\t\t\t\t</th>\r\n");
              out.write("\t\t\t\t\t<th align=\"center\" colspan='1' width=\"20%\">\r\n");
              out.write("\t\t\t\t\t\t电话\r\n");
              out.write("\t\t\t\t\t</th>\r\n");
              out.write("\t\t\t\t\t<th align=\"center\" colspan='1' width=\"20%\">\r\n");
              out.write("\t\t\t\t\t\t联系地址\r\n");
              out.write("\t\t\t\t\t</th>\r\n");
              out.write("\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
              _jspx_th_logic_005fiterate_005f0.setId("element");
              _jspx_th_logic_005fiterate_005f0.setName("organizationList");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object element = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                element = (java.lang.Object) _jspx_page_context.findAttribute("element");
                do {
                  out.write("\r\n");
                  out.write("\t\r\n");
                  out.write("\t\t\t\t\t\t<tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t<td align=\"center\">\t\t\t\t\t\t\t\t\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_html_005fmultibox_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.organization.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.organization.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.organization.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.organization.telephone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.organization.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t</tr>\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  element = (java.lang.Object) _jspx_page_context.findAttribute("element");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
              out.write(" \r\n");
              out.write("\t\t\t</table>\r\n");
              out.write("\t\t</div>\r\n");
              out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=page>\r\n");
              out.write("\t\t\t<tr>\r\n");
              out.write("\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t<input  type=\"button\" class=\"input_button\" onClick=\"selectOrganization()\" value=\" 新 建 \">\r\n");
              out.write("\t\t\t\t\t<input name=\"button2\" type=\"button\" class=\"input_button\" onClick=\"deleteO()\" value=\" 删 除 \">\r\n");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t</td>\r\n");
              out.write("\t\t\t</tr>\r\n");
              out.write("\t\t</table>\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
          out.write("\r\n");
          out.write("\t</body>\r\n");
          out.write("</html>\r\n");
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fselect_005f0.setOnchange((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("selectTask(this, '${xml}')", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_html_005fselect_005f0.setProperty("task");
    _jspx_th_html_005fselect_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t ");
        if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f0 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fname_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    _jspx_th_html_005foptions_005f0.setName("taskList");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fname_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_0026_005fname_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fhidden_005f0.setProperty("taskName");
    _jspx_th_html_005fhidden_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fhidden_005f1.setProperty("xml");
    _jspx_th_html_005fhidden_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${xml}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fhidden_005f2.setProperty("_OrganizationSelector");
    _jspx_th_html_005fhidden_005f2.setValue("createOrganizationTask");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fmultibox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_005fmultibox_005f0 = (org.apache.struts.taglib.html.MultiboxTag) _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty_005fonclick_005fname.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_005fmultibox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fmultibox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_html_005fmultibox_005f0.setName("organizationTaskForm");
    _jspx_th_html_005fmultibox_005f0.setProperty("selectedOrganization");
    _jspx_th_html_005fmultibox_005f0.setOnclick("checkItem('boxa')");
    int _jspx_eval_html_005fmultibox_005f0 = _jspx_th_html_005fmultibox_005f0.doStartTag();
    if (_jspx_eval_html_005fmultibox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fmultibox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fmultibox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fmultibox_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_html_005fmultibox_005f0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t     \t\t");
        int evalDoAfterBody = _jspx_th_html_005fmultibox_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fmultibox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fmultibox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty_005fonclick_005fname.reuse(_jspx_th_html_005fmultibox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fmultibox_0026_005fproperty_005fonclick_005fname.reuse(_jspx_th_html_005fmultibox_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fmultibox_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fmultibox_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("element");
    _jspx_th_bean_005fwrite_005f0.setProperty("organization.userId");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }
}
