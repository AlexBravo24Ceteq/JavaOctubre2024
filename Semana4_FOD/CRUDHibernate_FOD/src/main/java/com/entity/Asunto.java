package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name = "ASUNTO")
//para evitar que se cicle la informacion de los clientes y asuntos 
//vamos  aa gregra la siguiente anotacion para tener una especie de serializacion 
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idAsunto")
public class Asunto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asunto_seq")
	@SequenceGenerator(name = "asunto_seq", sequenceName = "SEQ_ASUNTO", allocationSize = 8)
	@Column(name = "ID_ASUNTO", columnDefinition = "NUMBER")
	private int idAsunto;
	
	@Column(name = "ESTADO", columnDefinition = "NVARCHAR2(50)")
	private String estado;
	
	@Column(name = "FECHA_INICIO", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
	private Date fechaInicio;
	
	@Column(name = "FECHA_FINALIZADA", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
	private Date fechaFinalizada;
	
	@Column(name = "ID_CLIENTE", columnDefinition = "NUMBER")
	private int idCliente;
	
	//establrcemos una trelaciona manyToOne para completar la cardinalidad de muchos asuntos para un solo cliente
	//@ManyToOne

	public Asunto() {
		super();
	}
	

	public Asunto(int idAsunto, String estado, Date fechaInicio, Date fechaFinalizada, int idCliente) {
		super();
		this.idAsunto = idAsunto;
		this.estado = estado;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizada = fechaFinalizada;
		this.idCliente = idCliente;
	}


	public int getIdAsunto() {
		return idAsunto;
	}

	public void setIdAsunto(int idAsunto) {
		this.idAsunto = idAsunto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinalizada() {
		return fechaFinalizada;
	}

	public void setFechaFinalizada(Date fechaFinalizada) {
		this.fechaFinalizada = fechaFinalizada;
	}

	
	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	
	@Override
	public String toString() {
		return "Asunto [idAsunto=" + idAsunto + ", estado=" + estado + ", fechaInicio=" + fechaInicio
				+ ", fechaFinalizada=" + fechaFinalizada + ", cliente="  + idCliente + "]";
	}
	
	

}
