package com;

public class Auto {

	private String marca;
	private boolean autonomo;
	private int HP;
	
	public Auto(){
		
	}

	public Auto(String marca, boolean autonomo, int hP) {
		super();
		this.marca = marca;
		this.autonomo = autonomo;
		HP = hP;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isAutonomo() {
		return autonomo;
	}

	public void setAutonomo(boolean autonomo) {
		this.autonomo = autonomo;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", autonomo=" + autonomo + ", HP=" + HP + "]";
	}
	
	
}
