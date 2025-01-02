package com.example.department_service.application;


import com.example.department_service.application.dto.request.DepartmentRequestVO;
import com.example.department_service.application.dto.response.DepartmentDetailsResponseVO;
import com.example.department_service.application.dto.response.DepartmentResponseVO;
import com.example.department_service.application.mapper.DepartmentVOMapper;
import com.example.department_service.core.DepartmentService;

import com.example.department_service.core.dto.request.DepartmentRequestDTO;
import com.example.department_service.core.dto.response.DepartmentResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class Controller {

    private final DepartmentService departmentService;
    private final DepartmentVOMapper departmentVoMapper;

    @GetMapping("/all")
    public List<DepartmentDetailsResponseVO> getAllDepartmentsDetails() {
        return departmentVoMapper.toDepartmentDetailsResponseVO(departmentService.getAllDepartmentsDetails());

    }

    @GetMapping("/{id}")
    public DepartmentResponseVO getDepartmentNameById(@PathVariable("id") Long id) {
        return departmentVoMapper.toDepartmentResponseVO(departmentService.getDepartmentNameById(id));

    }

    @GetMapping("/code/{code}")
    public DepartmentResponseVO getDepartmentByCode(@PathVariable("code") String code) {
        return departmentVoMapper.toDepartmentResponseVO(departmentService.getDepartmentByCode(code));
    }

    @PostMapping("/create")
    public DepartmentResponseVO createDepartment(@RequestBody DepartmentRequestVO departmentRequestVO) {

        // Map VO to DTO
        DepartmentRequestDTO departmentRequestDTO = departmentVoMapper.toDepartmentRequestDTO(departmentRequestVO);

        // Call service to create department
        DepartmentResponseDTO departmentResponseDTO = departmentService.createDepartment(departmentRequestDTO);

        // Map DTO to VO
        return departmentVoMapper.toDepartmentResponseVO(departmentResponseDTO);
    }


}
