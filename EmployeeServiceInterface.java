package com.example.JpaTest.service;

import java.util.List;

import com.example.JpaTest.domain.Employee;
import com.example.JpaTest.model.EmployeeModel;

public interface EmployeeServiceInterface {
	
	public void saveEmployee(EmployeeModel employeeModel);
	public Employee getEmployee(int id);
	public List<Employee> getEmployee();
	public void updateEmployee(EmployeeModel employeeModel,int employeeId);
	public void deleteEmployee(int id);

}
