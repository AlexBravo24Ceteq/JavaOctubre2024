package com;

public class Animal {
	
	private String tipoAnimal;
	private boolean esDomestico;
	private double precio;
	
	 public Animal() {
		// TODO Auto-generated constructor stub
	}
	 
	public Animal(String tipoAnimal, boolean esDomestico, double precio) {
		super();
		this.tipoAnimal = tipoAnimal;
		this.esDomestico = esDomestico;
		this.precio = precio;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public boolean isEsDomestico() {
		return esDomestico;
	}

	public void setEsDomestico(boolean esDomestico) {
		this.esDomestico = esDomestico;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Animal [tipoAnimal = " + tipoAnimal + ", esDomestico = " + esDomestico + ", precio = " + precio + "]";
	}
	
	
	

}
