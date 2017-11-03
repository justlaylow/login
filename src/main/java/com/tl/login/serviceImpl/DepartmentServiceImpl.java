package com.tl.login.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tl.login.mapper.DepartmentMapper;
import com.tl.login.pojo.Department;
import com.tl.login.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Resource
	private DepartmentMapper departmentMapper;
	
	public List<Department> listDepartment(){
		List<Department> mlList = departmentMapper.listDepartment();
		return mlList;
	}
}
