package com.mycompany.desarrollovca.model;

public class Talla {

	private int codTalla;
	private String nombreTalla;
	private String info1;
	private String info2;
	
	public Talla(){	}
	
	public Talla(int codTalla, String nombreTalla, String info1, String info2) {		
		this.codTalla = codTalla;
		this.nombreTalla = nombreTalla;
		this.info1 = info1;
		this.info2 = info2;
	}
	
	public int getCodTalla() {
		return codTalla;
	}
	public void setCodTalla(int codTalla) {
		this.codTalla = codTalla;
	}
	public String getNombreTalla() {
		return nombreTalla;
	}
	public void setNombreTalla(String nombreTalla) {
		this.nombreTalla = nombreTalla;
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
