package com.springbase.base.util;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.springbase.base.bean.Auditoria;


/**
 * @date : 26/5/2016
 * @time : 15:33:40
 * @author : Juan Quispe O.
 */
public class BeanBase implements Serializable {

	
	private static final long serialVersionUID = 1735633243116818469L;
	
	private Auditoria auditoria;
	private int accion;
	private int totalRows;

	public Auditoria getAuditoria() {
		return auditoria;
	}

	public void setAuditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}

	public int getAccion() {
		return accion;
	}

	public void setAccion(int accion) {
		this.accion = accion;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	
	public String toJsonString(){
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.JSON_STYLE);
	}
	
	public String toMultiLineString(){
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
