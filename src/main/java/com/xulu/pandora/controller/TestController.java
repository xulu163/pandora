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

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test( @RequestParam(value = "name", required = true, defaultValue = "1") String name,
                      @RequestParam(value = "age", required = true, defaultValue = "10") Integer age){
        User1 user1 = new User1();
        user1.setName(name);
        user1.setAge(age);

        User2 user2 = new User2();
        user2.setName(name);
        user2.setAge(age);
        testService.test(user1,user2);
    }
}
