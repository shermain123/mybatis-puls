package com.cn.controller;

import com.cn.common.RestResponse;
import com.cn.entity.User;
import com.cn.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sher on 2020/11/24.
 */

@RestController
@RequestMapping("/user/mapper")
@Api(value = "自定义xml测试")
public class UserMapperController {

    @Autowired
    private UserService userService;


    @GetMapping("/getUserMapperByName/{name}")
    public User getUserMapperByName(@PathVariable String name){
        return userService.getUserMapperByName(name);
    }

    @GetMapping("/getUserMapperList")
    public List<User> getUserMapperList(){
        List<User> list = userService.getUserMapperList();
        return list;
    }

    @GetMapping("/getUserMapperByNameList/{name}")
    public List<User> getUserMapperByNameList(@PathVariable String name){
        List<User> list = userService.getUserMapperByNameList(name);
        return list;
    }

    @ApiOperation("根据用户名查询")
    @ApiImplicitParam(name = "name",value = "用户名",required = true,dataType = "String")
    @GetMapping("/getUserMapperByNameListStr/{name}")
    public RestResponse getUserMapperByNameListStr(@PathVariable String name){
        ;
        return RestResponse.success(userService.getUserMapperByNameListStr(name));
    }
}
