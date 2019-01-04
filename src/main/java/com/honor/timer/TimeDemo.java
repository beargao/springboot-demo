package com.honor.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by rongyaowen
 * on 2019/1/4.
 */
@Component
public class TimeDemo {

//    @Scheduled(cron = "0/5 * * * * *")
    public void test() {
        System.out.println("定时任务开始咯");
    }
}
