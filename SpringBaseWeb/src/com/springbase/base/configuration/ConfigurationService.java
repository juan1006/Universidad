package com.springbase.base.configuration;

import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.CoreConnectionPNames;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @date : 31/5/2016
 * @time : 14:58:31
 * @author : Juan Quispe Odar
 */
@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@ComponentScan("com.springbase.base")
public class ConfigurationService  extends WebMvcConfigurerAdapter{
		
	  private static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 100;

	  private static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 5;

	  private static final int DEFAULT_READ_TIMEOUT_MILLISECONDS = (60 * 1000);

	 
	 private ObjectMapper objectMapper = new ObjectMapper();

	  @Bean
	 public ClientHttpRequestFactory httpRequestFactory() {
	  return new HttpComponentsClientHttpRequestFactory(httpClient());
	 }

	 /**
	 * @return : restTemplate
	 * @date : 1/6/2016
	 * @time : 11:34:31
	 * @author : Juan Quispe Odar
	 * @descripcion : Response handler and sending requests to services
	 */
	 @Bean
	 public RestTemplate restTemplate() {
	  RestTemplate restTemplate = new RestTemplate(httpRequestFactory());
	  List<HttpMessageConverter<?>> converters = restTemplate
	    .getMessageConverters();

	   for (HttpMessageConverter<?> converter : converters) {
	   if (converter instanceof MappingJackson2HttpMessageConverter) {
	    MappingJackson2HttpMessageConverter jsonConverter = (MappingJackson2HttpMessageConverter) converter;
	    jsonConverter.setObjectMapper(objectMapper);
	   }
	  }

	   return restTemplate;
	 }

	  @Bean
	 public HttpClient httpClient() {

	  PoolingClientConnectionManager connectionManager = new PoolingClientConnectionManager();
	  HttpClient defaultHttpClient = new DefaultHttpClient(connectionManager);

	  connectionManager.setMaxTotal(DEFAULT_MAX_TOTAL_CONNECTIONS);
	  connectionManager.setDefaultMaxPerRoute(DEFAULT_MAX_CONNECTIONS_PER_ROUTE);
	  connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost("facebook.com")), 20);
	  connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost("twitter.com")), 20);
	  connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost("linkedin.com")), 20);
	  connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost("viadeo.com")), 20);

	  defaultHttpClient.getParams().setIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT,DEFAULT_READ_TIMEOUT_MILLISECONDS);
	  return defaultHttpClient;
	 }
	
}
