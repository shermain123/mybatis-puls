package com.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by sher on 2020/11/16.
 */
@SpringBootApplication
@MapperScan("com.cn.mapper")
@ServletComponentScan
public class Application {
    public static void main(String [] args){
        SpringApplication.run(Application.class,args);
    }
}
