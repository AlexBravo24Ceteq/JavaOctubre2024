package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ASUNTOS")
public class Asuntos {

	public Asuntos() {}
	public Asuntos(int id) {
		this.asuntosId = id;
		}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="ASUNTOS_SEQ")
	@Column(name="ASUNTOS_ID", columnDefinition="NUMBER")
	int asuntosId;

	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(50)")
	String nombre;
	@Column(name="FECHAINICIO", columnDefinition="DATE")
	String fechainicio;
	@Column(name="FECHAFIN", columnDefinition="DATE")
	String fechafin;
	@Column(name="ESTADO", columnDefinition="NVARCHAR2(50)")
	String estado;
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	int clienteId;
	public int getAsuntosId() {
		return asuntosId;
	}
	public void setAsuntosId(int asuntosId) {
		this.asuntosId = asuntosId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(String fechainicio) {
		this.fechainicio = fechainicio;
	}
	public String getFechafin() {
		return fechafin;
	}
	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	@Override
	public String toString() {
		return "Asuntos [asuntosId=" + asuntosId + ", nombre=" + nombre + ", fechainicio=" + fechainicio + ", fechafin="
				+ fechafin + ", estado=" + estado + ", clienteId=" + clienteId + "]";
	}
	
	//GETTERS & SETTERS
	
	
	
}//end
