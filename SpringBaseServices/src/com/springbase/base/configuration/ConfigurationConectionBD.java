package com.springbase.base.configuration;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.springbase.base")
public class ConfigurationConectionBD extends WebMvcConfigurerAdapter{

	private static final int DEFAULT_COUNT_CONECTION_INIT = 5;
	private static final int DEFAULT_MAX_ACTIVE = 20;

	@Autowired
    private Environment env;

    @Bean(name="dataSource")
    public BasicDataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driver"));
        dataSource.setUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.username"));
        dataSource.setPassword(env.getProperty("jdbc.password"));
        dataSource.setInitialSize(DEFAULT_COUNT_CONECTION_INIT);
        dataSource.setMaxActive(DEFAULT_MAX_ACTIVE);
        dataSource.setDefaultAutoCommit(false);
        return dataSource;
    }

//	<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource"
//			destroy-method="close">
//			<property name="driverClassName" value="org.postgresql.Driver" />
//			<property name="url" value="jdbc:postgresql://${config.db.ip}:${config.db.port}/${config.db.name}?autoConnect=true" />
//			<property name="username" value="${config.db.usuario}" />
//			<property name="password" value="${config.db.clave}" />
//			<property name="initialSize" value="5" />
//			<property name="maxActive" value="20" />
//			<property name="defaultAutoCommit" value="false" />
//		</bean>
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }

    @Bean(name="txName") //USE @Transactional("txName")
    public PlatformTransactionManager txManager() {
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
        txManager.setDataSource(dataSource());
        return txManager;
    }
    
    @Bean
    public SimpleJdbcCall simpleJdbcCall(DataSource ds){
    	SimpleJdbcCall simpleJdbc = new SimpleJdbcCall(ds);
    	return simpleJdbc;
    }
}
