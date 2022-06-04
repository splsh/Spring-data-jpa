package com.alexeistanovskii.spring.springdata.sprind_data__jpa_learning.dao;

import com.alexeistanovskii.spring.springdata.sprind_data__jpa_learning.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);

}
