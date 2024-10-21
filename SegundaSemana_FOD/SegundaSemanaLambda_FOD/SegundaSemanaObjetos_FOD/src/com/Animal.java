package com;

public class Animal {

	private String especie;
	private String nombre;
	private String habitat;
	private boolean vertebrado;
	private boolean invertebrado;
	
	public Animal() {
		super();
	}

	public Animal(String especie, String nombre, String habitat, boolean vertebrado, boolean invertebrado) {
		super();
		this.especie = especie;
		this.nombre = nombre;
		this.habitat = habitat;
		this.vertebrado = vertebrado;
		this.invertebrado = invertebrado;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public boolean isVertebrado() {
		return vertebrado;
	}

	public void setVertebrado(boolean vertebrado) {
		this.vertebrado = vertebrado;
	}

	public boolean isInvertebrado() {
		return invertebrado;
	}

	public void setInvertebrado(boolean invertebrado) {
		this.invertebrado = invertebrado;
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", nombre=" + nombre + ", habitat=" + habitat + ", vertebrado="
				+ vertebrado + ", invertebrado=" + invertebrado + "]";
	}
	
	
	
}
