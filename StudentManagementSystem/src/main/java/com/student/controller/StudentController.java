package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentEntity;
import com.student.service.IStudentService;

@RestController
public class StudentController {
	
	@Autowired
	IStudentService studentSevice;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String helloWorld()
	{
		return "helloWorld";
	}

	
	@PostMapping("/student")
	Integer createStudent(@RequestBody StudentEntity student)
{
	Integer id= studentSevice.saveStudent(student);
	System.out.println(id);
	return id;
}
	@GetMapping("/allstudents")
	public List<StudentEntity> getAllStudent(){
		
		return studentSevice.getAllStudent();
		
	}
	
	@PutMapping("/student/{Id}")
	public ResponseEntity<StudentEntity> updateStudentData(@RequestBody StudentEntity student, @PathVariable("Id") Integer Id)
	{
		System.out.println("start contr ser");
		ResponseEntity<StudentEntity> rst=new ResponseEntity<>(HttpStatus.OK);
	
try {
			
	studentSevice.updatedata(student,Id);
	}
		catch(Exception e) {
			e.printStackTrace();
			rst=new ResponseEntity<StudentEntity>(HttpStatus.NOT_FOUND);
		}
		
		return rst;
	
	}
	
	@GetMapping("/student/{Id}")
	public Optional<StudentEntity>  getStudentById(@PathVariable("Id") Integer Id)
	{
		return studentSevice.getById(Id);
		
	}
	@DeleteMapping("/studnet/{Id}")
	public ResponseEntity<StudentEntity> deleteStudent(@PathVariable("Id") Integer Id)
	{
		System.out.println(Id);
		ResponseEntity<StudentEntity> resp=new ResponseEntity<>(HttpStatus.OK);
		try {
			
			studentSevice.deleteStudentById(Id);
	}
		catch(Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<StudentEntity>(HttpStatus.NOT_FOUND);
		}
		
		return resp;
}
}