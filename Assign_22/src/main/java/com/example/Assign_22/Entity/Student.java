package com.example.Assign_22.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class Student {
	
	    @Id
	    private String id;
	    private String Name;
	    private Integer Age;
	    private Integer Salary;

		public String getStudentId() {
			return id;
		}
		public void setStudentId(String id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String userName) {
			this.Name = userName;
		}
		public Integer getAge() {
			return Age;
		}
		public void setAge(Integer Age) {
			this.Age = Age;
		}
		public Integer getSalary() {
			return Salary;
		}
		public void setSalary(Integer Salary) {
			this.Salary = Salary;
		}


		public Student(){}
		public Student(String id, String Name, Integer Age, Integer Salary) {
			super();
			this.id = id;
			this.Name = Name;
			this.Age = Age;
			this.Salary = Salary;

		}
		
		
		@Override
		public String toString() {
			return "Profile [Id=" + id + ", Name=" + Name + ", Age=" + Age + ", Salary=" + Salary + "]";
		}

}
