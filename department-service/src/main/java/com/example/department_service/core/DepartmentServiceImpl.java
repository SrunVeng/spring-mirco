package com.example.department_service.core;


import com.example.department_service.core.dto.request.DepartmentRequestDTO;
import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.core.dto.response.DepartmentResponseDTO;
import com.example.department_service.core.dto.response.EmployeeDetailsResponseDTO;
import com.example.department_service.core.mapper.DepartmentMapper;
import com.example.department_service.infrastructure.entity.Department;
import com.example.department_service.infrastructure.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;
    private final RestTemplate restTemplate;


    @Override
    public List<DepartmentDetailsResponseDTO> getAllDepartmentsDetails() {
        List<Department> departmentList = departmentRepository.findAll();
        return departmentMapper.toDepartmentDetailsResponseDTO(departmentList);
    }

    @Override
    public DepartmentResponseDTO getDepartmentNameById(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow() ;
        return departmentMapper.toDepartmentResponseDTO(department);
    }

    @Override
    public DepartmentResponseDTO getDepartmentByCode(String code) {
        Department department = departmentRepository.findByDepartmentCode(code);

        ResponseEntity<EmployeeDetailsResponseDTO> employeeDetailsResponseDTOResponseEntity =
                restTemplate.getForEntity("http://localhost:8081/employees/" + department.getEmployeeId(), EmployeeDetailsResponseDTO.class);

        employeeDetailsResponseDTOResponseEntity.getBody();

        return departmentMapper.toDepartmentResponseDTO(department);
    }

//    @Override
//    public DepartmentRequestDTO createDepartment(DepartmentRequestDTO departmentRequestDTO) {
//        if (departmentRepository.isExistsByDepartmentCode(departmentRequestDTO.getDepartmentCode())){
//            throw new RuntimeException("Department code already exists");
//        }
//
//    }

}
