package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.EmployeeDto;
import org.example.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;
    @PostMapping("/add")
    EmployeeDto persist(@RequestBody EmployeeDto empDto){
        return service.persist(empDto);

    }
    @GetMapping
    List<EmployeeDto> getList(){
        return service.getList();
    }

}
