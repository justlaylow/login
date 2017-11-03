package com.tl.login.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tl.login.pojo.Employee;
import com.tl.login.service.EmpListService;

@Controller
public class EmpListController {
	@Resource
	private EmpListService empListService;
	
	@RequestMapping("/list")
	public String empList(HttpServletRequest request) {
		//调service里的方法  
        List<Employee> ulist = empListService.listEmp(); 
        //把值存到request作用域里，传到页面上  
        request.setAttribute("ulist", ulist);  
        //跳转的emp.jsp页面  
        return "emp";
	}
}
