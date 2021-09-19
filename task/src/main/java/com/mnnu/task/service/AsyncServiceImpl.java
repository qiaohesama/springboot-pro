package com.mnnu.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author qiaoh
 */
@Service
public class AsyncServiceImpl {

    private int i = 1;

    @Async
    public void asyncTest() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("async");
    }

    @Scheduled(cron = "* * * * * 1-7")
    public void scheduling() {

        System.out.println("hello world" + i);
        i++;
    }
}
