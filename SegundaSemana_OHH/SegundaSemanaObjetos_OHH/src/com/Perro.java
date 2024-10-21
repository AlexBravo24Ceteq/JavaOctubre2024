package com;

public class Perro {
	private String nombre;
	private String raza;
	private String numeroTelefono;
	private boolean banarlo;
	
//	Constructores. Vacio y con argumentos
	public Perro() {
		
	}
	public Perro(String nombre, String raza, String numeroTelefono, boolean banarlo) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.numeroTelefono = numeroTelefono;
		this.banarlo = banarlo;
	}
	
//	Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public boolean isBanarlo() {
		return banarlo;
	}
	public void setBanarlo(boolean banarlo) {
		this.banarlo = banarlo;
	}
	
//	toString
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", numeroTelefono=" + numeroTelefono + ", banarlo="
				+ banarlo + "]";
	}
}
