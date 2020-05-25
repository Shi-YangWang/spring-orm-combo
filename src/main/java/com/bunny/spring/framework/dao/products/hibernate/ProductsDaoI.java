package com.bunny.spring.framework.dao.products.hibernate;

import com.bunny.spring.framework.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductsDaoI implements ProductsDao {
    @Autowired
    private HibernateTemplate template;

    public Product queryById(Long id) {
        return template.get(Product.class, id);
    }
}
