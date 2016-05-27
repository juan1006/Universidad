package com.springbase.base.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbase.base.bean.Product;
import com.springbase.base.util.BResult;

@RestController
@RequestMapping("productservice")
public class ProductServiceController {

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
	
	@RequestMapping(value="save2",method=RequestMethod.POST)
	private BResult guardarClienteOffLine(@RequestBody Product Product){
		BResult result = null;
		try {
			result = new BResult();
			result.setMensaje("Se guardo con exito");
			result.setCodigo(1);
			result.setResult(null);
			result.setEstado(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
