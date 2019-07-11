package com.cciprojetfb.demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cciprojetfb.demo.DAO.StudentDAO;
import com.cciprojetfb.demo.model.Student;


@Transactional
@RestController
public class StudentController {
	
	@Autowired
	StudentDAO studentDAO;
	
	@GetMapping(value = "/getStudentId/{studentId}")
	public Student getStudentId(@PathVariable int studentId) {
		
		Student studentFound= studentDAO.findOne(studentId);
		return studentFound;
	}
	
	@GetMapping(value = "/getAllStudent")
	public List<Student> getAllStudent() {
		
		List<Student> studentFounds= studentDAO.findAll();
		return studentFounds;
	}
	
	@PostMapping(value = "/createStudent")
	public Student addStudent(@RequestBody Student student) {
		
		Student createdStudent= studentDAO.save(student);
		return createdStudent;
		
	}
	@PutMapping(value = "/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		
		Student updateStudent = studentDAO.save(student);
		return updateStudent;
	}
	@DeleteMapping(value = "/deleteByStudentId/{studentId}")
	public void deleteStudentById (@PathVariable int studentId) {
		
		studentDAO.deleteByStudentId(studentId);
	}
	
	
}
