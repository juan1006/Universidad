package com.mycompany.desarrollovca.model;

public class TipoDocumento {

	private int codTipDocumento;
	private String descripcion;
	private String info1;
	private String info2;
	
	public TipoDocumento(){}
	
	public TipoDocumento(int codTipDocumento, String descripcion, String info1, String info2) {
		this.codTipDocumento = codTipDocumento;
		this.descripcion = descripcion;
		this.info1 = info1;
		this.info2 = info2;
	}
	
	public int getCodTipDocumento() {
		return codTipDocumento;
	}
	public void setCodTipDocumento(int codTipDocumento) {
		this.codTipDocumento = codTipDocumento;
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
}
