package com.xulu.pandora.service;

import com.xulu.pandora.mapper.test1.User1Mapper;
import com.xulu.pandora.mapper.test2.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by msi on 2018/8/2.
 */
@Service
public class TestService {

    @Autowired
    User1Mapper user1Mapper;
    @Autowired
    User2Mapper user2Mapper;
}
