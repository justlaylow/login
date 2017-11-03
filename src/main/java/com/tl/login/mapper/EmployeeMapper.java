package com.tl.login.mapper;

import java.util.List;

import com.tl.login.pojo.Admin;
import com.tl.login.pojo.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
    
    public List<Employee> listEmp();
}