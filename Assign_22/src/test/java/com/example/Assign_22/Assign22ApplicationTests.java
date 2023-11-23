package com.example.Assign_22;

import com.example.Assign_22.Entity.Student;


;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;





@SpringBootTest
class Assign22ApplicationTests {

	@Test
	void contextLoads() {
		String name = "Prashant";
		int age = 23;
		int salary = 10000;

		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		student.setSalary(salary);

		Assertions.assertEquals(name, student.getName());
		Assertions.assertEquals(age, student.getAge());
		Assertions.assertEquals(salary, student.getSalary());

	}

}
