package com.revature.spring.boot.demo.service;

import com.revature.spring.boot.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public Employee addEmployee(Employee employee);
    public void deleteEmployee(int id);
    public Employee updateEmployee(int id, Employee employee);
}
