package com.xulu.pandora.mapper.test1;

import com.xulu.pandora.entity.User1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by msi on 2018/8/2.
 */
@Mapper
@Component
public interface User1Mapper {

    void insert(User1 user1);
}
