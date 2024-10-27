package com;

public class Distribuidor {
	private String nombreDistribuidor;
	private String direccionBodega;
	private boolean disponibilidad;
	
//	constructor vacio y con argumentos
	public Distribuidor() {
		
	}

	public Distribuidor(String nombreDistribuidor, String direccionBodega, boolean disponibilidad) {
		super();
		this.nombreDistribuidor = nombreDistribuidor;
		this.direccionBodega = direccionBodega;
		this.disponibilidad = disponibilidad;
	}

//	getters y setters
	public String getNombreDistribuidor() {
		return nombreDistribuidor;
	}

	public void setNombreDistribuidor(String nombreDistribuidor) {
		this.nombreDistribuidor = nombreDistribuidor;
	}

	public String getDireccionBodega() {
		return direccionBodega;
	}

	public void setDireccionBodega(String direccionBodega) {
		this.direccionBodega = direccionBodega;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	@Override
	public String toString() {
		return "\nNombre del distribuidor: " + nombreDistribuidor + "\nDirección: " + direccionBodega
				+ "\nDisponibilidad en bodega: " + disponibilidad;
	}
}
