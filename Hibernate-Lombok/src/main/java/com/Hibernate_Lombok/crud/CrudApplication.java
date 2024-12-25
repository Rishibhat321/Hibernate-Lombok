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

		//	CreateEmployee(employeeDAO);

		//	CreateMultiple(employeeDAO);

		//	readEmployee(employeeDAO);

		//	UpdateEmpObject(employeeDAO);

		//	DeleteEmp(employeeDAO);

		};
	}

	private void DeleteEmp(EmployeeDAO employeeDAO) {
		// int theId = 5;

		int theId = 7;

		employee tempEmployee = employeeDAO.getEmployeeId(theId);

		System.out.println("Deleting employee: " + tempEmployee);
		employeeDAO.deleteEmployee(theId);

		System.out.println("Employee deleted");
	}

	private void UpdateEmpObject(EmployeeDAO employeeDAO) {

		// retrieving the employee object based on EmployeeId.
         int theId = 4;
		 employee tempEmployee = employeeDAO.getEmployeeId(theId);

		 // updating the employee details;
		tempEmployee.setFirstName("Simi");
		tempEmployee.setLastName("Verma");
		tempEmployee.setGender("female");
		tempEmployee.setEmail("simi@gmail.com");

		 employeeDAO.updateEmployee(tempEmployee);

		System.out.println("Updating the employee");

		System.out.println("Updated employee details are : ");
		System.out.println("Id: " + tempEmployee.getEmpId());
		System.out.println("Name: " + tempEmployee.getFirstName() + " " + tempEmployee.getLastName());
		System.out.println("Email is: " + tempEmployee.getEmail());
		System.out.println("Gender is: " + tempEmployee.getGender());
		System.out.println("Mobile number is: " + tempEmployee.getMobile());


	}

	private void readEmployee(EmployeeDAO employeeDAO) {

		// create an employee object
		System.out.println("Creating an employee object ...");
		employee tempEmployee = new employee("Rohit", "Sharma", "rohit@gmail.com",
				"male", 875329654);

		// saving thr employee object
		employeeDAO.createEmployee(tempEmployee);
		System.out.println("Saved the employee object...");

		// retrieving the employee object by id
		int theId;
        theId = tempEmployee.getEmpId();
        System.out.println("Employee has id: " + theId);

	//	System.out.println("Employee has id: " + tempEmployee.getEmpId());

		employee resEmp = employeeDAO.getEmployeeId(theId);

		// displaying the details of the resEmp
		System.out.println("Details are: " + resEmp);


	}

	private void CreateMultiple(EmployeeDAO employeeDAO) {
		// creating an employee object
		employee tempEmp = new employee("Rishita", "Bhatnagar",
				"rishi@gmail.com", "female", 830456748 );
		employee tempEmp1 = new employee("Manoj", "Singh",
				"manoj@gmail.com", "male", 985467383);
		employee tempEmp2= new employee("Sunny", "Sharma", "sunny@gmail.com",
				"male", 897654396);

		// saving the created employee objects
		employeeDAO.createMultipleEmployee(tempEmp);
		employeeDAO.createMultipleEmployee(tempEmp1);
		employeeDAO.createMultipleEmployee(tempEmp2);


	}

	private void CreateEmployee(EmployeeDAO employeeDAO) {

		// creating a new employee object
		employee tempEmployee = new employee("Aditya", "Pandey",
				"adi@gmail.com", "male", 987345679);
		System.out.println("Created new employee object: " + tempEmployee);
		employeeDAO.createEmployee(tempEmployee);

	}
	

}
