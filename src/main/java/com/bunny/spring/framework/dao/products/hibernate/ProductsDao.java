package com.bunny.spring.framework.dao.products.hibernate;

import com.bunny.spring.framework.entity.Product;

public interface ProductsDao {
    public Product queryById(Long id);
}
