package com.cn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cn.entity.User;

import java.util.List;

/**
 * Created by sher on 2020/11/24.
 */
public interface UserService extends IService<User> {

    User getUserMapperByName(String name);

    List<User> getUserMapperList();

    List<User> getUserMapperByNameList(String name);

    List<User> getUserMapperByNameListStr(String name);
}
