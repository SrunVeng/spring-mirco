package com.example.department_service.infrastructure.repository;

import com.example.department_service.infrastructure.entity.Department;
import com.example.department_service.infrastructure.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // {ReturnType} findBy{attributeName}(String attributeValue);


}
