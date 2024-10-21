package com;

public class Procesadores {
	
	private String nombre;
	private String marca;
	private String modelo;
	private String cache;
	private int cantidad;
	private boolean existencias;
	public Procesadores() {}
	public Procesadores(String nombre, String marca, String modelo, String cache, int cantidad, boolean existencias) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.cache = cache;
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCache() {
		return cache;
	}
	public void setCache(String cache) {
		this.cache = cache;
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
		return "Procesadores [nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", cache=" + cache
				+ ", cantidad=" + cantidad + ", existencias=" + existencias + "]";
	}
	
	
	

}
