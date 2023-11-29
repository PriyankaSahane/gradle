package com.example.demo_gradleproject.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_gradleproject.entity.Employee;
import com.example.demo_gradleproject.repository.EmployeeRepository;
import com.example.demo_gradleproject.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(empId).orElse(null);
	}

	@Override
	public Employee addOrUpdateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee deleteEmployee(int empId) throws Exception{
		// TODO Auto-generated method stub
		Employee deleteEmployee = null;
		try {
			deleteEmployee=employeeRepository.findById(empId).orElse(null);
			if( deleteEmployee== null) {
				throw new Exception(" not available");
			}else {
				employeeRepository.deleteById(empId);
			}
		}catch(Exception ex) {
			throw ex;
		}
		return deleteEmployee;
	}

}
