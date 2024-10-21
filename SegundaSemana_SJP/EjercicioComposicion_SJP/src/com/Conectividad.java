package com;

public class Conectividad {
	
	private String conexion;
	private double bluetooth;
	private double frecuencia;
	
	public Conectividad() {
		
	}

	public Conectividad(String conexion, double bluetooth, double frecuencia) {
		super();
		this.conexion = conexion;
		this.bluetooth = bluetooth;
		this.frecuencia = frecuencia;
	}

	public String getConexion() {
		return conexion;
	}

	public void setConexion(String conexion) {
		this.conexion = conexion;
	}

	public double getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(double bluetooth) {
		this.bluetooth = bluetooth;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "[Conectividad=" + conexion + ", Bluetooth=" + bluetooth + ", Rango de frecuencia (GHz)=" + frecuencia + "]";
	}


}
