package com.bunny.spring.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bunny.spring.framework.dao.products.ibatis")
public class DAOApplication {
    public static void main(String[] args) {
        SpringApplication.run(DAOApplication.class);
    }
}
