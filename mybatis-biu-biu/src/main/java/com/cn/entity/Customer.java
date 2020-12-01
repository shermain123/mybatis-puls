package com.cn.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sher on 2020/11/23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("customer")
public class Customer {

    @TableId(type = IdType.AUTO)
    private long id;

    @TableField("name")
    private String name;

    @TableField("desc")
    private String desc;

}
