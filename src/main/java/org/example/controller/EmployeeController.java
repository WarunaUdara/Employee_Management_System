package org.example.controller;

import org.example.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {
    List<EmployeeDto> list=new ArrayList<>();
    @PostMapping("/add")
    List<EmployeeDto> persist(@RequestBody EmployeeDto empDto){
        list.add(empDto);
        return list;
    }
    @GetMapping
    void get(){
        System.out.println("hi");
    }

}
