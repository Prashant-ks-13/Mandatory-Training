package com.example.Assign_22.Controller;


import com.example.Assign_22.Entity.Student;
import com.example.Assign_22.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * This is the controller of Coupons Cart Microservice
 */

@RestController
@RequestMapping("/cartItems")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;

	/**
	 * This is a Post Mapping Method Used to add all the Items in cart

	 */
	@PostMapping("/addstudent")
	public String addNeworder( @RequestBody Student student ){
			return studentService.addStudent( student );
	}
	
	/**
	 * This is Get Mapping Method to get the list of all the items from the cart

	 */
	@GetMapping("/allstudent")
	public List<Student> fetchAllStudents(){
		return  studentService.fetchAllStudent();
	}
	
	/**
	 * This is the Put method used to update an existing cart items.
	 */
	@PutMapping("/updatestudent")
	public Student updateStudent(@RequestBody  Student student) {

		return  studentService.update(student);
	}

	/**
	 * This is the delete method used to delete the product according to the provided id.

	 */
	@DeleteMapping("/deletestudent/{id}")
	 public String deleteProductById(@PathVariable("id") String id)
	 {
		studentService.deleteById(id);
		return "id no "+id+" is deleted";
	 }
	/**
	 * This method will return the list of cart items sorted according to the price

	 */

	}

	
	


