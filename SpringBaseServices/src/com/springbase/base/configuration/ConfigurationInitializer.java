package com.springbase.base.configuration;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @date : 26/5/2016
 * @time : 15:10:10
 * @author : Juan Quispe O.
 */

public class ConfigurationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {ConfigurationProperties.class,ConfigurationModel.class,ConfigurationConectionBD.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
    @Override
    protected Filter[] getServletFilters() {
        Filter [] singleton = { new ConfigurationCORSFilter()};
        return singleton;
    }
 
}
