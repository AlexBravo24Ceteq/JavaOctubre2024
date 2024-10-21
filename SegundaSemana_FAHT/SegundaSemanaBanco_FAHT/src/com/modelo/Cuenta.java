package com.modelo;

public class Cuenta {

	//En el paquete com.modelo
	//guardamos la informacion de los objetos o entiddes
	//a los cuales queremos acceder
	
	//En este ej necesitamos crear varias cuentas de usuarios y 
	//las agregaremos a un HashMap para simular una pequeña base de datos
	
	private String usuario;
	private double saldo;
	private double saldomin;
	private double saldomax;
	private String tipoCuenta;
	
	public Cuenta () {}

	public Cuenta(String usuario, double saldo, double saldomin, double saldomax, String tipoCuenta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldomin = saldomin;
		this.saldomax = saldomax;
		this.tipoCuenta = tipoCuenta;
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

	public double getSaldomin() {
		return saldomin;
	}

	public void setSaldomin(double saldomin) {
		this.saldomin = saldomin;
	}

	public double getSaldomax() {
		return saldomax;
	}

	public void setSaldomax(double saldomax) {
		this.saldomax = saldomax;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldomin=" + saldomin + ", saldomax=" + saldomax
				+ ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	
	
}//end
