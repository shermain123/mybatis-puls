package com.cn.service;

import com.cn.entity.Customer;
import com.cn.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sher on 2020/11/23.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public Customer getCustomer(int id){
        return customerMapper.selectById(id);
    }
}
