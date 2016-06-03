package com.springbase.base.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import com.springbase.base.property.PropertyMapper.URI;
import static com.springbase.base.property.PropertyMapper.URL_BASE;

/**
 * @date : 1/6/2016
 * @time : 11:32:40
 * @author : Juan Quispe Odar
 */
@Component
public class PropertyManager {

	@Autowired
	private Environment env;
	
	public String getProperty(String propName) {
		return env.getProperty(propName);
	}
	
	public String getUriService(URI uri){
		return getProperty(URL_BASE.SERVICES_WEB.getUrl()) + getProperty(uri.getURI());
	}
	
}
