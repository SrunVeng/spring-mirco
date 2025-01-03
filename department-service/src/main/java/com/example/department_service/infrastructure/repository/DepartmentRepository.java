package com.example.department_service.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
   // {ReturnType} findBy{attributeName}(String attributeValue);

    Department findByDepartmentCode(String departmentCode);
    Boolean existsByDepartmentCode(String departmentCode);




}
