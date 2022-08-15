package com.example.employeefilter.controller;

import com.example.employeefilter.model.Employee;
import com.example.employeefilter.service.EmployeeService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/filter")
    public ResponseEntity<List<Employee>>filterEmployees(@RequestParam("query") String query){
        return  ResponseEntity.ok(employeeService.filterEmployee(query));
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
}
