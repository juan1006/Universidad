package com.mycompany.desarrollovca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.desarrollovca.dao.TallaDAOImp;
import com.mycompany.desarrollovca.model.Talla;

@Service
public class TallaServiceImp implements ServiceInterface<Talla>,TallaService {

	@Autowired
	private TallaDAOImp tallaDAO;

	@Override
	public List<Talla> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertar(Talla object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Talla> listarPor(String[] filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Talla> listarPor(String filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void elimnar(Talla object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Talla object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Talla buscar(Integer pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Talla> obtenerListTalla() {
		return tallaDAO.obtenerListTalla();
	}
	
	
}
