package com.student.service;

import java.util.List;
import java.util.Optional;

import javax.management.ServiceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student.entity.StudentEntity;
import com.student.exception.StudentNotFoundException;
@Service
public class StudentServiceImpl implements IStudentService {

	
	
	@Autowired
	IStudentRepository studentRepository;

	@Override
	public Integer saveStudent(StudentEntity student) {
	
		StudentEntity studententity=studentRepository.save(student);
		return studententity.getId();
	}


	public List<StudentEntity> getAllStudent() {
		
		return studentRepository.findAll();
	}


	public StudentEntity updatedata(StudentEntity student,Integer Id) {
		
     System.out.println("service start");
		StudentEntity std=studentRepository.findById(Id).orElseThrow(()-> new StudentNotFoundException("Eployee","Id", Id));
	System.out.println("service upadte");
		std.setFirstName(student.getFirstName());
		std.setLastname(student.getLastname());
		return studentRepository.save(std);
	}


	public Optional<StudentEntity> getById(Integer Id) {
		
		return studentRepository.findById(Id);
//		Optional<StudentEntity> std=studentRepository.findById(Id);
//		if(std.isPresent())
//		{
//			return std.get();
//		}
//		else
//		{
//			throw new StudentNotFoundException();
//		}
	}


	@Override
	public void deleteStudentById(Integer Id) {
		
                      studentRepository.deleteById(Id);
		
		
	}



}
