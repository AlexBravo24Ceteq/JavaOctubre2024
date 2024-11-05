package com.general;

public class Status {

	private Object ob;
	private String mensage;
	private String respuesta;
	
	public Status () {}

	public Status(Object ob, String mensage, String respuesta) {
		super();
		this.ob = ob;
		this.mensage = mensage;
		this.respuesta = respuesta;
	}

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "Status [ob=" + ob + ", mensage=" + mensage + ", respuesta=" + respuesta + "]";
	}
}
