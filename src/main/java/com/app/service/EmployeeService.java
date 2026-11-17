package com.app.service;

import com.app.model.Employee;

public interface EmployeeService {
	
	public void save(Employee e);
	
	public Employee getbyid(Integer id);

}
