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


@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;
    private final RestTemplate restTemplate;


    @Override
    public List<DepartmentDetailsResponseDTO> getAllDepartmentsDetails() {
        List<Department> departmentList = departmentRepository.findAll();
        return departmentMapper.toListDepartmentDetailsResponseDTO(departmentList);
    }

    @Override
    public DepartmentResponseDTO getDepartmentNameById(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow() ;
        return departmentMapper.toDepartmentResponseDTO(department);
    }

    @Override
    public DepartmentDetailsResponseDTO getDepartmentByCode(String code) {

        Department department = departmentRepository.findByDepartmentCode(code);
        return departmentMapper.toDepartmentDetailsResponseDTO(department);

    }

    @Override
    public DepartmentResponseDTO createDepartment(DepartmentRequestDTO departmentRequestDTO) {

        if (departmentRepository.existsByDepartmentCode(departmentRequestDTO.getDepartmentCode())) {
            throw new RuntimeException("Department code already exists");
        }

        // Map DTO to Entity
        Department department = departmentMapper.fromDepartmentRequestDTO(departmentRequestDTO);

        // Save Entity
        Department savedDepartment = departmentRepository.save(department);

        // Return Response
        return departmentMapper.toDepartmentResponseDTO(savedDepartment);
    }


}
