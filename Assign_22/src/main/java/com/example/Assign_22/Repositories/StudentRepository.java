package com.example.Assign_22.Repositories;


import com.example.Assign_22.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
	
	Student findBystudentId(String studentId);
	
	

	

}
