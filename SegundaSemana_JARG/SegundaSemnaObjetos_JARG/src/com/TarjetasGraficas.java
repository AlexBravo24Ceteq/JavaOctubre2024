package com;

public class TarjetasGraficas {
	
	private String nombre;
	private String marca;
	private String tdm;
	private int cantidad;
	private int memoria;
	public TarjetasGraficas() {}
	public TarjetasGraficas(String nombre, String marca, String tdm, int cantidad, int memoria) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.tdm = tdm;
		this.cantidad = cantidad;
		this.memoria = memoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTdm() {
		return tdm;
	}
	public void setTdm(String tdm) {
		this.tdm = tdm;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getAlmacenaminto() {
		return memoria;
	}
	public void setAlmacenaminto(int memoria) {
		this.memoria = memoria;
	}
	@Override
	public String toString() {
		return "TarjetasGraficas [nombre=" + nombre + ", marca=" + marca + ", tdm=" + tdm + ", cantidad=" + cantidad
				+ ", memoria=" + memoria + "]";
	}
	
	
	
	

}
