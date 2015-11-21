package com.mycompany.desarrollovca.model;

public class Proveedor {

	private int codProveedor;
	private String nombre;
	private String ruc;
	private String web;
	private String direccion;
	private String razonSocial;
	private String telefono;
	private String celular;
	private String email;
	private String info1;
	private String info2;
	
	public Proveedor(int codProveedor, String nombre, String ruc, String web, String direccion, String razonSocial,
			String telefono, String celular, String email, String info1, String info2) {		
		this.codProveedor = codProveedor;
		this.nombre = nombre;
		this.ruc = ruc;
		this.web = web;
		this.direccion = direccion;
		this.razonSocial = razonSocial;
		this.telefono = telefono;
		this.celular = celular;
		this.email = email;
		this.info1 = info1;
		this.info2 = info2;
	}
	
	public int getCodProveedor() {
		return codProveedor;
	}
	public void setCodProveedor(int codProveedor) {
		this.codProveedor = codProveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
}
