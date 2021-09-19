package com.mnnu.cache.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author qiaoh
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    private Integer id;
    private String lastName;
    private String email;

    /**
     * 1 男 0 女
     */
    private Integer gender;
    /**
     * 部门id
     */
    private Integer did;
}
