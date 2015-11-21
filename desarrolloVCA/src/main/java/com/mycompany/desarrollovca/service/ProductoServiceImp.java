package com.mycompany.desarrollovca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.desarrollovca.dao.ProductoDAOImp;
import com.mycompany.desarrollovca.model.Producto;

@Service
public class ProductoServiceImp implements  ServiceInterface<Producto>, ProductoService{

	@Autowired
	private ProductoDAOImp productoDAO;
	
	@Override
	public List<Producto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertar(Producto producto) {
		return productoDAO.insertar(producto);
	}

	@Override
	public List<Producto> listarPor(String[] filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> listarPor(String filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void elimnar(Producto object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Producto object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto buscar(Integer pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> obtenerListProducto() {		 
		return productoDAO.obtenerListProducto();
	}

}
