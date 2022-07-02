package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.student.entity.StudentEntity;

public interface IStudentService {

	

	Integer saveStudent(StudentEntity student);

	List<StudentEntity> getAllStudent();

StudentEntity updatedata(StudentEntity student, Integer id);

	Optional<StudentEntity> getById(Integer id);

	public void deleteStudentById(Integer id);

	
}
