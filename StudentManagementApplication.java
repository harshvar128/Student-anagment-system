	package com.example.StudentManagement;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.ComponentScan;

	@SpringBootApplication
	@ComponentScan(basePackages = "com.example.StudentManagement")

	public class StudentManagementApplication {

		public static void main(String[] args) {
			SpringApplication.run(StudentManagementApplication.class, args);
		}

	}
