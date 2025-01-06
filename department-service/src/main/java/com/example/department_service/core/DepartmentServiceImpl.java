package com.example.department_service.core;


import com.example.department_service.common.exception.FieldAlreadyExistsException;
import com.example.department_service.common.exception.ResourceNotFoundException;
import com.example.department_service.core.dto.request.DepartmentRequestDTO;
import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.core.dto.response.DepartmentResponseDTO;
import com.example.department_service.core.mapper.DepartmentMapper;
import com.example.department_service.infrastructure.entity.Department;
import com.example.department_service.infrastructure.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
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
        return departmentMapper.toDepartmentDetailsResponseDTO(departmentList);
    }

    @Override
    public DepartmentResponseDTO getDepartmentNameById(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Department", "id", id));
        ;
        return departmentMapper.toDepartmentResponseDTO(department);
    }

    @Override
    public DepartmentResponseDTO getDepartmentByCode(String code) {
        if (!departmentRepository.existsByDepartmentCode(code)) {
            throw new ResourceNotFoundException("Department", "code", code);
        }


        return departmentMapper.toDepartmentResponseDTO(departmentRepository.findByDepartmentCode(code));
    }

    @Override
    public DepartmentResponseDTO createDepartment(DepartmentRequestDTO departmentRequestDTO) {

        if (departmentRepository.existsByDepartmentCode(departmentRequestDTO.getDepartmentCode())) {
            throw new FieldAlreadyExistsException("departmentCode", departmentRequestDTO.getDepartmentCode());
        }

        // Map DTO to Entity
        Department department = departmentMapper.fromDepartmentRequestDTO(departmentRequestDTO);

        // Save Entity
        Department savedDepartment = departmentRepository.save(department);

        // Return Response
        return departmentMapper.toDepartmentResponseDTO(savedDepartment);
    }


}
