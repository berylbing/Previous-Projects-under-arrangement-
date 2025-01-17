<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
	<head>
		<title>部门详细信息</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
		<script>
			function save(){
		 		if(checkInput() == false)
		 			return;
		 		document.forms[0].submit();
		 	 }		
		     function checkInput(){
		 		var inputs = document.forms[0].getElementsByTagName("INPUT");
		 		if(inputs["department.name"].value == ""){ alert("请输入部门名称");return false;}		 		 
		 		return true;
		 	 }
			 function parent(){	
				 var url = 	"departmentAction.do?method=preParentDepartment&Id=${department.departmentId}";
				 //open_window(url,400,300);
				 open_ModelWindow(url,400,300,document);
			 }
			 function deltr() {
				var trs = document.getElementsByName("boxi");
				var flag = 0;
				for (var i=0; i<trs.length; i++) {
					if (trs[i].checked) {
						flag = 1;
						break;
					}
				}
				if (flag==0) {
					alert("请选择您要删除的项目！");
					return false;
				}
				var ve = ta.all.tags("tr");
				for (var i=0; i<trs.length; i++) {
					if (trs[i].checked) {
						ve[i+1].removeNode(true);
						i--;
					}
				}
			}
			
			function w_open(v){
				hid.value = v;
				if (v == 1) {
					if (document.getElementById("sourceId") != null)
						document.getElementById("sourceId").id = "";
					event.srcElement.parentElement.parentElement.parentElement.id = "sourceId";
				}
				open_window('edit.htm',400,300);
			}
		</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
	<html:form action="/xitongguanli/departmentAction?method=modifyDepartment&Id=${department.departmentId}" method="POST">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					部门详细信息
				</td>
			</tr>
		</table>
		
		<nested:hidden property="department.departmentId" value="${department.departmentId}"></nested:hidden>
		<nested:hidden property="parentId" value="${department.parentDepartment.departmentId}"></nested:hidden>
		<div class=editblock>
			<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
				
				<tr height="35">
					<th align="right" width="35%">
						部门名称：
					</th>
					<td width="65%">
					
						<nested:text property="department.name" value="${department.name}"></nested:text>
						
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						上级部门：
					</th>
					<td>
					<input type="hidden" id="deptId_callback" value="parentId"/>
					<input type="hidden" id="deptName_callback" value="parentName"/>
					
					<logic:notEqual name="department" property="parentDepartment.departmentId" value="-1">
						<span id="parentName"><bean:write name="department" property="parentDepartment.name"/></span>
						<input  type="button" class="input_button" onClick="parent()" value="选择父级节点">
					</logic:notEqual>
					
					
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						部门说明：
					</th>
					<td>
						<nested:text  property="department.description" value="${department.description}"/>
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						部门地址：
					</th>
					<td>
						<nested:text  property="department.address" value="${department.address}"/>
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						联系电话：
					</th>
					<td>
						<nested:text  property="department.tele" value="${department.tele}"/>
					</td>
				</tr>
			</table>
			<div id=bc align=right>			
				<input  type="button" class="input_button" onClick="history.go(-1);" value=" 返 回 ">				
				<input name="button22" type="button" class="input_button" onClick="save()" value=" 保 存 ">
			</div>
			<br>
		</div>
		</html:form>
	</body>
</html:html>
