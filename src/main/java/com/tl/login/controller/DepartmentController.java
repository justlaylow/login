package com.tl.login.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tl.login.pojo.Department;
import com.tl.login.service.DepartmentService;

@Controller
@Scope("prototype")
public class DepartmentController {
	@Resource
	private DepartmentService departmentService;
	
	@RequestMapping("/depart")
	public String listDepartment(HttpServletRequest request) {
		List<Department> mlist = departmentService.listDepartment();
		request.setAttribute("deplist", mlist);
		return "department";
	}
}
