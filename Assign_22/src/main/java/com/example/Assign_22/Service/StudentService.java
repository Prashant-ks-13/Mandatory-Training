package com.example.Assign_22.Service;


import com.example.Assign_22.Entity.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface StudentService {
	
	
	
	 public String addStudent(  Student student );
	 public List<Student> fetchAllStudent();
	 public Student update(Student student);
	 public ResponseEntity<Object> deleteById(String id);

	 

}
