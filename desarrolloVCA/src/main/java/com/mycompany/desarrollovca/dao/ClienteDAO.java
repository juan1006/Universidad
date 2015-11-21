package com.mycompany.desarrollovca.dao;

import java.util.List;

import com.mycompany.desarrollovca.model.Cliente;

public interface ClienteDAO {

	public List<Cliente> obtenerListClienteY();
	public List<Cliente> obtenerListCliente();
	public int insertar(Cliente cliente);
}
