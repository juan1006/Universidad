package com.springbase.base.property;

/**
 * @date : 1/6/2016
 * @time : 11:32:20
 * @author : Juan Quispe Odar
 */
public class PropertyMapper {

	public enum URI{
		SERVICE_PRODUCT_SAVE("url.service.product.save");
		
		public final String URI;
		
		URI(String URI){
			this.URI = URI;
		}
		
		public String getURI() {
			return URI;
		}
		
		
	}
	
	
	public enum URL_BASE{
		SERVICES_WEB("instance.url.servicios.web");
		
		public final String url;
		
		URL_BASE(String url){
			this.url = url;
		}
		
		public String getUrl() {
			return url;
		}
	}
}
