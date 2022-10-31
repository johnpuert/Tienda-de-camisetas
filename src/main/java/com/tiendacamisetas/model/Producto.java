package com.tiendacamisetas.model;

public class Producto {

	private Integer idProducto;
	private String nombre;
	private String categoria;
	private String imagen;
	private double precio;
	private int cantidad;
	
	public Producto() {
		super();
	}
	
	public Producto(Integer idProducto, String nombre, String categoria, String imagen, double precio, int cantidad) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.categoria = categoria;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", categoria=" + categoria + ", imagen="
				+ imagen + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
}
