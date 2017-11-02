package com.tl.login.controller;


import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tl.login.pojo.Employee;
import com.tl.login.service.AddEmpService;

@Controller
@Scope("prototype")
public class AddEmpController {
	@Resource
	private AddEmpService addEmpService;
	
	
	@RequestMapping("/insert")
	public String add(Employee employee,HttpServletRequest request) {
		System.out.println(employee.getEmpDepartment());
		String insertEmp = addEmpService.add(employee);
		request.setAttribute("insertEmp", insertEmp);
		return "main";
	}
}
