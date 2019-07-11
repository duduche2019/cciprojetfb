package com.cciprojetfb.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cciprojetfb.demo.model.Student;




@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {

	void deleteByStudentId(int studentId);
	
	
}
