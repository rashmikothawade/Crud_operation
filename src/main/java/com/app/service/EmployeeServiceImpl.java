package com.app.service;

import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	EmployeeRepository er;
	public EmployeeServiceImpl(EmployeeRepository er) {
		this.er=er;
	}
	@Override
	public void save(Employee e) {
		
		er.save(e);
	}
	
	@Override
	public Employee getbyid(Integer id) {
		Employee e=er.findById(id).get();
		return e;
	}

}
