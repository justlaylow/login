package com.tl.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tl.login.mapper.AdminMapper;
import com.tl.login.pojo.Admin;

@Service
public class AdminServiceImpl implements AdminService{
	@Resource
	private AdminMapper adminMapper;
	
	public Admin checkLogin(String adminname,String password) {
		Admin admin = adminMapper.getAdmin(adminname, password);
		if(admin!=null&&admin.getAdm_pass().equals(password)) {
			return admin;
		}
		return null;
	}
}
