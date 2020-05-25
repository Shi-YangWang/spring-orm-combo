package com.bunny.spring.framework;

import com.alibaba.druid.pool.DruidDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class HibernateConfig {
    @Autowired
    private DruidDataSource dataSource;

    @Bean
    public SessionFactory getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMappingResources(
                "hibernate/Product.hbm.xml"
        );
        Properties hibernateProperties = new Properties();
        try {
            hibernateProperties.load(new BufferedInputStream(new FileInputStream(new File("src/main/resources/hibernate/hibernate.conf"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        factoryBean.setHibernateProperties(hibernateProperties);
        try {
            factoryBean.afterPropertiesSet();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return factoryBean.getObject();
    }

    @Bean
    public HibernateTemplate getHibernateTemplate() {
        return new HibernateTemplate(getSessionFactory());
    }
}
