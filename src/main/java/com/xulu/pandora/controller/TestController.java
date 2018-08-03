package com.xulu.pandora.controller;

import com.xulu.pandora.entity.User1;
import com.xulu.pandora.entity.User2;
import com.xulu.pandora.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulu
 * @date 2018/8/2
 * @link https://github.com/xulu163
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/testAtomikos", method = RequestMethod.GET)
    public void test( @RequestParam(value = "name1", required = true, defaultValue = "1") String name1,
                      @RequestParam(value = "age1", required = true, defaultValue = "10") Integer age1,
                      @RequestParam(value = "name2", required = true, defaultValue = "1") String name2,
                      @RequestParam(value = "age2", required = true, defaultValue = "10") Integer age2){
        User1 user1 = new User1();
        user1.setName(name1);
        user1.setAge(age1);

        User2 user2 = new User2();
        user2.setName(name2);
        user2.setAge(age2);
        testService.test(user1,user2);
    }
}
