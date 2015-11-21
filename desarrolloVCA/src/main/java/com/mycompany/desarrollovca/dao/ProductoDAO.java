package com.mycompany.desarrollovca.dao;

import java.util.List;

import com.mycompany.desarrollovca.model.Producto;

public interface ProductoDAO {

	public List<Producto> obtenerListProducto();
	public int insertar(Producto producto);
}
