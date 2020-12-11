package com.github.apz.sample.mapper;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.springtestdbunit.bean.DatabaseDataSourceConnectionFactoryBean;

@SpringBootApplication
public class SpringDbunitSampleApplicationTest {
	@Bean(name = "dbUnitDatabaseConnection")
    public DatabaseDataSourceConnectionFactoryBean dbUnitDatabaseConnection(DataSource dataSource) {
        DatabaseDataSourceConnectionFactoryBean connectionFactory = new DatabaseDataSourceConnectionFactoryBean();
        connectionFactory.setDataSource(dataSource);
        return connectionFactory;
    }
}
