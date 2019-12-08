package com.footballRanking.datasource;

import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.DataSourceFactory;
import org.apache.tomcat.jdbc.pool.PoolConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

@Configuration
public class DataSourceConfig {
	
	@Autowired
	private Environment e;
	

	@Primary
    @Bean(name = "serverDataSource")
    @Qualifier("serverDataSource")
    public DataSource primaryDataSource() {
    	String driverClassName = e.getProperty("spring.datasource.driver-class-name");
    	String url = e.getProperty("spring.datasource.url");
    	String username = e.getProperty("spring.datasource.username");
    	String password = e.getProperty("spring.datasource.password");
    	Properties p = new Properties();
    	// from application.properties
    	p.setProperty("driverClassName", driverClassName);
    	p.setProperty("url", url);
    	p.setProperty("username", username);
    	p.setProperty("password", password);
    	// define other
    	p.setProperty("testOnBorrow", "true");
    	p.setProperty("validationQuery", "SELECT 1");
    	p.setProperty("validationInterval", "60000");
        PoolConfiguration pool = DataSourceFactory.parsePoolProperties(p);
        return new DataSource(pool);
    }

}


