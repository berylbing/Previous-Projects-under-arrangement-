<%@ page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
</head>
<body>


<sec:authorize ifAllGranted="ROLE_MANAGER">
	<jsp:forward page="/index2.html"></jsp:forward>
</sec:authorize>
<sec:authorize ifAllGranted="ROLE_USER">
	<jsp:forward page="/index3.htm"></jsp:forward>
</sec:authorize>
</body>
</html>