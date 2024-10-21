package com;

public class Consolas {
	
	private String nombre;
	private String marca;
	private int cantidad;
	private boolean existencias;
	public Consolas() {}
	public Consolas(String nombre, String marca, int cantidad, boolean existencias) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.cantidad = cantidad;
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
	public boolean isExistencias() {
		return existencias;
	}
	public void setExistencias(boolean existencias) {
		this.existencias = existencias;
	}
	@Override
	public String toString() {
		return "Consolas [nombre=" + nombre + ", marca=" + marca + ", cantidad=" + cantidad + ", existencias="
				+ existencias + "]";
	}
	
	

}
