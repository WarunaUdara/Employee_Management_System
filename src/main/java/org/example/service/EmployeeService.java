package org.example.service;

import org.example.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto persist(EmployeeDto empDto);

    List<EmployeeDto> getList();
}
