package com.springbase.base.bean;

import java.io.Serializable;

/**
 * @date : 26/5/2016
 * @time : 17:14:24
 * @author : Juan Quispe O.
 */
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer SKU;
	private String name;
	private String color;
	private String size;
	
	public Integer getSKU() {
		return SKU;
	}
	public void setSKU(Integer sKU) {
		SKU = sKU;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}
