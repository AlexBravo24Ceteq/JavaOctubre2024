package com;

public class Calidad {
	
	private String resolucion;
	private String deformaciones;
	private String calidad;
	
	public Calidad() {
		
	}

	public Calidad(String resolucion, String deformaciones, String calidad) {
		super();
		this.resolucion = resolucion;
		this.deformaciones = deformaciones;
		this.calidad = calidad;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getDeformaciones() {
		return deformaciones;
	}

	public void setDeformaciones(String deformaciones) {
		this.deformaciones = deformaciones;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	@Override
	public String toString() {
		return "Calidad [resolucion=" + resolucion + ", deformaciones=" + deformaciones + ", calidad=" + calidad + "]";
	}
	
	

}
