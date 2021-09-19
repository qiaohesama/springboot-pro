package com.mnnu.cache.service.api;

import com.mnnu.cache.bean.Employee;

/**
 * @author qiaoh
 */
public interface EmployeeService {

    Employee getEmpById(Integer id);

    Employee updateEmp(Employee emp);

    void deleteEmp(Integer id);
}
