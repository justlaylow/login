<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${insertEmp}
	<form action="/login/main" method="post">
		<input type="submit" value="新增"/>
	</form>
	
	<form action="/login/list" method="post">
		<input type="submit" value="员工查询"/>
	</form>
	
	<form action="/login/depart" method="post">
		<input type="submit" value="部门查询"/>
	</form>
</body>
</html>