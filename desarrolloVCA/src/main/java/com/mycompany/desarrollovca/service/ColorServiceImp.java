package com.mycompany.desarrollovca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.desarrollovca.dao.ColorDAOImp;
import com.mycompany.desarrollovca.model.Color;

@Service
public class ColorServiceImp implements ServiceInterface<Color>, ColorService {

	@Autowired
	private ColorDAOImp colorDAO;
	
	@Override
	public List<Color> obtenerListColor() {		
		return colorDAO.obtenerListColor();
	}

	@Override
	public List<Color> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertar(Color object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Color> listarPor(String[] filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Color> listarPor(String filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void elimnar(Color object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Color object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color buscar(Integer pk) {
		// TODO Auto-generated method stub
		return null;
	}

}
