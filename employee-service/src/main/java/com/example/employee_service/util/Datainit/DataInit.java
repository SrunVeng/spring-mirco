package com.example.employee_service.util.Datainit;

import com.example.employee_service.common.enumeration.JobGrade;
import com.example.employee_service.infrastructure.entity.Department;
import com.example.employee_service.infrastructure.entity.Employee;
import com.example.employee_service.infrastructure.repository.DepartmentRepository;
import com.example.employee_service.infrastructure.repository.EmployeeRepository;
import com.example.employee_service.util.Random.RandomBasicInfo;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
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
        employee2.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee2.setLastName(RandomBasicInfo.generateRandomLastName());
        employee2.setEmail(RandomBasicInfo.generateRandomEmail());
        employee2.setJobTitle("HR Manager");
        employee2.setJobGrade(JobGrade.MANAGER);
        employee2.setDepartmentId(HRDep.getId());
        employee2.setDepartmentName(HRDep.getDepartmentName());
        employee2.setDepartmentDescription(HRDep.getDepartmentDescription());
        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee3.setLastName(RandomBasicInfo.generateRandomLastName());
        employee3.setEmail(RandomBasicInfo.generateRandomEmail());
        employee3.setJobTitle("HR Specialist");
        employee3.setJobGrade(JobGrade.ASSOCIATE);
        employee3.setDepartmentId(HRDep.getId());
        employee3.setDepartmentName(HRDep.getDepartmentName());
        employee3.setDepartmentDescription(HRDep.getDepartmentDescription());
        employeeRepository.save(employee3);

        Employee employee4 = new Employee();
        employee4.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee4.setLastName(RandomBasicInfo.generateRandomLastName());
        employee4.setEmail(RandomBasicInfo.generateRandomEmail());
        employee4.setJobTitle("Finance Director");
        employee4.setJobGrade(JobGrade.HEAD);
        employee4.setDepartmentId(FinanceDep.getId());
        employee4.setDepartmentName(FinanceDep.getDepartmentName());
        employee4.setDepartmentDescription(FinanceDep.getDepartmentDescription());
        employeeRepository.save(employee4);

        Employee employee5 = new Employee();
        employee5.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee5.setLastName(RandomBasicInfo.generateRandomLastName());
        employee5.setEmail(RandomBasicInfo.generateRandomEmail());
        employee5.setJobTitle("Finance Analyst");
        employee5.setJobGrade(JobGrade.SENIOR_ASSOCIATE);
        employee5.setDepartmentId(FinanceDep.getId());
        employee5.setDepartmentName(FinanceDep.getDepartmentName());
        employee5.setDepartmentDescription(FinanceDep.getDepartmentDescription());
        employeeRepository.save(employee5);

        Employee employee6 = new Employee();
        employee6.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee6.setLastName(RandomBasicInfo.generateRandomLastName());
        employee6.setEmail(RandomBasicInfo.generateRandomEmail());
        employee6.setJobTitle("Audit Manager");
        employee6.setJobGrade(JobGrade.SENIOR_MANAGER);
        employee6.setDepartmentId(AuditDep.getId());
        employee6.setDepartmentName(AuditDep.getDepartmentName());
        employee6.setDepartmentDescription(AuditDep.getDepartmentDescription());
        employeeRepository.save(employee6);

        Employee employee7 = new Employee();
        employee7.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee7.setLastName(RandomBasicInfo.generateRandomLastName());
        employee7.setEmail(RandomBasicInfo.generateRandomEmail());
        employee7.setJobTitle("Audit Specialist");
        employee7.setJobGrade(JobGrade.ASSOCIATE);
        employee7.setDepartmentId(AuditDep.getId());
        employee7.setDepartmentName(AuditDep.getDepartmentName());
        employee7.setDepartmentDescription(AuditDep.getDepartmentDescription());
        employeeRepository.save(employee7);

        Employee employee8 = new Employee();
        employee8.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee8.setLastName(RandomBasicInfo.generateRandomLastName());
        employee8.setEmail(RandomBasicInfo.generateRandomEmail());
        employee8.setJobTitle("Sales Executive");
        employee8.setJobGrade(JobGrade.SENIOR_ASSOCIATE);
        employee8.setDepartmentId(SalesDep.getId());
        employee8.setDepartmentName(SalesDep.getDepartmentName());
        employee8.setDepartmentDescription(SalesDep.getDepartmentDescription());
        employeeRepository.save(employee8);

        Employee employee9 = new Employee();
        employee9.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee9.setLastName(RandomBasicInfo.generateRandomLastName());
        employee9.setEmail(RandomBasicInfo.generateRandomEmail());
        employee9.setJobTitle("Sales Associate");
        employee9.setJobGrade(JobGrade.ASSOCIATE);
        employee8.setDepartmentId(SalesDep.getId());
        employee9.setDepartmentName(SalesDep.getDepartmentName());
        employee9.setDepartmentDescription(SalesDep.getDepartmentDescription());
        employeeRepository.save(employee9);

        Employee employee10 = new Employee();
        employee10.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee10.setLastName(RandomBasicInfo.generateRandomLastName());
        employee10.setEmail(RandomBasicInfo.generateRandomEmail());
        employee10.setJobTitle("Sales Manager");
        employee10.setJobGrade(JobGrade.MANAGER);
        employee10.setDepartmentId(SalesDep.getId());
        employee10.setDepartmentName(SalesDep.getDepartmentName());
        employee10.setDepartmentDescription(SalesDep.getDepartmentDescription());
        employeeRepository.save(employee10);

        Employee employee11 = new Employee();
        employee11.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee11.setLastName(RandomBasicInfo.generateRandomLastName());
        employee11.setEmail(RandomBasicInfo.generateRandomEmail());
        employee11.setJobTitle("Sales Director");
        employee11.setJobGrade(JobGrade.CHIEF);
        employee11.setDepartmentId(SalesDep.getId());
        employee11.setDepartmentName(SalesDep.getDepartmentName());
        employee11.setDepartmentDescription(SalesDep.getDepartmentDescription());
        employeeRepository.save(employee11);

        Employee employee12 = new Employee();
        employee12.setFirstName(RandomBasicInfo.generateRandomFirstName());
        employee12.setLastName(RandomBasicInfo.generateRandomLastName());
        employee12.setEmail(RandomBasicInfo.generateRandomEmail());
        employee12.setJobTitle("Finance Assistant");
        employee12.setJobGrade(JobGrade.APPRENTICE);
        employee12.setDepartmentId(FinanceDep.getId());
        employee12.setDepartmentName(FinanceDep.getDepartmentName());
        employee12.setDepartmentDescription(FinanceDep.getDepartmentDescription());
        employeeRepository.save(employee12);

    }

    @CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "fallbackFetchDepartment")
    public void DataFetching() {
        try {
            // Fetching departments for HR, Finance, Audit, and Sales
            ResponseEntity<Department> HRDepartmentEntity = restTemplate.getForEntity("http://localhost:8080/api/v1/departments/2", Department.class);
            HRDep = departmentRepository.save(HRDepartmentEntity.getBody());

            ResponseEntity<Department> FinanceDepartmentEntity = restTemplate.getForEntity("http://localhost:8080/api/v1/departments/3", Department.class);
            FinanceDep = departmentRepository.save(FinanceDepartmentEntity.getBody());

            ResponseEntity<Department> AuditDepartmentEntity = restTemplate.getForEntity("http://localhost:8080/api/v1/departments/4", Department.class);
            AuditDep = departmentRepository.save(AuditDepartmentEntity.getBody());

            ResponseEntity<Department> SalesDepartmentEntity = restTemplate.getForEntity("http://localhost:8080/api/v1/departments/5", Department.class);
            SalesDep = departmentRepository.save(SalesDepartmentEntity.getBody());

        } catch (Exception ex) {
            throw new RuntimeException("Error while fetching departments: " + ex.getMessage(), ex);
        }
    }

    // Fallback method for Circuit Breaker
    public void fallbackFetchDepartment(Throwable throwable) {
        System.out.println("Fallback method called due to: " + throwable.getMessage());

        // Use hardcoded values or default values as a fallback
        HRDep = departmentRepository.save(
                Department.builder()
                        .departmentName("HR")
                        .departmentDescription("Human Resources")
                        .departmentCode("HR001")
                        .build()
        );

        FinanceDep = departmentRepository.save(
                Department.builder()
                        .departmentName("Finance")
                        .departmentDescription("Finance Department")
                        .departmentCode("FIN001")
                        .build()
        );

        AuditDep = departmentRepository.save(
                Department.builder()
                        .departmentName("Audit")
                        .departmentDescription("Audit Department")
                        .departmentCode("AUD001")
                        .build()
        );

        SalesDep = departmentRepository.save(
                Department.builder()
                        .departmentName("Sales")
                        .departmentDescription("Sales Department")
                        .departmentCode("SAL001")
                        .build()
        );
    }

}
