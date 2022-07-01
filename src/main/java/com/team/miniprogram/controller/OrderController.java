package com.team.miniprogram.controller;

import com.team.miniprogram.common.ApiRestResponse;
import com.team.miniprogram.model.pojo.Order;
import com.team.miniprogram.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import static com.team.miniprogram.common.Constant.OPENID;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/insert")
    @ResponseBody
    public ApiRestResponse insertOrder(@RequestBody Order order, HttpServletRequest request){
        order.setOpenid(request.getHeader(OPENID));
        orderService.insert(order);
        return ApiRestResponse.success();
    }

    @GetMapping("/myOrder")
    @ResponseBody
    public ApiRestResponse myOrder(HttpServletRequest request){
        List<Order> orders = orderService.myOrder(request.getHeader(OPENID));
        return ApiRestResponse.success(orders);
    }
}
