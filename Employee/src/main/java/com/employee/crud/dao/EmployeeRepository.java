package com.employee.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
