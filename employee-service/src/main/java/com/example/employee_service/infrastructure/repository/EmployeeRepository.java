package com.example.department_service.infrastructure.repository;

import com.example.department_service.infrastructure.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {






}
