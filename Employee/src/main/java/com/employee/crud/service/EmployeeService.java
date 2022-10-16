package com.employee.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.crud.dao.EmployeeRepository;
import com.employee.crud.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee createUser(Employee user) {
		return employeeRepository.save(user);
	}

	

	

	public List<Employee> getUsers() {
		return employeeRepository.findAll();
	}
	

	
	public String deleteUserById(int id) {
		employeeRepository.deleteById(id);
		return "User Deleted Successfully";
	}





	public Optional<Employee> getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return  employeeRepository.findById(id);
	}

}
