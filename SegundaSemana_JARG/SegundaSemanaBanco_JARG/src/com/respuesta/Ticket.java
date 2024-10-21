package com.respuesta;

import java.util.Date;

public class Ticket {
	
	//El proposito de esta clas es responder
	//si las operaciones se realizaron con exito
	//o no
	
	private int folio;
	private Date fehaHora;
	private String usuario;
	private double saldo;
	private String sucursal;
	private int IdCajero;
	
	public Ticket() {}

	public Ticket(int folio, Date fehaHora, String usuario, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fehaHora = fehaHora;
		this.usuario = usuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		IdCajero = idCajero;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFehaHora() {
		return fehaHora;
	}

	public void setFehaHora(Date fehaHora) {
		this.fehaHora = fehaHora;
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

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdCajero() {
		return IdCajero;
	}

	public void setIdCajero(int idCajero) {
		IdCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fehaHora=" + fehaHora + ", usuario=" + usuario + ", saldo=" + saldo
				+ ", sucursal=" + sucursal + ", IdCajero=" + IdCajero + "]";
	}
	
	

}
