package com.respuesta;

import java.util.Date;

public class Ticket {
	
	//El proposito de esta clase es responder si las operaciones se 
	//realizaron con exito o no
	
	private int folio;
	private Date fechaHora;
	private String usuario;
	private double saldo;
	private String socursal;
	private int idCajero;
	
	public Ticket() {
		
	}

	public Ticket(int folio, Date fechaHora, String usuario, double saldo, String socursal, int idCajero) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.usuario = usuario;
		this.saldo = saldo;
		this.socursal = socursal;
		this.idCajero = idCajero;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSocursal() {
		return socursal;
	}

	public void setSocursal(String socursal) {
		this.socursal = socursal;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", usuario=" + usuario + ", saldo=" + saldo
				+ ", socursal=" + socursal + ", idCajero=" + idCajero + "]";
	}
	
	

}
