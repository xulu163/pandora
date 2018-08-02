package com.xulu.pandora.mapper.test2;

import com.xulu.pandora.entity.User2;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by msi on 2018/8/2.
 */
@Mapper
public interface User2Mapper {

    void insert(User2 user2);
}
