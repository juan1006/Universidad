package com.mycompany.desarrollovca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.desarrollovca.model.Empleado;
import com.mycompany.desarrollovca.dao.EmpleadoDAOImp;

@Service
public class EmpleadoServiceImp implements EmpleadoService , ServiceInterface<Empleado> {

	@Autowired
	private EmpleadoDAOImp empleadoDAO;
	
	@Override
	public List<Empleado> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertar(Empleado object) {				
		return  empleadoDAO.insertar(object);		
	}

	@Override
	public List<Empleado> listarPor(String[] filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> listarPor(String filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void elimnar(Empleado object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Empleado object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empleado validarEmpleado(String nick, String contrasena) {
		return empleadoDAO.validarEmpleado(nick, contrasena);		
	}

	@Override
	public Empleado buscar(Integer pk) {
		// TODO Auto-generated method stub
		return null;
	}

}
