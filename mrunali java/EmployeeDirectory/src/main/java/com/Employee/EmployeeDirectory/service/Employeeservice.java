package com.Employee.EmployeeDirectory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Employee.EmployeeDirectory.model.Employee;


@Service
public interface Employeeservice {
	public Employee saveRegistered(Employee emp);
	public List<Employee> employeeList();
    public void deleteByid(long id);
    public List<Employee> getAllEmployee();

}
