package com;

public class Ave extends Animal{
	
	private String nombre;
	private int edad;
	private double peso;
	
	public Ave() {
		// TODO Auto-generated constructor stub
	}

	public Ave(String tipoAnimal, boolean esDomestico, double precio, String nombre, int edad, double peso) {
		super(tipoAnimal, esDomestico, precio);
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return super.toString()+ "\n" +getTipoAnimal()+ " [nombre = " + nombre + ", edad = " + edad + " meses, peso = " + peso + "Kg]";
	}
	
	

}
