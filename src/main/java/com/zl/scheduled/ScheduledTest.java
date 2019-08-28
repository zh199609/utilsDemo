package com.zl.scheduled;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName: ScheduledTest
 * @Description: TODO
 * @Author: zl
 * @Date: 2019/8/8 20:56
 * @Version: 1.0
 **/
@Component
@EnableScheduling
public class ScheduledTest implements InitializingBean {


    @Scheduled(cron = "0/20 * * * * ?")
    public void test() {
        System.out.println("任务执行");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
