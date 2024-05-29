package com.student.studentmaven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)

private int id;
private String name;
private int age;
private String grade;
private String major;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", grade=" + grade + ", major=" + major + "]";
}
public Student(int id, String name, int age, String grade, String major) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.grade = grade;
	this.major = major;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
