package com.example.employee_service.infrastructure.repository;

import com.example.employee_service.infrastructure.entity.Department;
import com.example.employee_service.infrastructure.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {



}
