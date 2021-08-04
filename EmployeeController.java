package com.example.JpaTest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaTest.domain.Employee;
import com.example.JpaTest.model.EmployeeModel;
import com.example.JpaTest.service.EmployeeServiceInterface;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceInterface employeeServiceInterface;
	EmployeeModel employeeModel;
	
    @PostMapping("save")
	@ResponseBody
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeeModel employee)
	{
    	employeeServiceInterface.saveEmployee(employee);
    	return new ResponseEntity<String>("Record Inserted", HttpStatus.OK);
	}
	
    //Delete Handler
	@PostMapping("delete/{id}")
	@ResponseBody
	public ResponseEntity<String> deleteEmpolyee(@PathVariable("id") int id)
	{
		 this.employeeServiceInterface.deleteEmployee(id);
		 return new ResponseEntity<String>("Record Deleted.",HttpStatus.OK);
	}
	
	//Update Handler.
	@PostMapping("update/{id}")
	@ResponseBody
	public ResponseEntity<String> employeeUpdate(@RequestBody EmployeeModel employeeModel,@PathVariable("id") int id)
	{
	     this.employeeServiceInterface.updateEmployee(employeeModel, id);
	     return new ResponseEntity<String>("Record Updated.",HttpStatus.OK);
	}
	
	
	//Employee data Fetch Handler
	@PostMapping("get")
	@ResponseBody
	public ResponseEntity<List<Employee>> getAllEmp()
	{
		 List<Employee> list= this.employeeServiceInterface.getEmployee();
		 if(list.size()<0) {
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
		 
		 return ResponseEntity.of(Optional.of(list));
	}
	
	@PostMapping("get/{id}")
	@ResponseBody
	public Employee getByIdEmp(@PathVariable("id") int eid)
	{
		Employee employee=employeeServiceInterface.getEmployee(eid);
		return employee;
	}

}
