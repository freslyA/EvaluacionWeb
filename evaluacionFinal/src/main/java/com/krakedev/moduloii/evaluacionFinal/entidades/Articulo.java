package com.krakedev.moduloii.evaluacionFinal.entidades;

import java.math.BigDecimal;

public class Articulo {
	private String id;
	private String nombre;
	private BigDecimal precio_venta;
	private BigDecimal precio_compra;
	private Grupo id_grupos;
	
	public Articulo() {
		
	}
	public Articulo(String id, String nombre, BigDecimal precio_venta, BigDecimal precio_compra, Grupo id_grupos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio_venta = precio_venta;
		this.precio_compra = precio_compra;
		this.id_grupos = id_grupos;
	}
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", precio_venta=" + precio_venta + ", precio_compra="
				+ precio_compra + ", id_grupos=" + id_grupos + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(BigDecimal precio_venta) {
		this.precio_venta = precio_venta;
	}
	public BigDecimal getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(BigDecimal precio_compra) {
		this.precio_compra = precio_compra;
	}
	public Grupo getId_grupos() {
		return id_grupos;
	}
	public void setId_grupos(Grupo id_grupos) {
		this.id_grupos = id_grupos;
	}
	
	
	
}
