package com.classmate.server.config;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.classmate.server.properties.DatabaseProperties;

@Configuration
@ComponentScan(basePackages = { "com.classmate.server" })
@MapperScan("com.classmate.server.dao.mapper")
public class Config {
	
	@Bean
    public DataSource dataSource(DatabaseProperties databaseProperties) {

        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(databaseProperties.getDbDriverClassName());
        ds.setUrl(databaseProperties.getDbUrl());
        ds.setUsername(databaseProperties.getDbUserName());
        ds.setPassword(databaseProperties.getDbPassword());
        ds.setMaxWait(1000);
        ds.setTestWhileIdle(false);

        try {
            ds.getConnection();
        } catch (SQLException e) {
            System.exit(1);
        }

        //		com.alibaba.druid.filter.logging.Slf4jLogFilter
        List<Filter> filters = new ArrayList<>();

        Slf4jLogFilter slf4jLogFilter = new Slf4jLogFilter();
        slf4jLogFilter.setStatementExecutableSqlLogEnable(true);
        filters.add(slf4jLogFilter);
        
        StatFilter statfilter = new StatFilter();
        statfilter.setMergeSql(true);
        statfilter.setLogSlowSql(true);
        statfilter.setSlowSqlMillis(1000);
        filters.add(statfilter); 
        
        ds.setProxyFilters(filters);

        return ds;
    }

}
