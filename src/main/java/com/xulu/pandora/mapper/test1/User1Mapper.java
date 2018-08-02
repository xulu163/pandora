package com.xulu.pandora.mapper.test1;

import com.xulu.pandora.entity.User1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author xulu
 * @date 2018/8/2
 * @link https://github.com/xulu163
 */
@Mapper
@Component
public interface User1Mapper {

    void insert(User1 user1);
}
