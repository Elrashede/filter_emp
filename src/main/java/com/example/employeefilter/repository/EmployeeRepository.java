package com.example.employeefilter.repository;

import com.example.employeefilter.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(
            "SELECT e FROM Employee e WHERE " +
            "e.empName LIKE CONCAT('%',:query,'%')" +
                    "OR e.teamName like CONCAT('%',:query,'%')"+
                    "OR e.jobTitle like CONCAT('%',:query,'%')"+
                    "OR e.joinDate like CONCAT('%',:query,'%')"+
                    "OR e.endDate like CONCAT('%',:query,'%')"

    )
    List<Employee>filterEmployees(String query);


}
