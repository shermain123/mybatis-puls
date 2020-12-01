package com.cn.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cn.common.BusinessException;
import com.cn.common.CommonErrorCode;
import com.cn.entity.User;
import com.cn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sher on 2020/11/24.
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserMapperByName(String name) {
        return getUserMapperByName(name);
    }

    @Override
    public List<User> getUserMapperList() {
        return userMapper.getUserMapperList();
    }

    @Override
    public List<User> getUserMapperByNameList(String name) {
        if("1".equals(name)){
            throw new BusinessException(CommonErrorCode.UNKOWN);
        }

        return userMapper.getUserMapperByNameList(name);
    }

    @Override
    public List<User> getUserMapperByNameListStr(String name) {
        if("1".equals(name)){
            throw new BusinessException(CommonErrorCode.E100101);
        }
        return userMapper.getUserMapperByNameList(name);
    }
}
