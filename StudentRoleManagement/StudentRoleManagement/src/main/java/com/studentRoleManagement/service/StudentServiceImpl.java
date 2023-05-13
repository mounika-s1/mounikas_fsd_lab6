package com.studentRoleManagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentRoleManagement.entity.Student;
import com.studentRoleManagement.repository.StudentRepository;

@Repository
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	@Transactional
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List <Student> students =  studentRepository.findAll();
		return students;
	}
	
	@Override
	@Transactional
	public List<Student> search(String name, String department){
		Criteria session;
		Criteria c= session.createCriteria(Student.class);
		Criterion n= Restrictions.eq("name", name);
		Criterion d= Restrictions.eqOrIsNull("department", department);
		Criterion combine= Restrictions.and(n,d);
		c.add(combine);
		return c.list();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

}