package com.example.demo_gradleproject.service;
import java.util.List;

import com.example.demo_gradleproject.entity.*;

public interface EmployeeService {
	
	
 public List<Employee> getAllEmployee();
 public Employee getEmployeeById(int empId);
 public Employee addOrUpdateEmployee(Employee employee);
 public Employee deleteEmployee(int empId) throws Exception;
 
}
