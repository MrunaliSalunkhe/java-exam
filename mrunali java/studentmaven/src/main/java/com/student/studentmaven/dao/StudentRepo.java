package com.student.studentmaven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentmaven.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{

	

}
