package com.xulu.pandora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by msi on 2018/8/2.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test(){

    }
}
