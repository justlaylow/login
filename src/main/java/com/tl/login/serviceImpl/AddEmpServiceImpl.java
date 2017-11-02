package com.tl.login.serviceImpl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tl.login.mapper.EmployeeMapper;
import com.tl.login.pojo.Employee;
import com.tl.login.service.AddEmpService;

@Service
public class AddEmpServiceImpl implements AddEmpService{
	@Resource
	private EmployeeMapper employeeMapper;

	public String add(Employee employee) {
		int i = employeeMapper.insert(employee);
		String message = "";
		if(i>0) {
			message = "添加成功";
		}else {
			message = "添加失败";
		}
		return message;
	}

	
}
