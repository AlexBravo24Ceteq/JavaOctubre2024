package com.entity;

public class Carrera {
	
	private int carreraId;
	private String nombre;
	private String area;
	private String semestres;
	private double presupuesto;
	
	public Carrera() {
		// TODO Auto-generated constructor stub
	}
	
	public Carrera(int carreraId, String nombre, String area, String semestres, double presupuesto) {
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

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Carreras [carreraId=" + carreraId + ", nombre=" + nombre + ", area=" + area + ", semestres=" + semestres
				+ ", presupuesto=" + presupuesto + "]";
	}
	
	
	

}
