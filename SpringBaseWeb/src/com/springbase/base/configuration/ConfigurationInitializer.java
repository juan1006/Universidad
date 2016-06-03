package com.springbase.base.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

 /**
 * @date : 26/5/2016
 * @time : 15:08:44
 * @author : Juan Quispe Odar
 */

public class ConfigurationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {ConfigurationView.class,ConfigurationService.class,ConfigurationProperties.class};
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
}
