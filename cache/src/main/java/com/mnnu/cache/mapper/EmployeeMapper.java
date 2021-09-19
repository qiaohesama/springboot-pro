package com.mnnu.cache.mapper;

import com.mnnu.cache.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qiaoh
 */
@Mapper
public interface EmployeeMapper {
    Employee getEmpById(Integer id);

    void updateEmp(Employee employee);

    void deleteEmp(Integer id);

    void insertEmp(Integer id);
}
