package com.bunny.spring.framework.service;

import com.bunny.spring.framework.dao.products.jdbc.ProductsDao;
import com.bunny.spring.framework.entity.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JdbcDaoService {

    @Resource(name = "jdbcProductDao")
    private ProductsDao jdbcProductDao;

    public Product queryById(Long id) throws Exception {
        return jdbcProductDao.queryById(id);
    }
}
