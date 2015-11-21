package com.mycompany.desarrollovca.model;

import java.io.Serializable;
import java.sql.Date;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int codCliente;	
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String razonSocial;
	private String RUC;
	private String DNI;
	private boolean sexo = true;
	private String correo;
	private boolean estado = true;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private Date fechaUltVisita;
	private String info1;
	private String info2;
	private String nombreCompleto;
	private TipoCliente tipoCliente;
	
	public Cliente(){}
			
	public Cliente(int codCliente, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String razonSocial, String rUC, String dNI, boolean sexo, String correo,
			boolean estado,Date fechaCreacion,
			Date fechaModificacion, Date fechaUltVisita, String info1, String info2, String nombreCompleto,
			com.mycompany.desarrollovca.model.TipoCliente tipoCliente) {

		this.codCliente = codCliente;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.razonSocial = razonSocial;
		this.RUC = rUC;
		this.DNI = dNI;
		this.sexo = sexo;
		this.correo=correo;
		this.estado = estado;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.fechaUltVisita = fechaUltVisita;
		this.info1 = info1;
		this.info2 = info2;
		this.nombreCompleto = nombreCompleto;
		this.tipoCliente = tipoCliente;
	}

	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getRUC() {
		return RUC;
	}
	public void setRUC(String rUC) {
		RUC = rUC;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
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
	public Date getFechaUltVisita() {
		return fechaUltVisita;
	}
	public void setFechaUltVisita(Date fechaUltVisita) {
		this.fechaUltVisita = fechaUltVisita;
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
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
