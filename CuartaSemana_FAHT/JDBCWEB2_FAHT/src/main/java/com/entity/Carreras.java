package com.entity;

public class Carreras {

	//en el paquete com.entity vamos a crear o 
		//modelar nuetros objetos que representan entidades
		//en la BD, para poder manipularlos desde aquí en Java
	
	private int carreraId;
	private String nombre;
	private String area;
	private String semestres;
	private int presupuesto;
	
	public Carreras () {}

	public Carreras(int carreraId, String nombre, String area, String semestres, int presupuesto) {
		super();
		this.carreraId = carreraId;
		this.nombre = nombre;
		this.area = area;
		this.semestres = semestres;
		this.presupuesto = presupuesto;
	}

	public int getCarreraId() {
		return carreraId;
	}

	public void setCarreraId(int carreraId) {
		this.carreraId = carreraId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSemestres() {
		return semestres;
	}

	public void setSemestres(String semestres) {
		this.semestres = semestres;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Carreras [carreraId=" + carreraId + ", nombre=" + nombre + ", area=" + area + ", semestres=" + semestres
				+ ", presupuesto=" + presupuesto + "]";
	}
	
	
}//end
