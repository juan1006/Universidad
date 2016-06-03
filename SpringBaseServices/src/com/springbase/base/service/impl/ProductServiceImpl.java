package com.springbase.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbase.base.bean.Rol;
import com.springbase.base.dao.ProductDao;
//import com.springbase.base.dao.ProductDao;
import com.springbase.base.service.ProductService;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Rol> obtenerRoles() {
		return productDao.obtenerRoles();
	}

}
