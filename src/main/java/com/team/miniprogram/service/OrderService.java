package com.team.miniprogram.service;

import com.team.miniprogram.model.pojo.Order;

import java.util.List;

public interface OrderService {
    void insert(Order order);

    List<Order> myOrder(String openid);
}
