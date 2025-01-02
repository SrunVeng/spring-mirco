package com.example.department_service.application;


import com.example.department_service.application.dto.request.DepartmentRequestVO;
import com.example.department_service.application.dto.response.DepartmentDetailsResponseVO;
import com.example.department_service.application.dto.response.DepartmentResponseVO;
import com.example.department_service.application.mapper.DepartmentVOMapper;
import com.example.department_service.core.DepartmentService;

import com.example.department_service.core.dto.request.DepartmentRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class Controller {

    private final DepartmentService departmentService;
    private final DepartmentVOMapper departmentVoMapper;

    @GetMapping
    public List<DepartmentDetailsResponseVO> getAllDepartmentsDetails() {

        List<DepartmentDetailsResponseVO> departmentDetailsResponseVOList =departmentVoMapper.toDepartmentDetailsResponseVO(departmentService.getAllDepartmentsDetails());
       // System.out.println(departmentDetailsResponseVOList);
        return departmentDetailsResponseVOList;

    }

    @GetMapping("/{id}")
    public DepartmentResponseVO getDepartmentNameById(@PathVariable("id") Long id){

        DepartmentResponseVO departmentResponseVO =departmentVoMapper.toDepartmentResponseVO(departmentService.getDepartmentNameById(id));
        return departmentResponseVO;

    }

    @GetMapping("/code/{code}")
    public DepartmentResponseVO getDepartmentByCode(@PathVariable("code") String code){

        DepartmentResponseVO departmentResponseVO = departmentVoMapper.toDepartmentResponseVO(departmentService.getDepartmentByCode(code));
        return departmentResponseVO;
    }

    @PostMapping
    public DepartmentResponseVO createDepartment(@RequestBody DepartmentRequestVO departmentRequestVO){

        DepartmentResponseVO departmentResponseVO = departmentVoMapper.toDepartmentRequestVO(departmentService.createDepartment(departmentRequestVO));
    }

}
