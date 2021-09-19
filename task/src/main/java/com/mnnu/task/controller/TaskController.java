package com.mnnu.task.controller;

import com.mnnu.task.service.AsyncServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qiaoh
 */
@RestController
public class TaskController {
    @Resource
    AsyncServiceImpl asyncService;

    @GetMapping("/async")
    public String async() {
        asyncService.asyncTest();
        return "success";
    }
}
