package com.mnnu.cache.controller;

import com.mnnu.cache.bean.Employee;
import com.mnnu.cache.service.api.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qiaoh
 */
@RestController
public class EmployeeController {

    @Resource
    EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id) {
        return employeeService.getEmpById(id);
    }

    @GetMapping("/emp/{id}/{lastName}/{email}/{gender}/{did}")
    public Employee updateEmp(@PathVariable("id") Integer id,
                              @PathVariable("lastName") String lastName,
                              @PathVariable("email") String email,
                              @PathVariable("gender") Integer gender,
                              @PathVariable("did") Integer did) {
        return employeeService.updateEmp(new Employee(id, lastName, email, gender, did));
    }

}
