package com.example.demo_gradleproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_gradleproject.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
