package com.springbase.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbase.base.bean.Product;
import com.springbase.base.bean.Rol;
import com.springbase.base.service.ProductService;
import com.springbase.base.util.BResult;

/**
 * @date : 1/6/2016
 * @time : 11:31:54
 * @author : Juan Quispe Odar
 */
@RestController
@RequestMapping("productservice")
public class ProductServiceController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value= {"","/"},method = RequestMethod.GET)
	private String initGet(){
		
		return "holaGet";
	}
	
	@RequestMapping(value={"","/"},method = RequestMethod.POST)
	private BResult initPost(){
		BResult result = null;
		result = new BResult();
		result.setMensaje("Se guardo con exito");
		result.setCodigo(1);
		result.setResult(null);
		result.setEstado(1);
		return result;
	}
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	private BResult guardarClienteOffLine(@RequestBody Product Product){
		BResult result = null;
		List<Rol> listRol = null;
		try {
			listRol = productService.obtenerRoles();
			result = new BResult();
			if(listRol.size()>0 || !listRol.isEmpty()) {
			result.setMensaje(listRol.get(0).getDescripcion());}
			result.setCodigo(1);
			result.setResult(null);
			result.setEstado(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
