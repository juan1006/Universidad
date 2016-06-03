package com.springbase.base.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.springbase.base.bean.Product;
import com.springbase.base.property.PropertyManager;
import com.springbase.base.property.PropertyMapper.URI;
import com.springbase.base.util.BResult;


/**
 * @date : 1/6/2016
 * @time : 11:31:38
 * @author : Juan Quispe Odar
 */
@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private PropertyManager propertyManager;
	
	@RequestMapping(value = { "","/" }, method = RequestMethod.GET)
	public String productsPage(ModelMap model) {
	
		Product p  = new Product();
		
		model.addAttribute("product", p);
		
		return "products";
	}
	
	@ResponseBody
	@RequestMapping(value = "save" , method = RequestMethod.POST)
	public BResult grabarProducto(@ModelAttribute("Product") Product product) {
		BResult result = null;
		String url = StringUtils.EMPTY;
		try {
			restTemplate = new RestTemplate();
			result = new BResult();
			url = propertyManager.getUriService(URI.SERVICE_PRODUCT_SAVE);
			result = restTemplate.postForObject(url, product ,BResult.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
