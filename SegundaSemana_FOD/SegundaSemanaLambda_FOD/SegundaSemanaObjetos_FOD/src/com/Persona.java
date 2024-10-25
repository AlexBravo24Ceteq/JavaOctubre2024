package com;

public class Persona {
 
	private String nombre;
	private int edad;
	private String direccion;
	private int cel;
	private String sexo;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, int edad, String direccion, int cel, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.cel = cel;
		this.sexo = sexo;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCel() {
		return cel;
	}

	public void setCel(int cel) {
		this.cel = cel;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + ", cel=" + cel + ", sexo="
				+ sexo + "]";
	}
	
	
	
}
