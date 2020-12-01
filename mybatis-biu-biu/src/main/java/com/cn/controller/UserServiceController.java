package com.cn.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cn.entity.User;
import com.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sher on 2020/11/24.
 */

@RestController
@RequestMapping("/user/service")
public class UserServiceController {

    @Autowired
    private UserService userService;

    @GetMapping("/getCount")
    public int getCount(){
        return userService.count();
    }

    @GetMapping("/getList")
    public List<User> getList(){
        return  userService.list();
    }

    @GetMapping("/getCount/{name}")
    public int getCount(@PathVariable String name){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",name);
        return userService.count(queryWrapper);
    }

    @GetMapping("/getList/{name}")
    public List<User> getListByName(@PathVariable String name){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",name);
        return userService.list(queryWrapper);
    }
}
