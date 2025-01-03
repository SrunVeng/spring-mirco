package com.example.payrollservice.infrastructure.repository;

import com.example.employee_service.infrastructure.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
