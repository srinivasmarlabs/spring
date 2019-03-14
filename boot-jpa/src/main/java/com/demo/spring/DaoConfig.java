package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DaoConfig {
	
	@Bean
	public DriverManagerDataSource dataSource()
	{
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springdb?useSSL=false");
		ds.setUsername("root");
		ds.setPassword("admin");
		return ds;

	}
	
	/*@Bean
	public LocalContainerEntityManagerFactoryBean  entityManagerFactory()
	{
		LocalContainerEntityManagerFactoryBean emf=new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setPackagesToScan("com.demo.spring.entity");
		
		HibernateJpaVendorAdapter va=new HibernateJpaVendorAdapter();
		
		va.setShowSql(true);
		va.setDatabase(Database.MYSQL);
		emf.setJpaVendorAdapter(va);
		return emf;
	}
	
	@Bean
	public JpaTransactionManager transactionManager()
	{
		JpaTransactionManager tx=new JpaTransactionManager();
		
		tx.setEntityManagerFactory(entityManagerFactory().getObject());
		
		return tx;
	}
*/
	
	//use atlest one datasource
	
}
