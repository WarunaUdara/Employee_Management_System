package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.EmployeeDto;
import org.example.entity.EmployeeEntity;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;
    private final ObjectMapper mapper=new ObjectMapper();
    @Override
    public EmployeeDto persist(EmployeeDto empDto) {
        EmployeeEntity employeeEntity = mapper.convertValue(empDto, EmployeeEntity.class);
        EmployeeEntity save = repository.save(employeeEntity);

        return mapper.convertValue(save, EmployeeDto.class);

    }

    @Override
    public List<EmployeeDto> getList() {
        List<EmployeeDto> list=new ArrayList<>();

        for (EmployeeEntity employeeEntity : repository.findAll()) {
            list.add(mapper.convertValue(employeeEntity, EmployeeDto.class));
        }
        return list;
    }
}
