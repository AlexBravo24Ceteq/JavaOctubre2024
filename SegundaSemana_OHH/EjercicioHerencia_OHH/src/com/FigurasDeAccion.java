package com;

public class FigurasDeAccion extends Juguetes{
	private boolean coleccion;
	private String serie;
	private int piezasAdicionales;
	
	public FigurasDeAccion() {
		
	}

	public FigurasDeAccion(String nombre, double precio, boolean disponibilidad, boolean coleccion, String serie,
			int piezasAdicionales) {
		super(nombre, precio, disponibilidad);
		this.coleccion = coleccion;
		this.serie = serie;
		this.piezasAdicionales = piezasAdicionales;
	}

	public boolean isColeccion() {
		return coleccion;
	}

	public void setColeccion(boolean coleccion) {
		this.coleccion = coleccion;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public int getPiezasAdicionales() {
		return piezasAdicionales;
	}

	public void setPiezasAdicionales(int piezasAdicionales) {
		this.piezasAdicionales = piezasAdicionales;
	}

	@Override
	public String toString() {
		return "FigurasDeAccion [coleccion=" + coleccion + ", serie=" + serie + ", piezasAdicionales="
				+ piezasAdicionales + ", toString()=" + super.toString() + "]";
	}
	
}
