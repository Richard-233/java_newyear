package com.team.miniprogram.service.impl;

import com.team.miniprogram.model.dao.OrderMapper;
import com.team.miniprogram.model.pojo.Order;
import com.team.miniprogram.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public void insert(Order order){
        orderMapper.insertSelective(order);
    }

    @Override
    public List<Order> myOrder(String openid){
        return orderMapper.selectByOpenid(openid);
    }
}
