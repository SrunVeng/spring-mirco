package com.example.payrollservice.core;

import com.example.payrollservice.core.dto.response.PayrollDetailsResponseDTO;
import com.example.payrollservice.core.mapper.PayrollMapper;
import com.example.payrollservice.infrastructure.repository.PayrollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PayrollServiceImpl implements PayrollService {

private final PayrollRepository payrollRepository;
private final PayrollMapper payrollMapper;

    @Override
    public List<PayrollDetailsResponseDTO> getAllPayrolls() {
        return payrollMapper.toPayrollDetailsResponseDTO(payrollRepository.findAll());
    }
}


