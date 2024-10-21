package com;

public class Editorial {
	private String nombreEditorial;
	private String direccion;
	private int tiraje;
	
//	constructor vacio y con argumentos
	public Editorial() {
		
	}

	public Editorial(String nombreEditorial, String direccion, int tiraje) {
		super();
		this.nombreEditorial = nombreEditorial;
		this.direccion = direccion;
		this.tiraje = tiraje;
	}

//	getters y setters
	public String getNombreEditorial() {
		return nombreEditorial;
	}

	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTiraje() {
		return tiraje;
	}

	public void setTiraje(int tiraje) {
		this.tiraje = tiraje;
	}

	@Override
	public String toString() {
		return "\nNombre de la Editorial: " + nombreEditorial + "\nDireccion=" + direccion + "\nTiraje=" + tiraje;
	}
}
