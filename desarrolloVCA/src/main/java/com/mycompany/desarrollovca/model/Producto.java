package com.mycompany.desarrollovca.model;

import java.sql.Date;

public class Producto {

	private int SKU;
	private String descripcion;
	private boolean estado = true;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private String creador;
	private double costo;
	private double precio;
	private String info1;
	private String info2;
	private Talla talla;
	private Color color;
	
	public Producto(){}
	
	public Producto(int sKU, String descripcion, boolean estado, Date fechaCreacion, Date fechaModificacion,
			String creador, double costo, double precio, String info1, String info2, Talla talla, Color color) {
		SKU = sKU;
		this.descripcion = descripcion;
		this.estado = estado;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.creador = creador;
		this.costo = costo;
		this.precio = precio;
		this.info1 = info1;
		this.info2 = info2;
		this.talla = talla;
		this.color = color;
	}



	public int getSKU() {
		return SKU;
	}
	public void setSKU(int sKU) {
		SKU = sKU;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
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
	public Talla getTalla() {
		return talla;
	}
	public void setTalla(Talla talla) {
		this.talla = talla;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
}
