package com.example.employeefilter.service.imp;

import com.example.employeefilter.model.Employee;
import com.example.employeefilter.repository.EmployeeRepository;
import com.example.employeefilter.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImp implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> filterEmployee(String query) {
        List<Employee>employeeList=employeeRepository.filterEmployees(query);
        return  employeeList;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
