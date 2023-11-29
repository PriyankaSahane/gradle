package com.example.demo_gradleproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_gradleproject.service.EmployeeService;
import com.example.demo_gradleproject.entity.*;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/allEmployees")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> employees = null;
		try {
			employees = employeeService.getAllEmployee();
		}catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int empId){
		Employee employees = null;
		try {
			employees = employeeService.getEmployeeById(empId);
		}catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Employee>(employees,HttpStatus.OK);
	}
	
	@PostMapping("/addOrUpdate")
	public ResponseEntity<Employee> addOrUpdateUser(@RequestBody Employee employee){
		Employee employees = null;
		try {
			employees = employeeService.addOrUpdateEmployee(employee);
		}catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Employee>(employees,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteUser(@PathVariable("id") int empId){
		Employee employees = null;
		try {
			employees = employeeService.deleteEmployee(empId);
		}catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Employee>(employees,HttpStatus.OK);
	}
	
}
