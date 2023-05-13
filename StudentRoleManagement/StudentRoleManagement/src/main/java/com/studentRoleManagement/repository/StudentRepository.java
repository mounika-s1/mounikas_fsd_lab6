package com.studentRoleManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentRoleManagement.entity.Student;

public interface StudentRepository extends JpaRepository <Student,Integer>{

}