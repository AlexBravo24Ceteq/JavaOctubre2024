package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ASUNTOS")
public class Asuntos {
	
	public Asuntos() {}
	public Asuntos(int id) {
		this.asuntoId = id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aid_auto")
	@SequenceGenerator (name="aid_auto", sequenceName="ASUNTOS_SEQ", allocationSize = 1)
	@Column(name = "ASUNTO_ID", columnDefinition = "NUMBER")
	int asuntoId;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(30)") 
	String nombre;
	@Column(name = "FECHA_INICIO", columnDefinition = "DATE")
	Date fechaInicio;
	@Column(name = "FECHA_FIN", columnDefinition = "DATE")
	Date fechaFin;
	@Column(name="ESTADO", columnDefinition="NVARCHAR2(12)") 
	String estado; 
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER") 
	String clienteId;
	
	
	public int getAsuntoId() {
		return asuntoId;
	}
	public void setAsuntoId(int asuntoId) {
		this.asuntoId = asuntoId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getClienteId() {
		return clienteId;
	}
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}
	
	
	@Override
	public String toString() {
		return "Asuntos [asuntoId=" + asuntoId + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", estado=" + estado + ", clienteId=" + clienteId + "]";
	} 
	
	
	
	

}
