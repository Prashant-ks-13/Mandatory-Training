package com.example.Assign_22.Service;



import com.example.Assign_22.Entity.Student;
import com.example.Assign_22.Exception.StudentRequestException;
import com.example.Assign_22.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	

	



	
	
	
	
	
	public String addstudent(Student student ){

		Student student1 = new Student(student.getStudentId(),student.getName(),student.getSalary(),student.getAge());
		studentRepository.insert( student1 );
		return ("Coupon Added Successfully in Cart");	
			
	}
	
	
	
	
	
    public List<Student> fetchAllOrders() {
    	
    	return  studentRepository.findAll();

    }

    
    
    



	@Override
	public String addStudent(Student student) {
		return null;
	}

	@Override
	public List<Student> fetchAllStudent() {
		return null;
	}

	@Override
	public Student update(Student student) {
		return null;
	}

	public ResponseEntity<Object> deleteById(String id)
	{
		boolean isUserExist=studentRepository.existsById(id);
		 if(isUserExist) {
			 studentRepository.deleteById(id);
			 return new ResponseEntity<Object>("student deleted with id "+id,HttpStatus.OK);
		 }
		 else
		 {
		 	throw new StudentRequestException("CAN NOT DELETE AS USER NOT FOUND WITH THIS ID ::");
		 }
	}


	
	
	

	

	}
		


