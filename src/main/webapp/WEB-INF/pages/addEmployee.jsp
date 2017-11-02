<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jQuery/jquery-1.11.1.min.js" type="text/javascript"></script>
</head>
<body>
	<form action="/login/insert" method="post">
		员工编号：<input type="text" name="empId" id="emp_id"/><br>
		员工姓名：<input type="text" name="empName" id="emp_name"/><br>
		员工职位：<input type="text" name="empJobTitle" id="emp_job_title"/><br>
		员工工种：<input type="text" name="empWorkCategory" id="emp_work_category"/><br>
		身份证号：<input type="text" name="empIdNumber" id="emp_ID_number"/><br>
		联系方式：<input type="text" name="empPhone" id="emp_phone"/><br>
		性别：<input type="text" name="empSex" id="emp_sex"/><br>
		年龄：<input type="text" name="empAge" id="emp_age"/><br>
		入职日期：<input type="text" name="empEntryDate" id="emp_entry_date"/><br>
		部门：<input type="text" name="empDepartment" id="emp_department"/><br>
		籍贯：<input type="text" name="empNativePlace" id="emp_native_place"/><br>
		<input type="submit" value="新增"/>
	</form>
</body>
</html>