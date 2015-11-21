package com.mycompany.desarrollovca.model;

public class TipoPago {

	private int codTipoPago;
	private String nombreTipo;
	private String info1;
	
	public TipoPago(){}
	
	public TipoPago(int codTipoPago, String nombreTipo, String info1) {
		this.codTipoPago = codTipoPago;
		this.nombreTipo = nombreTipo;
		this.info1 = info1;
	}
	
	public int getCodTipoPago() {
		return codTipoPago;
	}
	public void setCodTipoPago(int codTipoPago) {
		this.codTipoPago = codTipoPago;
	}
	public String getNombreTipo() {
		return nombreTipo;
	}
	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	public String getInfo1() {
		return info1;
	}
	public void setInfo1(String info1) {
		this.info1 = info1;
	}
}
