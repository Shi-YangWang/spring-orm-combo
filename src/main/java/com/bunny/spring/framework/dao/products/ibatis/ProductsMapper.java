package com.bunny.spring.framework.dao.products.ibatis;

import com.bunny.spring.framework.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductsMapper {
    @Select("SELECT * FROM products WHERE id = #{id}")
    public Product queryById(Long id);
}
