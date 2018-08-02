package com.xulu.pandora.mapper.test2;

import com.xulu.pandora.entity.User2;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author xulu
 * @date 2018/8/2
 * @link https://github.com/xulu163
 */
@Mapper
@Component
public interface User2Mapper {

    void insert(User2 user2);
}
