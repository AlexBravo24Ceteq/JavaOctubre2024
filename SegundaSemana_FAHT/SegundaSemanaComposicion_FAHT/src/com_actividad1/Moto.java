package com_actividad1;

public class Moto {

	private String marca;
	private String modelo;
	private String color;
	
	private Motor motores;
	private Llanta llantas;
	private Frenos freno;
	
	public Moto () {	
	}

	public Moto(String marca, String modelo, String color, Motor motores, Llanta llantas, Frenos freno) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.motores = motores;
		this.llantas = llantas;
		this.freno = freno;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Motor getMotores() {
		return motores;
	}

	public void setMotores(Motor motores) {
		this.motores = motores;
	}

	public Llanta getLlantas() {
		return llantas;
	}

	public void setLlantas(Llanta llantas) {
		this.llantas = llantas;
	}

	public Frenos getFreno() {
		return freno;
	}

	public void setFreno(Frenos freno) {
		this.freno = freno;
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", \nmotores=" + motores
				+ ", \nllantas=" + llantas + ", \nfreno=" + freno + "]";
	}
	
	
	
	
}// end
