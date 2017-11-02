package com.tl.login.service;

import com.tl.login.pojo.Admin;

public interface AdminService {
	public Admin checkLogin(String adminname,String password);
}
