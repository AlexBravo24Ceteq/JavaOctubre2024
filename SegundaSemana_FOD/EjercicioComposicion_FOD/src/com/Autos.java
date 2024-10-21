package com;

public class Autos {
	private String marca;
	private String modelo;
	private String color;
	private Motor hp;
	private Llantas medida;
	private Interior interior;
	
	public Autos() {
		super();
	}

	public Autos(String marca, String modelo, String color, Motor hp, Llantas medida, Interior interior) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.hp = hp;
		this.medida = medida;
		this.interior = interior;
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

	public Motor getHp() {
		return hp;
	}

	public void setHp(Motor hp) {
		this.hp = hp;
	}

	public Llantas getMedida() {
		return medida;
	}

	public void setMedida(Llantas medida) {
		this.medida = medida;
	}

	public Interior getInterior() {
		return interior;
	}

	public void setInterior(Interior interior) {
		this.interior = interior;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", hp=" + hp + ", medida=" + medida
				+ ", interior=" + interior + "]";
	}

	

}
