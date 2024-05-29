package com.student.studentmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.studentmaven.Service.StudentService;
import com.student.studentmaven.model.Student;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Controller
@Transactional
public class StudentController {
	@Autowired
private StudentService studentService;
	
	@GetMapping("/login")
	public String saveRegistered(Model model) {
		model.addAttribute("student", new Student());
		return "studentlogin";
		
	}
	 @PostMapping("/delete/{id}")
	    public String deleteStudentById(@PathVariable int id) {
	        studentService.deleteByid(id);
	        return "redirect:/students";
	    }
	@PostMapping("/status")
	public String getStatus(@Valid @ModelAttribute("student")Student student,BindingResult bindResult) {
//		if(bindResult.hasErrors()) {
		studentService.saveRegistered(student);
			return "status";
		}
	 @GetMapping("/students")
	    public String listStudents(Model model) {
	        List<Student> students = studentService.getAllStudents();
	        model.addAttribute("students", students);
	        return "studentlist";
	    }

	 @PostMapping("/update/{id}")
	    public String updateStudent(@PathVariable("id") int id, @Valid @ModelAttribute("student") Student student,
	                                BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            student.setId(id);
	            return "studentupdate";
	        }
	        
	        studentService.saveRegistered(student);
	        return "redirect:/students";
	    }
	}
	

