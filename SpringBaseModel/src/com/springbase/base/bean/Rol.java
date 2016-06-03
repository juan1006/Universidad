package com.springbase.base.bean;

import com.springbase.base.util.BeanBase;

/**
 * @date : 1/6/2016
 * @time : 17:25:55
 * @author : Juan Quispe Odar
 */
public class Rol extends BeanBase {

	private static final long serialVersionUID = 2099443132774282976L;
	private Integer idRol;
	private String codigoRol;
	private String descripcion;
	private Integer estadoRol;
	private String opcionesMenu;
	private String sistema;
	
	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getCodigoRol() {
		return codigoRol;
	}

	public void setCodigoRol(String codigoRol) {
		this.codigoRol = codigoRol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoRol() {
		return estadoRol;
	}

	public void setEstadoRol(Integer estadoRol) {
		this.estadoRol = estadoRol;
	}

	public String getOpcionesMenu() {
		return opcionesMenu;
	}

	public void setOpcionesMenu(String opcionesMenu) {
		this.opcionesMenu = opcionesMenu;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}


}
