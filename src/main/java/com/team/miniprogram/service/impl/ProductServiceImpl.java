package com.team.miniprogram.service.impl;

import com.team.miniprogram.model.dao.ProductMapper;
import com.team.miniprogram.model.pojo.Product;
import com.team.miniprogram.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> list(){
        List<Product> productList = productMapper.list();
        return productList;
    }

    @Override
    public List<Product> search(String keyword){
        List<Product> search = productMapper.search(keyword);
        return search;
    }
}
