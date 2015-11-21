package com.mycompany.desarrollovca.model;

import java.io.Serializable;
import java.sql.Date;

public class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int codEmpleado;
	public String primerNombre;
	public String segundoNombre;
	public String apellidoPat;
	public String apellidoMat;
	public Date fechaRegistro;
	public Date fechaActualizacion;
	public boolean estado= true;
	public Date fechaIngreso;
	public String telefono;
	public String correo;
	public String contrasena;
	public String nick;
	public String info1;
	public String info2;
	public String nombreCompleto;
	
	public Empleado(){}
	
	public Empleado(int codEmpleado, String primerNombre, String segundoNombre, String apellidoPaterno,
			String apellidoMaterno, Date fechaRegistro, Date fechaActualizacion, boolean estado, Date fechaIngreso,
			String telefono, String correo, String contrasena, String nick, String info1, String info2,
			String nombreCompleto) {
		this.codEmpleado = codEmpleado;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.apellidoPat = apellidoPaterno;
		this.apellidoMat = apellidoMaterno;
		this.fechaRegistro = fechaRegistro;
		this.fechaActualizacion = fechaActualizacion;
		this.estado = estado;
		this.fechaIngreso = fechaIngreso;
		this.telefono = telefono;
		this.correo = correo;
		this.contrasena = contrasena;
		this.nick = nick;
		this.info1 = info1;
		this.info2 = info2;
		this.nombreCompleto = nombreCompleto;
	}
	public int getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getInfo1() {
		return info1;
	}
	public void setInfo1(String info1) {
		this.info1 = info1;
	}
	public String getInfo2() {
		return info2;
	}
	public void setInfo2(String info2) {
		this.info2 = info2;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}
}
