package com;

public class Jugeteria {
	
	private String tipodeJugete;
	private String echode;
	private double costo;
	private boolean garantia;
	private int cantidad;
	
	public Jugeteria() {
		
	}

	public Jugeteria(String tipodeJugete, String echode, double costo, boolean garantia, int cantidad) {
		super();
		this.tipodeJugete = tipodeJugete;
		this.echode = echode;
		this.costo = costo;
		this.garantia = garantia;
		this.cantidad = cantidad;
	}

	public String getTipodeJugete() {
		return tipodeJugete;
	}

	public void setTipodeJugete(String tipodeJugete) {
		this.tipodeJugete = tipodeJugete;
	}

	public String getEchode() {
		return echode;
	}

	public void setEchode(String echode) {
		this.echode = echode;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public boolean isGarantia() {
		return garantia;
	}

	public void setGarantia(boolean garantia) {
		this.garantia = garantia;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Jugeteria [tipodeJugete=" + tipodeJugete + ", echode=" + echode + ", costo=" + costo + ", garantia="
				+ garantia + ", cantidad=" + cantidad + "]";
	}
	
	

	
	
	
	
	
	

}
