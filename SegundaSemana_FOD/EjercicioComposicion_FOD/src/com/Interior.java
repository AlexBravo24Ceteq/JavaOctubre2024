package com;

public class Interior {
	private String tipAsientos;
	private String tipoAlfombra;
	private boolean vidriosElect;
	private boolean camaraRetrovisor;
	
	public Interior() {
		super();
	}

	public Interior(String tipAsientos, String tipoAlfombra, boolean vidriosElect, boolean camaraRetrovisor) {
		super();
		this.tipAsientos = tipAsientos;
		this.tipoAlfombra = tipoAlfombra;
		this.vidriosElect = vidriosElect;
		this.camaraRetrovisor = camaraRetrovisor;
	}

	public String getTipAsientos() {
		return tipAsientos;
	}

	public void setTipAsientos(String tipAsientos) {
		this.tipAsientos = tipAsientos;
	}

	public String getTipoAlfombra() {
		return tipoAlfombra;
	}

	public void setTipoAlfombra(String tipoAlfombra) {
		this.tipoAlfombra = tipoAlfombra;
	}

	public boolean isVidriosElect() {
		return vidriosElect;
	}

	public void setVidriosElect(boolean vidriosElect) {
		this.vidriosElect = vidriosElect;
	}

	public boolean isCamaraRetrovisor() {
		return camaraRetrovisor;
	}

	public void setCamaraRetrovisor(boolean camaraRetrovisor) {
		this.camaraRetrovisor = camaraRetrovisor;
	}

	@Override
	public String toString() {
		return "Interior [tipAsientos=" + tipAsientos + ", tipoAlfombra=" + tipoAlfombra + ", vidriosElect="
				+ vidriosElect + ", camaraRetrovisor=" + camaraRetrovisor + "]";
	}

	
	
	
}
