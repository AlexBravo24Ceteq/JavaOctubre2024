package com;

public class Celular {
	
	private String marcacelular;
	private String tipoBateria;
	private boolean traeBluetooth;
	private boolean traeCargador;
	private double precio;
	
	public Celular() {
		
	}
	
	public Celular(String marcacelular,String tipoBateria,boolean traeBluetooth,boolean traeCargador,double precio) {
		super();
		this.marcacelular = marcacelular;
		this.tipoBateria = tipoBateria;
		this.traeBluetooth = traeBluetooth;
		this.traeCargador = traeCargador;
		this.precio = precio;
	}

	public String getMarcacelular() {
		return marcacelular;
	}

	public void setMarcacelular(String marcacelular) {
		this.marcacelular = marcacelular;
	}

	public String getTipoBateria() {
		return tipoBateria;
	}

	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}

	public boolean isTraeBluetooth() {
		return traeBluetooth;
	}

	public void setTraeBluetooth(boolean traeBluetooth) {
		this.traeBluetooth = traeBluetooth;
	}

	public boolean isTraeCargador() {
		return traeCargador;
	}

	public void setTraeCargador(boolean traeCargador) {
		this.traeCargador = traeCargador;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Celular [marcacelular=" + marcacelular + ", tipoBateria=" + tipoBateria + ", traeBluetooth="
				+ traeBluetooth + ", traeCargador=" + traeCargador + ", precio=" + precio + "]";
	}
	
	
	
	
}
