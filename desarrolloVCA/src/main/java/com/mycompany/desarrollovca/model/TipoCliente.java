package com.mycompany.desarrollovca.model;

import java.io.Serializable;

public class TipoCliente  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String codTipoCliente;	
	private String nombreTipo;
	private String info;
	
	public TipoCliente(){}
			
	public TipoCliente(String codTipoCliente, String nombreTipo, String info) {
	
		this.codTipoCliente = codTipoCliente;
		this.nombreTipo = nombreTipo;
		this.info = info;
	}
	
	public String getCodTipoCliente() {
		return codTipoCliente;
	}
	public void setCodTipoCliente(String codTipoCliente) {
		this.codTipoCliente = codTipoCliente;
	}
	public String getNombreTipo() {
		return nombreTipo;
	}
	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
