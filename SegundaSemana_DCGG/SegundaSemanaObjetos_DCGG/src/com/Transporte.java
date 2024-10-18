package com;

public class Transporte {
	
	private String tipoTransporte;
	private boolean esPublico;
	private Double precio;
	
	public Transporte(){}
	
	public Transporte(String tipoTransporte, boolean esPublico, Double precio) {
		super();
		this.tipoTransporte = tipoTransporte;
		this.esPublico = esPublico;
		this.precio = precio;
	}
	public String getTipoTransporte() {
		return tipoTransporte;
	}
	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	public boolean isEsPublico() {
		return esPublico;
	}
	public void setEsPublico(boolean esPublico) {
		this.esPublico = esPublico;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Transporte [tipoTransporte=" + tipoTransporte + ", esPublico=" + esPublico + ", precio=" + precio + "]";
	}
	
	

}
