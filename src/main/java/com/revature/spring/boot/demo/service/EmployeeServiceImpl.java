package com.revature.spring.boot.demo.service;

import com.revature.spring.boot.demo.entity.Employee;
import com.revature.spring.boot.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee employeeDb = repository.findById(id).get();
        employeeDb.setName(employee.getName());
        employeeDb.setEmail(employee.getEmail());
        return repository.save(employeeDb);
    }
}
