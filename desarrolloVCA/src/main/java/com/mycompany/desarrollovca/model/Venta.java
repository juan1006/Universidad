package com.mycompany.desarrollovca.model;

import java.sql.Date;

public class Venta {

	private int codVenta;
	private String numeroDoc;
	private String tipoVenta;
	private double subTotal;
	private double subTotalConImp;
	private double impuesto;
	private double total;
	private boolean estado= true;
	private Date fechaVenta;
	private Date fechaModificacion;
	private String info1;
	private String info2;
	private TipoDocumento tipoDocumento;
	private Cliente cliente;
	private Tienda tienda;
	private Empleado empleado;
	private VentaPago ventaPago;
	
	public Venta(){}
	
	public Venta(int codVenta, String numeroDoc, String tipoVenta, double subTotal, double subTotalConImp,
			double impuesto, double total, boolean estado, Date fechaVenta, Date fechaModificacion, String info1,
			String info2, TipoDocumento tipoDocumento, Cliente cliente, Tienda tienda, Empleado empleado,
			VentaPago ventaPago) {
		this.codVenta = codVenta;
		this.numeroDoc = numeroDoc;
		this.tipoVenta = tipoVenta;
		this.subTotal = subTotal;
		this.subTotalConImp = subTotalConImp;
		this.impuesto = impuesto;
		this.total = total;
		this.estado = estado;
		this.fechaVenta = fechaVenta;
		this.fechaModificacion = fechaModificacion;
		this.info1 = info1;
		this.info2 = info2;
		this.tipoDocumento = tipoDocumento;
		this.cliente = cliente;
		this.tienda = tienda;
		this.empleado = empleado;
		this.ventaPago = ventaPago;
	}

	public int getCodVenta() {
		return codVenta;
	}

	public void setCodVenta(int codVenta) {
		this.codVenta = codVenta;
	}

	public String getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	public String getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(String tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getSubTotalConImp() {
		return subTotalConImp;
	}

	public void setSubTotalConImp(double subTotalConImp) {
		this.subTotalConImp = subTotalConImp;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
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

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public VentaPago getVentaPago() {
		return ventaPago;
	}

	public void setVentaPago(VentaPago ventaPago) {
		this.ventaPago = ventaPago;
	}
}
