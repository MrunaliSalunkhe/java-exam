package com.Employee.EmployeeDirectory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.EmployeeDirectory.model.Employee;
import com.Employee.EmployeeDirectory.repo.EmployeeRepository;
import com.studentmanagement.studentManagementSystem.model.Student;

@Service
public class EmployeeServiceImp implements Employeeservice{

    @Autowired
    private EmployeeRepository employeeRepository;

	@Override
	public Employee saveRegistered(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> employeeList() {
		List<Employee> findAll= employeeRepository.findAll();
		return findAll;
	}

	@Override
	public void deleteByid(long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	
}

