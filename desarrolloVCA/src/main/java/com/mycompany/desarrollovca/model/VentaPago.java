package com.mycompany.desarrollovca.model;

public class VentaPago {

	private int codVentaPago;
	private double montoPago;
	private double numeroTarjeta;
	private String nombreTarjeta;
	private String info1;
	private String info2;
	private boolean estado = true;
	private TipoPago tipoPago;
	
	public VentaPago(){}
	
	public VentaPago(int codVentaPago, double montoPago, double numeroTarjeta, String nombreTarjeta, String info1,
			String info2, boolean estado, TipoPago tipoPago) {
		this.codVentaPago = codVentaPago;
		this.montoPago = montoPago;
		this.numeroTarjeta = numeroTarjeta;
		this.nombreTarjeta = nombreTarjeta;
		this.info1 = info1;
		this.info2 = info2;
		this.estado = estado;
		this.tipoPago = tipoPago;
	}
	
	public int getCodVentaPago() {
		return codVentaPago;
	}
	public void setCodVentaPago(int codVentaPago) {
		this.codVentaPago = codVentaPago;
	}
	public double getMontoPago() {
		return montoPago;
	}
	public void setMontoPago(double montoPago) {
		this.montoPago = montoPago;
	}
	public double getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(double numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getNombreTarjeta() {
		return nombreTarjeta;
	}
	public void setNombreTarjeta(String nombreTarjeta) {
		this.nombreTarjeta = nombreTarjeta;
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
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public TipoPago getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}
	
}
