package net.vishnu.vms.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import net.vishnu.vms.dao.VisitorDAO;
import net.vishnu.vms.dao.VisitorDAOImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.vishnu.vms")
public class SpringMvcConfig implements WebMvcConfigurer{
	
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword(""); 
	return dataSource;
	}
	
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver =new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
		
		
		
	}
	
	
	@Bean
	public VisitorDAO getVisitorDAO()
	{
		return new VisitorDAOImpl(getDataSource());
		
				
	}
	@Override
	 public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    }


}
