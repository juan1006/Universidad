package com.mycompany.desarrollovca.model;

public class TiendaProducto {

	private Producto producto;
	private Tienda tienda;
	private int cantidadReal;
	private int cantidadSeparada;
	private String info1;
	private String info2;
	
	public TiendaProducto(){}
	
	public TiendaProducto(Producto producto, Tienda tienda, int cantidadReal, int cantidadSeparada, String info1,
			String info2) {
		this.producto = producto;
		this.tienda = tienda;
		this.cantidadReal = cantidadReal;
		this.cantidadSeparada = cantidadSeparada;
		this.info1 = info1;
		this.info2 = info2;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Tienda getTienda() {
		return tienda;
	}
	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	public int getCantidadReal() {
		return cantidadReal;
	}
	public void setCantidadReal(int cantidadReal) {
		this.cantidadReal = cantidadReal;
	}
	public int getCantidadSeparada() {
		return cantidadSeparada;
	}
	public void setCantidadSeparada(int cantidadSeparada) {
		this.cantidadSeparada = cantidadSeparada;
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
