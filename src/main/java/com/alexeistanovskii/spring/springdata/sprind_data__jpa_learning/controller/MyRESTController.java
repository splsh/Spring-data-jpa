package com.alexeistanovskii.spring.springdata.sprind_data__jpa_learning.controller;

import com.alexeistanovskii.spring.springdata.sprind_data__jpa_learning.entity.Employee;
import com.alexeistanovskii.spring.springdata.sprind_data__jpa_learning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        return employeeList;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        String surname = employeeService.getEmployee(id).getSurname();
        employeeService.deleteEmployee(id);
        return "Employee " + surname + " with id: " + id + " was deleted";
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> showAllEmployeesByName(@PathVariable String name) {
        List<Employee> employeeList = employeeService.findAllByName(name);
        return employeeList;
    }

}