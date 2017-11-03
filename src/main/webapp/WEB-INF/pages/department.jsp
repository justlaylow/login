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
	<table border="1" width="700">  
        <tr>  
            <th>部门编号</th>  
            <th>部门名称</th>  
        </tr>  
        <c:forEach var="dep" items="${deplist}">  
        <tr>  
            <!-- 和po类里的属性名一样 -->  
            <td>${dep.depId}</td>  
            <td>${dep.depName}</td>
        </tr>  
        </c:forEach>   
    </table> 
</body>
</html>