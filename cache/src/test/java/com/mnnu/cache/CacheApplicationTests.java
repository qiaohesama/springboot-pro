package com.mnnu.cache;

import com.mnnu.cache.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class CacheApplicationTests {

    @Resource
    EmployeeMapper employeeMapper;

    @Resource
    RedisTemplate<Object, Object> redisTemplate;

    @Resource
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        System.out.println(employeeMapper.getEmpById(1));
    }

    /**
     * redis可以操作的五大类型
     * String List Set  Hash ZSet(有序集合)
     */
    @Test
    public void redisTest() {

    }
}
