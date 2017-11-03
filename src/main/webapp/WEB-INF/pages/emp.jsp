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
            <th>ID</th>  
            <th>登录名</th>  
            <th>密码</th>  
            <th>用户名</th>  
            <th>权限</th>  
            <th>生日</th>  
            <th>性别</th>  
            <th>操作</th>  
        </tr>  
        <c:forEach var="emp" items="${ulist}">  
        <tr>  
            <!-- 和po类里的属性名一样 -->  
            <td>${emp.empId}</td>  
            <td>${emp.empName}</td>
            <td>${emp.empJobTitle}</td>
            <td>${emp.empWorkCategory}</td>
            <td>${emp.empIdNumber}</td>
            <td>${emp.empPhone}</td>
            <td>${emp.empSex}</td>
            <td>${emp.empAge}</td>
            <td>${emp.empEntryDate}</td>
            <td>${emp.empDepartment}</td>
            <td>${emp.empNativePlace}</td>
        </tr>  
        </c:forEach>   
    </table> 
</body>
</html>