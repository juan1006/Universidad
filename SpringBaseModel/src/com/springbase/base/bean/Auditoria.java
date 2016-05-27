package com.springbase.base.bean;

import java.io.Serializable;
import java.util.Date;

public class Auditoria implements Serializable{
	
	private static final long serialVersionUID = -1238610338378230460L;
	private String usuarioCreacion;
	private String usuarioActualizacion;
	private Date fechaCreacion;
	private Date fechaActualizacion;
	
	public Auditoria() {
		super();
	}

	public Auditoria(String usuarioCreacion, String usuarioActualizacion,
			Date fechaCreacion, Date fechaActualizacion) {
		super();
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioActualizacion = usuarioActualizacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public String getUsuarioActualizacion() {
		return usuarioActualizacion;
	}

	public void setUsuarioActualizacion(String usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
}
