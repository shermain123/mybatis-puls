package com.cn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cn.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sher on 2020/11/16.
 */

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {


    User getUserById(Long id);

    List<User> getUserList();

    User getUserMapperByName(String name);

    List<User> getUserMapperList();

    List<User> getUserMapperByNameList(String name);

}
