package com.revature.spring.boot.demo.controller;

import com.revature.spring.boot.demo.entity.Employee;
import com.revature.spring.boot.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        return service.getEmployeeById(id);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") int id){
        service.deleteEmployee(id);
        return "record deleted successfully";
    }

    @PutMapping("/employees/{id}")
    public String updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
        service.updateEmployee(id, employee);
        return "record updated successfully";
    }

}
