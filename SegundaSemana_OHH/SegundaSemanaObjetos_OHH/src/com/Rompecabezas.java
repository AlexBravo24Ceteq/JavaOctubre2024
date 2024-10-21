package com;

public class Rompecabezas {
	private String nombreRompecabezas;
	private String proveedor;
	private int piezas;
	private double precio;
	private boolean existenciaEnTienda;
	
//	Constructores vacio y con argumentos
	public Rompecabezas() {
		
	}
	public Rompecabezas(String nombreRompecabezas, String proveedor, int piezas, double precio,
			boolean existenciaEnTienda) {
		super();
		this.nombreRompecabezas = nombreRompecabezas;
		this.proveedor = proveedor;
		this.piezas = piezas;
		this.precio = precio;
		this.existenciaEnTienda = existenciaEnTienda;
	}
	
//	getters y setters
	public String getNombreRompecabezas() {
		return nombreRompecabezas;
	}
	public void setNombreRompecabezas(String nombreRompecabezas) {
		this.nombreRompecabezas = nombreRompecabezas;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public int getPiezas() {
		return piezas;
	}
	public void setPiezas(int piezas) {
		this.piezas = piezas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isExistenciaEnTienda() {
		return existenciaEnTienda;
	}
	public void setExistenciaEnTienda(boolean existenciaEnTienda) {
		this.existenciaEnTienda = existenciaEnTienda;
	}
	
//	toString
	@Override
	public String toString() {
		return "Rompecabezas [nombreRompecabezas=" + nombreRompecabezas + ", proveedor=" + proveedor + ", piezas="
				+ piezas + ", precio=" + precio + ", existenciaEnTienda=" + existenciaEnTienda + "]";
	}
}
