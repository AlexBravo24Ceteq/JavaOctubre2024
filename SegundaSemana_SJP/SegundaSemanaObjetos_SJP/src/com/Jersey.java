package com;

public class Jersey {
	private String equipo;
	private String talla;
	private double precio;
	private boolean disponible;
	
	public Jersey() {
		
	}
	
	public Jersey(String equipo, String talla, double precio, boolean disponible) {
		super();
		this.equipo = equipo;
		this.talla = talla;
		this.precio = precio;
		this.disponible = disponible;
	}



	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Jersey [Equipo=" + equipo + ", Talla=" + talla + ", Precio=" + precio + ", Disponible=" + disponible
				+ "]";
	}
	
	

}
