package com.Employee.EmployeeDirectory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Employee.EmployeeDirectory.model.Employee;
import com.Employee.EmployeeDirectory.service.EmployeeServiceImp;
import com.Employee.EmployeeDirectory.service.Employeeservice;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Controller
@Transactional
public class EmployeeController {

    @Autowired
    private EmployeeServiceImp employeeService;
  
    @GetMapping("/emplogin")
    public String saveRegistered(Model model) {
        model.addAttribute("employee", new Employee());
        return "Employeelogin";
    }

    @PostMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable long id) {
    	employeeService.deleteByid(id);
        return "redirect:/employees";
    }

    @PostMapping("/status")
    public String getStatus(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindResult) {
    	employeeService.saveRegistered(employee);
        return "status";
    }

    @GetMapping("/employees")
    public String listStudents(Model model) {
        List<Employee> employees = employeeService.getAllEmployee();
        model.addAttribute("employees", employees);
        return "employeelist";
    }
}
