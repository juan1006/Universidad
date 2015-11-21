package com.mycompany.desarrollovca.model;

public class TipoTienda {

	private int codTipoTienda;
	private String descripcion;
	private String info1;
		
	public TipoTienda(){}
	
	public TipoTienda(int codTipoTienda, String descripcion, String info1) {		
		this.codTipoTienda = codTipoTienda;
		this.descripcion = descripcion;
		this.info1 = info1;
	}
	
	public int getCodTipoTienda() {
		return codTipoTienda;
	}
	public void setCodTipoTienda(int codTipoTienda) {
		this.codTipoTienda = codTipoTienda;
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
	
}
