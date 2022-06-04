package com.alexeistanovskii.spring.springdata.sprind_data__jpa_learning.service;



import com.alexeistanovskii.spring.springdata.sprind_data__jpa_learning.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
