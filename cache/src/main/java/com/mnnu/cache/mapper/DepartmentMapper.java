package com.mnnu.cache.mapper;

import com.mnnu.cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qiaoh
 */
@Mapper
public interface DepartmentMapper {
    Department getDepartmentById(Integer id);
}
