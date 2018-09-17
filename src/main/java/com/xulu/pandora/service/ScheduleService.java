package com.xulu.pandora.service;

import com.xulu.pandora.util.RedisLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author xulu
 * @date 2018/8/15
 * @link https://github.com/xulu163
 */
@Service
public class ScheduleService {

    @Autowired
    RedisLock redisLock;
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "0 29 21 * * ?")
    public void testCron(){
        logger.info("分布式定时任务test开始-------->");
        String key = "test_sche";
        try {
            if(redisLock.lock(key)) {
                System.out.println("test001...");
            }
        } catch (Exception e) {
            logger.error("同步人员异常", e);
        } finally {
            redisLock.unlock(key);
        }

    }
}
