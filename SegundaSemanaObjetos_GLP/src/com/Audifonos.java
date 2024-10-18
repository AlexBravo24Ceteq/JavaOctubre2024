package com;

public class Audifonos {
	
	private String marca;
	private String tipoConexion;
	private boolean microfono;
	
	
	public Audifonos() {
	}


	public Audifonos(String marca, String tipoConexion, boolean microfono) {
		super();
		this.marca = marca;
		this.tipoConexion = tipoConexion;
		this.microfono = microfono;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTipoConexion() {
		return tipoConexion;
	}


	public void setTipoConexion(String tipoConexion) {
		this.tipoConexion = tipoConexion;
	}


	public boolean isMicrofono() {
		return microfono;
	}


	public void setMicrofono(boolean microfono) {
		this.microfono = microfono;
	}


	@Override
	public String toString() {
		return "Audifonos [marca=" + marca + ", tipoConexion=" + tipoConexion + ", microfono=" + microfono + "]";
	}
	
	
	
}
