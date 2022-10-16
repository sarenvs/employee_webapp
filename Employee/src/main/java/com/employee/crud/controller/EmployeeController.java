package com.employee.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.crud.entity.Employee;
import com.employee.crud.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/register")
	public Employee addUser(@RequestBody Employee employee) {
		return employeeService.createUser(employee);
	}

	

	

	@GetMapping("/list")
	public List<Employee> getAllUsers() {
		return employeeService.getUsers();
	}
	


	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return employeeService.deleteUserById(id);
	}
	
	
	
			@PatchMapping(path = "/update/{id}")
			public ResponseEntity<Employee> updateStudentEmailorName(@RequestBody Employee employee,@PathVariable("id") Integer id) {

				Optional<Employee> currentEmployee = employeeService.getEmployeeById(id);
				Employee updateEmployeeData = new Employee();
				 
				updateEmployeeData = currentEmployee.get();
					if (employee.getFirstName() != null && employee.getFirstName() != "") {
						updateEmployeeData.setFirstName(employee.getFirstName());
					}
					if (employee.getLastName() != null && employee.getLastName() != "") {
						updateEmployeeData.setLastName(employee.getLastName());
					}
					if (employee.getMobileNumber() != null && employee.getMobileNumber() != "") {
						updateEmployeeData.setMobileNumber(employee.getMobileNumber());
					}
					if (employee.getAddress() != null && employee.getAddress() != "") {
						updateEmployeeData.setAddress(employee.getAddress());
					}
					if (employee.getDepartment() != null && employee.getDepartment() != "") {
						updateEmployeeData.setDepartment(employee.getDepartment());
					}
					return new ResponseEntity<Employee>(employeeService.createUser(updateEmployeeData), HttpStatus.OK);
				
			}
}
