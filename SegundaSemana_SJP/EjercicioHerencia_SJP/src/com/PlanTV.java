package com;

public class PlanTV {
	
	private String usuario;
	private String plan;
	private int dispositivos;
	
	public PlanTV() {}
	
	public PlanTV(String usuario, String plan, int dispositivos) {
		super();
		this.usuario = usuario;
		this.plan = plan;
		this.dispositivos = dispositivos;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public int getDispositivos() {
		return dispositivos;
	}
	public void setDispositivos(int dispositivos) {
		this.dispositivos = dispositivos;
	}
	
	@Override
	public String toString() {
		return "PlanTV [usuario=" + usuario + ", plan=" + plan + ", dispositivos=" + dispositivos + "]";
	}
	
}
