package com.team.miniprogram.controller;

import com.team.miniprogram.common.ApiRestResponse;
import com.team.miniprogram.model.pojo.Product;
import com.team.miniprogram.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/list")
    @ResponseBody
    public ApiRestResponse productList(){
        List<Product> list = productService.list();
        return ApiRestResponse.success(list);
    }

    @GetMapping("/search")
    @ResponseBody
    public ApiRestResponse search(String keyword){
        List<Product> search = productService.search(keyword);
        return ApiRestResponse.success(search);
    }

}
