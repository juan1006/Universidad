package com.mycompany.desarrollovca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.desarrollovca.dao.ClienteDAOImp;
import com.mycompany.desarrollovca.model.Cliente;

@Service
public class ClienteServiceImp implements ServiceInterface<Cliente>,ClienteService{

	@Autowired
	private ClienteDAOImp clienteDAO;
	
	@Override
	public List<Cliente> listarTodos() {
		 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Integer insertar(Cliente cliente) {
		return clienteDAO.insertar(cliente);
	}

	@Override
	public List<Cliente> listarPor(String[] filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listarPor(String filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void elimnar(Cliente object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Cliente object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscar(Integer pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente obtenerListClientePor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Cliente> obtenerListCliente() {		
		return clienteDAO.obtenerListCliente();
	}


}
