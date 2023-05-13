package com.studentRoleManagement.service;

import java.util.List;

import com.studentRoleManagement.entity.Student;

public interface StudentService {
	
	public List <Student> findAll();
	
	public Student findById(int id);
	public List <Student> search(String name,String department);
	
	public void save(Student student);
	
	public void deleteById(int id);

}