package com.cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class User {

    @TableId
    private Long id;

    @TableField("user_name")
    private String userName;

    @TableField("PASSWORD")
    private String password;

    @TableField("USER_NAME")
    private String name;

    @TableField("AGE")
    private Integer age;

    @TableField("EMAIL")
    private String email;
}
