package com.alexeistanovskii.spring.springdata.sprind_data__jpa_learning.service;

import com.alexeistanovskii.spring.springdata.sprind_data__jpa_learning.dao.EmployeeRepository;
import com.alexeistanovskii.spring.springdata.sprind_data__jpa_learning.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
    private EmployeeRepository employeeRepository;



    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
            Optional<Employee> employee1 = employeeRepository.findById(id);
            if(employee1.isPresent()){
                employee=employee1.get();
            }
        return  employee;
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List <Employee> employeeList = employeeRepository.findAllByName(name);
        return employeeList;
    }
}
