package com.cn.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cn.entity.User;
import com.cn.mapper.UserMapper;
import com.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sher on 2020/11/23.
 * mybatis测试
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    /**
     * 根据主键查询返回一条数据
     * */
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable long id){
        return userMapper.selectById(id);
    }

    /**
     * 根据主键删除
     * */
    @GetMapping("/delete/{id}")
    public int delete(@PathVariable Long id){
        return userMapper.deleteById(id);
    }

    /**
     * 查询集合
     * */
    @GetMapping("/getUserList")
    public List<User> getUserList(){
        return userMapper.getUserList();
    }

    /**
     * 新增
     * */
    @GetMapping("/insert")
    public void insert(){
        User user = new User();
        user.setAge(20);
        user.setEmail("123366");
        user.setName("王二狗");
        user.setPassword("123456");
        userMapper.insert(user);
    }

    /**
     * 使用条件构造器QueryWrapper查询 返回一条数据
     * */
    @GetMapping("/getUserOneByName/{id}")
    public User getUserOneByName(@PathVariable Long id){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name","lisi");
        return userMapper.selectOne(queryWrapper);
    }

    /**
     * 使用条件构造器QueryWrapper查询 返回多条数据
     * */
    @GetMapping("/getUserListByName/{name}")
    public List<User> getUserListByName(@PathVariable String name){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",name).eq("id",6).or().gt("age",20);
        return userMapper.selectList(queryWrapper);
    }
}
