package com;

public class Pantallas {
	
	private String nombre;
	private String marca;
	private int cantidad;
	private int tamano;
	private boolean existencias;
	public Pantallas() {}
	public Pantallas(String nombre, String marca, int cantidad, int tamano, boolean existencias) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.cantidad = cantidad;
		this.tamano = tamano;
		this.existencias = existencias;
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	public boolean isExistencias() {
		return existencias;
	}
	public void setExistencias(boolean existencias) {
		this.existencias = existencias;
	}
	@Override
	public String toString() {
		return "Pantallas [nombre=" + nombre + ", marca=" + marca + ", cantidad=" + cantidad + ", tamano=" + tamano
				+ ", existencias=" + existencias + "]";
	}
	
}
