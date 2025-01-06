package com.example.department_service.util.Datainit;

import com.example.department_service.common.constance.DepartmentConstance;
import com.example.department_service.infrastructure.entity.Department;
import com.example.department_service.infrastructure.repository.DepartmentRepository;
import com.example.department_service.util.Random.CodeGenerator;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInit {

    private final DepartmentRepository departmentRepository;

    @PostConstruct
    public void init() {
        Department department1 = Department.builder()
                .departmentCode(CodeGenerator.departmentCodeGenerator(DepartmentConstance.HEAD_OFFICE))
                .departmentDescription("IT Department")
                .departmentName(DepartmentConstance.IT_DEPARTMENT)
                .build();
        Department department2 = Department.builder()
                .departmentCode(CodeGenerator.departmentCodeGenerator(DepartmentConstance.HEAD_OFFICE))
                .departmentDescription("HR Department")
                .departmentName(DepartmentConstance.HR_DEPARTMENT)
                .build();
        Department department3 = Department.builder()
                .departmentCode(CodeGenerator.departmentCodeGenerator(DepartmentConstance.HEAD_OFFICE))
                .departmentDescription("FINANCE Department")
                .departmentName(DepartmentConstance.FINANCE_DEPARTMENT)
                .build();
        Department department4 = Department.builder()
                .departmentCode(CodeGenerator.departmentCodeGenerator(DepartmentConstance.HEAD_OFFICE))
                .departmentDescription("AUDIT Department")
                .departmentName(DepartmentConstance.AUDIT_DEPARTMENT)
                .build();
        Department department5 = Department.builder()
                .departmentCode(CodeGenerator.departmentCodeGenerator(DepartmentConstance.BRANCH))
                .departmentDescription("SALES Department")
                .departmentName(DepartmentConstance.SALES_DEPARTMENT)
                .build();


        departmentRepository.saveAll(List.of(department1, department2, department3, department4, department5));
    }
}
