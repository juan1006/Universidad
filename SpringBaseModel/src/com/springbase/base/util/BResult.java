package com.springbase.base.util;

import java.io.Serializable;

/**
 * @date : 26/5/2016
 * @time : 15:34:03
 * @author : Juan Quispe O.
 */

public class BResult implements Serializable {
	
	private static final long serialVersionUID = -1226694481073416865L;

	private Integer estado;

	private String mensaje;

	private Integer codigo;

	private Object result;
	
	

	public BResult() {
		super();
	}

	public BResult(Integer estado, String mensaje) {
		super();
		this.estado = estado;
		this.mensaje = mensaje;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
