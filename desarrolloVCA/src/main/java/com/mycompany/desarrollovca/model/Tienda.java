package com.mycompany.desarrollovca.model;

import java.sql.Date;

public class Tienda {

	private int codTienda;
	private String nombre;
	private String direccion;
	private String telefono;
	private Date fechaCreacion;
	private Date fechaActualizacion;
	private String descripcion;
	private String info1;
	private String info2;
	private TipoTienda tipoTienda;
	
	public Tienda(){}
	
	public Tienda(int codTienda, String nombre, String direccion, String telefono, Date fechaCreacion,
			Date fechaActualizacion, String descripcion, String info1, String info2, TipoTienda tipoTienda) {		
		this.codTienda = codTienda;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
		this.descripcion = descripcion;
		this.info1 = info1;
		this.info2 = info2;
		this.tipoTienda = tipoTienda;
	}
	
	public int getCodTienda() {
		return codTienda;
	}
	public void setCodTienda(int codTienda) {
		this.codTienda = codTienda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	public TipoTienda getTipoTienda() {
		return tipoTienda;
	}
	public void setTipoTienda(TipoTienda tipoTienda) {
		this.tipoTienda = tipoTienda;
	}
}
