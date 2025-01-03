package com.example.employee_service.util.Datainit;


import com.example.employee_service.common.enumeration.JobGrade;
import com.example.employee_service.infrastructure.entity.Department;
import com.example.employee_service.infrastructure.entity.Employee;
import com.example.employee_service.infrastructure.repository.DepartmentRepository;
import com.example.employee_service.infrastructure.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
@RequiredArgsConstructor
public class DataInit {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final RestTemplate restTemplate;



    @PostConstruct
    public void Init() {


        ResponseEntity<Department> ITDepartmentEntity = restTemplate.getForEntity("http://localhost:8080/departments/1", Department.class);
        Department ITDepartment = ITDepartmentEntity.getBody();
        Department ITDep = departmentRepository.save(ITDepartment);




        Employee employee1 = new Employee();
        employee1.setFirstName("John");
        employee1.setLastName("Doe");
        employee1.setEmail("johndoe@me.com");
        employee1.setJobTitle("CITO");
        employee1.setJobGrade(JobGrade.CHIEF);
        employee1.setDepartment(ITDep);

    }





}
