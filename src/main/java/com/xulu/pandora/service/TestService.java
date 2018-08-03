package com.xulu.pandora.service;

import com.xulu.pandora.entity.User1;
import com.xulu.pandora.entity.User2;
import com.xulu.pandora.mapper.test1.User1Mapper;
import com.xulu.pandora.mapper.test2.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author xulu
 * @date 2018/8/2
 * @link https://github.com/xulu163
 */
@Service
public class TestService {

    @Autowired
    User1Mapper user1Mapper;
    @Autowired
    User2Mapper user2Mapper;

    @Transactional(transactionManager = "xatx", propagation = Propagation.REQUIRED, rollbackFor = {java.lang.RuntimeException.class})
    public void test(User1 user1, User2 user2){
        user1Mapper.insert(user1);
        int n = 10/user2.getAge();
        user2Mapper.insert(user2);
    }

    @Async
    public void asyncTest() throws Exception{
        Thread.sleep(5000);
        System.out.println("异步线程打印：hello，world！");
    }
}
