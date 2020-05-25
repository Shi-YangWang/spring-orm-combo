package com.bunny.spring.framework.service;

import com.bunny.spring.framework.dao.products.hibernate.ProductsDao;
import com.bunny.spring.framework.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HibernateDaoService {

    @Autowired
    private ProductsDao jdbcProductDao;

    public Product queryById(Long id) throws Exception {
        return jdbcProductDao.queryById(id);
    }
}
