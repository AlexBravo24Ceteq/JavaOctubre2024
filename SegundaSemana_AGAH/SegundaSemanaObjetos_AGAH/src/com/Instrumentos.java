package com;

public class Instrumentos {

	private String tipodeInstrumento;
	private String paisdeOrigen;
	private String material;
	private double costo;
	private int cantidaddeInstrumentos;
	
	public Instrumentos() {
		
	}

	public Instrumentos(String tipodeInstrumento, String paisdeOrigen, String material, double costo,
			int cantidaddeInstrumentos) {
		super();
		this.tipodeInstrumento = tipodeInstrumento;
		this.paisdeOrigen = paisdeOrigen;
		this.material = material;
		this.costo = costo;
		this.cantidaddeInstrumentos = cantidaddeInstrumentos;
	}

	public String getTipodeInstrumento() {
		return tipodeInstrumento;
	}

	public void setTipodeInstrumento(String tipodeInstrumento) {
		this.tipodeInstrumento = tipodeInstrumento;
	}

	public String getPaisdeOrigen() {
		return paisdeOrigen;
	}

	public void setPaisdeOrigen(String paisdeOrigen) {
		this.paisdeOrigen = paisdeOrigen;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getCantidaddeInstrumentos() {
		return cantidaddeInstrumentos;
	}

	public void setCantidaddeInstrumentos(int cantidaddeInstrumentos) {
		this.cantidaddeInstrumentos = cantidaddeInstrumentos;
	}

	@Override
	public String toString() {
		return "Instrumentos [tipodeInstrumento=" + tipodeInstrumento + ", paisdeOrigen=" + paisdeOrigen + ", material="
				+ material + ", costo=" + costo + ", cantidaddeInstrumentos=" + cantidaddeInstrumentos + "]";
	}
	
	
}
