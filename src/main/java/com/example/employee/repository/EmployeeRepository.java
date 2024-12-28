package com.example.employee.repository;

import com.example.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository for Employee entity
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
