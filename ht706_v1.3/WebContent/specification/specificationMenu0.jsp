<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/menuHTC.css" rel="stylesheet" type="text/css">
<script>	
	function ToggleNav() {
		if(divCollapsedNav.style.display == "none")	{
			divCollapsedNav.style.display = "";
			menuContainer.style.display = "none";
			parent.frmstOuter.cols = "18,*"
			parent.document.all ('leftFrame').noResize = true;
			parent.document.all ('leftFrame').framespacing= 0;
		} else {
			menuContainer.style.display = "";
			divCollapsedNav.style.display = "none";
			parent.frmstOuter.cols = "200,*"
			parent.document.all ('leftFrame').noResize = false;
		}
	}
	var firstId=null;
</script>

</head>
<body ondblclick="ToggleNav();"> 
	<div id=menuContainer> 

		<dl>
			<dt> 
				<div>��Լ����</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="SpecificationAction.do?method=listSpecification" target="rightFrame">��Լ�������ѯ</a></li>	
					<li><a href="specificationStaticsDetail.jsp" target="rightFrame">��Ϣͳ��</a></li>					
				</ul>
			</dd>
		</dl>
		
		<dl>
			<dt> 
				<div>ͬ����Լ</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="specifiactionSycn.jsp" target="rightFrame">��ͬ����Լ</a></li>	
					<li><a href="specifiactionReleaseState.jsp" target="rightFrame">��Լ�������</a></li>					
				</ul>
			</dd>
		</dl>
		
		<dl>
			<dt> 
				<div>��Լ���</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="SpecificationmodifyAction.do?method=listSpecificationmodify&select=search" target="rightFrame">�鿴������뵥</a></li>	
					<li><a href="SpecificationmodifyAction.do?method=listSpecificationmodify&select=edit" target="rightFrame">����������뵥</a></li>					
				</ul>
			</dd>
		</dl>		

	</div>
<div id="divCollapsedNav" class="navTocColor" style="display:none;width:100%;height:100%;"> 
<a href="javascript:ToggleNav();" title="չ���������" id="linkNavClosed"><img src="images/toc2.gif" alt="չ���������" border="0"></a> 
</div>
</body>
</html>