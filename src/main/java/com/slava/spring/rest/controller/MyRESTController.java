package com.slava.spring.rest.controller;

import com.slava.spring.rest.entity.Employee;
import com.slava.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> showAllEmployee() {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees;
    }
    @GetMapping  ("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
        return employee;

    }
}
