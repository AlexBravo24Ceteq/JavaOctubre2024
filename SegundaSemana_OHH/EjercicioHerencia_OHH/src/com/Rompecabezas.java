package com;

public class Rompecabezas extends Juguetes {
	private String piezas;
	private String proveedor;
	private boolean gamaAlta;
	
	public Rompecabezas() {
	}

	public Rompecabezas(String nombre, double precio, boolean disponibilidad, String piezas, String proveedor,
			boolean gamaAlta) {
		super(nombre, precio, disponibilidad);
		this.piezas = piezas;
		this.proveedor = proveedor;
		this.gamaAlta = gamaAlta;
	}

	public String getPiezas() {
		return piezas;
	}

	public void setPiezas(String piezas) {
		this.piezas = piezas;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public boolean isGamaAlta() {
		return gamaAlta;
	}

	public void setGamaAlta(boolean gamaAlta) {
		this.gamaAlta = gamaAlta;
	}

	@Override
	public String toString() {
		return "Rompecabezas [piezas=" + piezas + ", proveedor=" + proveedor + ", gamaAlta=" + gamaAlta
				+ ", toString()=" + super.toString() + "]";
	}
	
}
