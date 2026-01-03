package com.tlab.trading.config.spring;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jndi.JndiTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//(DB/MyBatis/Tx)작업위한 Config!!!!!!!!!!!

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.tlab.trading", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = WebConfig.class) // WebConfig 자체를 차단
})
public class RootConfig {

	@Bean
	public DataSource dataSource() throws NamingException {
		return new JndiTemplate().lookup("java:comp/env/jndi/tlab", DataSource.class);
	}

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setConfigLocation(new ClassPathResource("mybatis/config.xml"));
		factoryBean.setDataSource(dataSource);
		return factoryBean.getObject();
	}

	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}