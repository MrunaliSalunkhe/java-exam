package com.student.studentmaven.Service;

import java.util.List;

import com.student.studentmaven.model.Student;

public interface StudentService {
	public Student saveRegistered(Student student);
	public List<Student> studentList();
    public void deleteByid(int id);
    public List<Student> getAllStudents();
    
        
}
