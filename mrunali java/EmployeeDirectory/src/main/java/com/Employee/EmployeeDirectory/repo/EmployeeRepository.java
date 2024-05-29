package com.Employee.EmployeeDirectory.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.EmployeeDirectory.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
