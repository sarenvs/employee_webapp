package com.employee.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {
	
	@Id	
	@GeneratedValue
	private int userId;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String address;
	private String department;
	

}
