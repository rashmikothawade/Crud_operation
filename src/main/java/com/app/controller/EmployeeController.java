package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.service.EmployeeService;
@RestController
public class EmployeeController {
	
	EmployeeService es;
	public EmployeeController(EmployeeService es) {
		this.es=es;
	}
	
	@PostMapping("/save")
	public void saveData(@RequestBody Employee e) {
		es.save(e);
	}
	
	@GetMapping("/getbyid/{id}")
	public Employee getById(@PathVariable Integer id) {
		Employee e=es.getbyid(id);
		return e;
	}

}
