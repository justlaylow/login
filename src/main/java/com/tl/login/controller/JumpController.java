package com.tl.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {
	@RequestMapping("/main")
	public String insert(HttpServletRequest request,HttpServletResponse response) {
		return "addEmployee";
	}
	
	@RequestMapping("/select")
	public String list(HttpServletRequest request,HttpServletResponse response) {
		return "emp";
	}
}
