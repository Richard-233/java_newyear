package com.team.miniprogram.service;

import com.team.miniprogram.model.pojo.Product;

import java.util.List;

public interface ProductService {
    List<Product> list();

    List<Product> search(String keyword);
}
