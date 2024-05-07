package com.vamshi.education.Config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Data {
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder=DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/freecourse");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("tiger");
        return  dataSourceBuilder.build();

    }


}
