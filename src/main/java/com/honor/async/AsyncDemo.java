package com.honor.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by rongyaowen
 * on 2019/1/4.
 */
@Component
public class AsyncDemo {

    @Async
    public void test(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i + "异步线程id：" + Thread.currentThread().getId());
    }
}
