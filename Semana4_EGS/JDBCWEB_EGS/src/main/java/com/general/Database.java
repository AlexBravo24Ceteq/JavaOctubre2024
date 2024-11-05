package com.general;

public class Database {

	// Esta va ser una clase donde encapsularemos la informacion de acceso a base de
	// datos
	// para poderla recuperar a traves de un objeto

	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String usuario = "Erraick";
	private String password = "admin";

	// Creamos un constructor "mixto" porque me va permitir crear mi objeto Database
	// "vacio"
	// pero que en realidad tiebne acceso a la info guardada aqui para poder
	// recuperarla
	public Database() {
		super();
		this.driver = driver;
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Database [driver=" + driver + ", url=" + url + ", usuario=" + usuario + ", password=" + password + "]";
	}
	
	

}
