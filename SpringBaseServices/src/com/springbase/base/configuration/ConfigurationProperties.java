package com.springbase.base.configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @date : 31/5/2016
 * @time : 14:58:10
 * @author : Juan Quispe Odar
 */
@Configuration	
@PropertySources({@PropertySource(value = "file:${myproperties}/configurationIpInstance.properties", ignoreResourceNotFound = false),				  
				  @PropertySource(value = "file:${myproperties}/configurationAdminPath.properties", ignoreResourceNotFound = false),
				  @PropertySource(value = "file:${myproperties}/configurationDB.properties", ignoreResourceNotFound = false)})
public class ConfigurationProperties {
	

   @Autowired
   private Environment env;
	   	 
   @Autowired
   private Properties myProperties;
    
    @Autowired
    private ServletContext context;
    
    
    /**
	 * @date : 1/6/2016
	 * @time : 11:33:01
	 * @author : Juan Quispe Odar
	 * @descripcion : Load properties in bean "myProperties"
	 */
    
    @Autowired
    private ResourceLoader resourceLoader;
    
    @PostConstruct	
    public PropertiesFactoryBean myProperties() {
    	String pathproperties = System.getProperty("myproperties");
    	PropertiesFactoryBean factoryBean = new PropertiesFactoryBean();
    	factoryBean.setLocations(new Resource[] {resourceLoader.getResource("file:"+pathproperties+"/configurationIpInstance.properties"),
    											 resourceLoader.getResource("file:"+pathproperties+"/configurationAdminPath.properties"),
    											 resourceLoader.getResource("file:"+pathproperties+"/configurationDB.properties")});
    	return factoryBean;
    }
    
   @Bean
	public ServletContext init() {
    	Map<String, String> map = new HashMap<String, String>();	
		for (final String key : myProperties.stringPropertyNames()) {
			map.put(key, env.getProperty(key));
		}
		context.setAttribute("pathProperties", map);		
		return context;
	}
    
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages/messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

//    @Bean
//	public LocaleResolver localeResolver(){
//		CookieLocaleResolver resolver = new CookieLocaleResolver();
//		resolver.setDefaultLocale(new Locale("en"));
//		resolver.setCookieName("myLocaleCookie");
//		resolver.setCookieMaxAge(4800);
//		return resolver;
//	}
    
//	public void addInterceptors(InterceptorRegistry registry) {
//		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
//		interceptor.setParamName("mylocale");
//	    registry.addInterceptor(interceptor);
//	}
    
    
    

}

