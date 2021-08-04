package com.example.JpaTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.JpaTest.domain.Employee;
import com.example.JpaTest.repository.EmployeeRepository;

@SpringBootApplication
public class JpaPracticeApplication {

	public static void main(String[] args) {
		//ApplicationContext context=
				SpringApplication.run(JpaPracticeApplication.class, args);
		
		//EmpRepository empRepository=context.getBean(EmpRepository.class);
		
//		Empolyee emp= new Empolyee();
//		//emp.setId(0);
//		emp.setName("Noor");
//		emp.setAddress("Chaibasa");
//		emp.setSalary("30000");
//		
//		Empolyee emp1=empRepository.save(emp);
//		System.out.println(emp1);
//		
//		Empolyee emp2= new Empolyee();
//		//emp.setId(0);
//		emp2.setName("Noor");
//		emp2.setAddress("Chaibasa");
//		emp2.setSalary("30000");
//		
//		Empolyee emp3=empRepository.save(emp2);
//		System.out.println(emp3);
	}

}
