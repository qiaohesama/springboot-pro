package com.mnnu.cache.service;

import com.mnnu.cache.bean.Employee;
import com.mnnu.cache.mapper.EmployeeMapper;
import com.mnnu.cache.service.api.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author qiaoh
 */
@Service
@Slf4j
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    EmployeeMapper employeeMapper;


    /*@Resource
    RedisCacheManager cacheManager;*/


    @Override
    @Cacheable(cacheNames = "emp", key = "#id")
    public Employee getEmpById(Integer id) {
        log.info("查询员工{}", id);
        return employeeMapper.getEmpById(id);
    }

    //使用硬编码的方式存入缓存中
    /*  @Override
     * public Employee getEmpById(Integer id) {
     *     log.info("查询员工{}", id);
     *     Employee empById = employeeMapper.getEmpById(id);
     *     Cache cache = cacheManager.getCache("emp");
     *     //只需要传入id，他会默认拼接成emp::id格式
     *     Objects.requireNonNull(cache).put(id, empById);
     *
     *     return empById;
     * }
     */


    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    @CachePut(cacheNames = "emp", key = "#emp.id")
    public Employee updateEmp(Employee emp) {
        log.info("更新{}号员工", emp.getId());
        employeeMapper.updateEmp(emp);
        return emp;
    }

    @Override
    @CacheEvict(cacheNames = "emp", key = "#id", beforeInvocation = true)
    public void deleteEmp(Integer id) {
        log.info("删除{}号员工", id);
        // 删除操作...
    }


}
