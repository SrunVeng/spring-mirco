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

    private Department HRDep;
    private Department FinanceDep;
    private Department AuditDep;
    private Department SalesDep;

    @PostConstruct
    public void Init() {
        DataFetching();


        Employee employee2 = new Employee();
        employee2.setFirstName("Alice");
        employee2.setLastName("Smith");
        employee2.setEmail("alicesmith@me.com");
        employee2.setJobTitle("HR Manager");
        employee2.setJobGrade(JobGrade.MANAGER);
        employee2.setDepartment(HRDep);
        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setFirstName("Bob");
        employee3.setLastName("Johnson");
        employee3.setEmail("bobjohnson@me.com");
        employee3.setJobTitle("HR Specialist");
        employee3.setJobGrade(JobGrade.ASSOCIATE);
        employee3.setDepartment(HRDep);
        employeeRepository.save(employee3);

        Employee employee4 = new Employee();
        employee4.setFirstName("Charlie");
        employee4.setLastName("Brown");
        employee4.setEmail("charliebrown@me.com");
        employee4.setJobTitle("Finance Director");
        employee4.setJobGrade(JobGrade.HEAD);
        employee4.setDepartment(FinanceDep);
        employeeRepository.save(employee4);

        Employee employee5 = new Employee();
        employee5.setFirstName("David");
        employee5.setLastName("Wilson");
        employee5.setEmail("davidwilson@me.com");
        employee5.setJobTitle("Finance Analyst");
        employee5.setJobGrade(JobGrade.SENIOR_ASSOCIATE);
        employee5.setDepartment(FinanceDep);
        employeeRepository.save(employee5);

        Employee employee6 = new Employee();
        employee6.setFirstName("Eve");
        employee6.setLastName("Davis");
        employee6.setEmail("evedavis@me.com");
        employee6.setJobTitle("Audit Manager");
        employee6.setJobGrade(JobGrade.SENIOR_MANAGER);
        employee6.setDepartment(AuditDep);
        employeeRepository.save(employee6);

        Employee employee7 = new Employee();
        employee7.setFirstName("Frank");
        employee7.setLastName("Miller");
        employee7.setEmail("frankmiller@me.com");
        employee7.setJobTitle("Audit Specialist");
        employee7.setJobGrade(JobGrade.ASSOCIATE);
        employee7.setDepartment(AuditDep);
        employeeRepository.save(employee7);

        Employee employee8 = new Employee();
        employee8.setFirstName("Grace");
        employee8.setLastName("Moore");
        employee8.setEmail("gracemoore@me.com");
        employee8.setJobTitle("Sales Executive");
        employee8.setJobGrade(JobGrade.SENIOR_ASSOCIATE);
        employee8.setDepartment(SalesDep);
        employeeRepository.save(employee8);

        Employee employee9 = new Employee();
        employee9.setFirstName("Hank");
        employee9.setLastName("Taylor");
        employee9.setEmail("hanktaylor@me.com");
        employee9.setJobTitle("Sales Associate");
        employee9.setJobGrade(JobGrade.ASSOCIATE);
        employee9.setDepartment(SalesDep);
        employeeRepository.save(employee9);

        Employee employee10 = new Employee();
        employee10.setFirstName("Ivy");
        employee10.setLastName("Anderson");
        employee10.setEmail("ivyanderson@me.com");
        employee10.setJobTitle("Sales Manager");
        employee10.setJobGrade(JobGrade.MANAGER);
        employee10.setDepartment(SalesDep);
        employeeRepository.save(employee10);

        Employee employee11 = new Employee();
        employee11.setFirstName("Jack");
        employee11.setLastName("Thomas");
        employee11.setEmail("jackthomas@me.com");
        employee11.setJobTitle("Sales Director");
        employee11.setJobGrade(JobGrade.CHIEF);
        employee11.setDepartment(SalesDep);
        employeeRepository.save(employee11);

        Employee employee12 = new Employee();
        employee12.setFirstName("Jose");
        employee12.setLastName("Phil");
        employee12.setEmail("JosePhil@me.com");
        employee12.setJobTitle("Finance Assistant");
        employee12.setJobGrade(JobGrade.APPRENTICE);
        employee12.setDepartment(SalesDep);
        employeeRepository.save(employee12);



    }

    public void DataFetching() {
        // Fetching departments for HR, Finance, Audit, and Sales
        ResponseEntity<Department> HRDepartmentEntity = restTemplate.getForEntity("http://localhost:8080/api/v1/departments/2", Department.class);
        HRDep = departmentRepository.save(HRDepartmentEntity.getBody());

        ResponseEntity<Department> FinanceDepartmentEntity = restTemplate.getForEntity("http://localhost:8080/api/v1/departments/3", Department.class);
        FinanceDep = departmentRepository.save(FinanceDepartmentEntity.getBody());

        ResponseEntity<Department> AuditDepartmentEntity = restTemplate.getForEntity("http://localhost:8080/api/v1/departments/4", Department.class);
        AuditDep = departmentRepository.save(AuditDepartmentEntity.getBody());

        ResponseEntity<Department> SalesDepartmentEntity = restTemplate.getForEntity("http://localhost:8080/api/v1/departments/5", Department.class);
        SalesDep = departmentRepository.save(SalesDepartmentEntity.getBody());

    }

}
