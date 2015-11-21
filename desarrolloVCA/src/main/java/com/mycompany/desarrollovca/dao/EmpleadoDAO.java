package com.mycompany.desarrollovca.dao;

import com.mycompany.desarrollovca.model.Empleado;

public interface EmpleadoDAO {

	public Empleado validarEmpleado(String nick,String contrasena);
	public Integer insertar(Empleado object);
}
