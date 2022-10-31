package com.tiendacamisetas.model;

public class DetalleOrden {
	
	private Integer idDetalleOrden;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
	
	public DetalleOrden() {
		super();
	}
	public DetalleOrden(Integer idDetalleOrden, String nombre, double cantidad, double precio, double total) {
		super();
		this.idDetalleOrden = idDetalleOrden;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}
	
	public Integer getIdDetalleOrden() {
		return idDetalleOrden;
	}
	public void setIdDetalleOrden(Integer idDetalleOrden) {
		this.idDetalleOrden = idDetalleOrden;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "DetalleOrden [idDetalleOrden=" + idDetalleOrden + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + ", total=" + total + "]";
	}

}
