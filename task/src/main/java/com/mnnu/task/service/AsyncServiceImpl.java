package com.mnnu.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author qiaoh
 */
@Service
public class AsyncServiceImpl {

    @Async
    public void asyncTest() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("async");
    }
}
