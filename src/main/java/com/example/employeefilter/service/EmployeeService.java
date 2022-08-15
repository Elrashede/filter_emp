package com.example.employeefilter.service;

import com.example.employeefilter.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee>filterEmployee(String query);


    Employee createEmployee(Employee employee);
}
