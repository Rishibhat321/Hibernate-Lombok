package com.Hibernate_Lombok.crud;

import com.Hibernate_Lombok.crud.dao.EmployeeDAO;
import com.Hibernate_Lombok.crud.entity.employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("Hello World");
		};
	}

	 */

	@Bean
	public CommandLineRunner commandLineRunner(EmployeeDAO employeeDAO) {
		return runner -> {

			CreateEmployee(employeeDAO);
		};
	}

	private void CreateEmployee(EmployeeDAO employeeDAO) {

		// creating a new employee object
		employee tempEmployee = new employee("Aditya", "Pandey",
				"adi@gmail.com", "male", 987345679);
		System.out.println("Created new employee object: " + tempEmployee);
		employeeDAO.createEmployee(tempEmployee);

	}

	

}
