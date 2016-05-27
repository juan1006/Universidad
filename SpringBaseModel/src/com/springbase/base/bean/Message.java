package com.springbase.base.bean;

import com.springbase.base.util.BeanBase;

/**
 * @date : 26/5/2016
 * @time : 15:32:35
 * @author : Juan Quispe O.
 */

public class Message extends BeanBase {

	private static final long serialVersionUID = 1L;

	private String name;
    private String text;
 
    public Message() {
    	Auditoria a = new Auditoria();
    	
    	super.setAccion(1);
    	super.setAuditoria(a);
    	super.setTotalRows(1);
    }
    
	public void setName(String name) {
		this.name = name;
	}

	public void setText(String text) {
		this.text = text;
	}
 
    public String getName() {
        return name;
    }
 
    public String getText() {
        return text;
    }
 
}
