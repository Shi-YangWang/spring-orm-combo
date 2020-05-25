package com.bunny.spring.framework.service;

import com.bunny.spring.framework.dao.products.ibatis.ProductsMapper;
import com.bunny.spring.framework.dao.products.jdbc.ProductsDao;
import com.bunny.spring.framework.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MyBatisDaoService {

    @Autowired
    private ProductsMapper mapper;

    public Product queryById(Long id) throws Exception {
        return mapper.queryById(id);
    }
}
