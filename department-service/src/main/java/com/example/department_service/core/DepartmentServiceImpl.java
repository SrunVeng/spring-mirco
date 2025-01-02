package com.example.department_service.core;


import com.example.department_service.core.dto.request.DepartmentRequestDTO;
import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.core.dto.response.DepartmentResponseDTO;
import com.example.department_service.core.mapper.DepartmentMapper;
import com.example.department_service.infrastructure.entity.Department;
import com.example.department_service.infrastructure.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;


    @Override
    public List<DepartmentDetailsResponseDTO> getAllDepartmentsDetails() {

        List<Department> departmentList = departmentRepository.findAll();
       // System.out.println(departmentList);
        List<DepartmentDetailsResponseDTO> DepartmentDetailsResponseDTO = departmentMapper.toDepartmentDetailsResponseDTO(departmentList);
      //  System.out.println(DepartmentDetailsResponseDTO);
        return DepartmentDetailsResponseDTO;
    }

    @Override
    public DepartmentResponseDTO getDepartmentNameById(Long id) {
        //1. Query Entity byID
        Department department = departmentRepository.findById(id).orElseThrow();
        //2. Map to DTO
        DepartmentResponseDTO departmentResponseDTO = departmentMapper.toDepartmentResponseDTO(department);
        return departmentResponseDTO;
    }

    @Override
    public DepartmentResponseDTO getDepartmentByCode(String code) {
       Department department = departmentRepository.findByDepartmentCode(code);
        DepartmentResponseDTO departmentResponseDTO = departmentMapper.toDepartmentResponseDTO(department);
        return departmentResponseDTO;
    }

    @Override
    public DepartmentResponseDTO createDepartment(DepartmentRequestDTO departmentRequestDTO) {

        if (departmentRepository.existsByDepartmentCode(departmentRequestDTO.getDepartmentCode())) {
            throw new RuntimeException("Department code already exists");
        }

        // Map DTO to Entity
        Department department = departmentMapper.toEntity(departmentRequestDTO);

        // Save Entity
        Department savedDepartment = departmentRepository.save(department);

        // Map Entity to Response DTO
        DepartmentResponseDTO responseDTO = departmentMapper.toDepartmentResponseDTO(savedDepartment);

        // Return Response
        return responseDTO;
    }


}
