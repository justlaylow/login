package com.tl.login.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tl.login.mapper.EmployeeMapper;
import com.tl.login.pojo.Employee;
import com.tl.login.service.EmpListService;

@Service
public class EmpListServiceImpl implements EmpListService{
	@Resource
	private EmployeeMapper employeeMapper;

	@Override
	public List<Employee> listEmp() {
		List<Employee> mlist = employeeMapper.listEmp();
		return mlist;
	}
	
	
}
