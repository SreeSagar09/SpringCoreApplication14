package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.app.Employee;
import com.app.Student;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope(value = "singleton")
	public Employee getEmployee() {
		Employee employee = new Employee(2002, "Mahesh Babu", 34, "Civil Engineer");
		return employee;
	}
	
	@Bean
	@Scope(value = "prototype")
	public Student getStudent() {
		Student student = new Student(6608, "Akhil", 26, "Devops");
		return student;
	}
}
