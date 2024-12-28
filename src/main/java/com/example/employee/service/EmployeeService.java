package com.example.employee.service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // Get all employees
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Get employee by ID
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Add or update an employee
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Delete employee by ID
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
