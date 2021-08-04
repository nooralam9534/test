package com.example.JpaTest.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JpaTest.domain.Employee;
import com.example.JpaTest.model.EmployeeModel;
import com.example.JpaTest.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	Employee employee;

	@Override
	public void saveEmployee(EmployeeModel employeeModel) {
		BeanUtils.copyProperties(employeeModel,employee);
	    employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployee(int id) {
	   employee=this.employeeRepository.findById(id);
	 return employee;
	}

	@Override
	public List<Employee> getEmployee() {
		  List<Employee> list=(List<Employee>) this.employeeRepository.findAll();
		  return list;
	}


	@Override
	public void updateEmployee(EmployeeModel employeeModel, int employeeId) {
	    employeeModel.setId(employeeId);
	    BeanUtils.copyProperties(employeeModel,employee);
	    employeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmployee(int id) {
		this.employeeRepository.deleteById(id);
	}
	

}
