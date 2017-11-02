package com.tl.login.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tl.login.pojo.Admin;

public interface AdminMapper {
	public Admin getAdmin(@Param("adminname") String adminname,@Param("password") String password);
	
	public List<Admin> list();
	
	public int add(Admin admin);
}
