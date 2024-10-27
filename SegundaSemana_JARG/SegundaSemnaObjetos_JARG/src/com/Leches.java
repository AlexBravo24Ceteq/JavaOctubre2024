package com;

public class Leches {
	
	private String nombre;
	private String marca;
	private String sabor;
	private int cantidad;
	public Leches() {}
	public Leches(String nombre, String marca, String sabor, int cantidad) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.sabor = sabor;
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Leches [nombre=" + nombre + ", marca=" + marca + ", sabor=" + sabor + ", cantidad=" + cantidad + "]";
	}
	
}
