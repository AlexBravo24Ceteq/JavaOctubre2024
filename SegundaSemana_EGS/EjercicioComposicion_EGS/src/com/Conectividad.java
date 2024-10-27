package com;

public class Conectividad {
	
	private int tipoWifi;
	private String video;
	private boolean BT;
	
	public Conectividad() {
		// TODO Auto-generated constructor stub
	}

	public Conectividad(int wifi, String video, boolean bT) {
		super();
		this.tipoWifi = wifi;
		this.video = video;
		BT = bT;
	}

	public double getWifi() {
		return tipoWifi;
	}

	public void setWifi(int wifi) {
		this.tipoWifi = wifi;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public boolean isBT() {
		return BT;
	}

	public void setBT(boolean bT) {
		BT = bT;
	}

	@Override
	public String toString() {
		return "Conectividad [tipoWifi=" + tipoWifi + ", video=" + video + ", BT=" + BT + "]";
	}
	
	
	

}
