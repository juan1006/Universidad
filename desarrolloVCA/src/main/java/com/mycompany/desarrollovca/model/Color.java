package com.mycompany.desarrollovca.model;

public class Color {

	private int codColor;
	private String nombreColor;
	private String info1;
	private String info2;
	
	public Color(){	}
	
	public Color(int codColor, String nombreColor, String info1, String info2) {		
		this.codColor = codColor;
		this.nombreColor = nombreColor;
		this.info1 = info1;
		this.info2 = info2;
	}
	
	public int getCodColor() {
		return codColor;
	}
	public void setCodColor(int codColor) {
		this.codColor = codColor;
	}
	public String getNombreColor() {
		return nombreColor;
	}
	public void setNombreColor(String nombreColor) {
		this.nombreColor = nombreColor;
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
