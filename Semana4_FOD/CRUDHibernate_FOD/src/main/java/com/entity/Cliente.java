package com.entity;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//import com.dto.AsuntoClienteDTO;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName = "SEQ_CLIENTE", allocationSize = 1)
	@Column(name = "ID_CLIENTE", columnDefinition = "NUMBER")
	private int clienteId;
	
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(50)")
	String nombre;
	@Column(name = "DIRECCION", columnDefinition = "NVARCHAR2(100)")
	String direccion;
	@Column(name = "TELEFONO", columnDefinition = "NVARCHAR2(10)")
	String telefono;
	
	//si quiero visualizar el asunto que tienen el cliente, aunque originalmente
	//no esta en la tabla lo podemos agregar mediante una relacion ya sea OnetoMany o ONEToOne
	
	//@OneToOne(mappedBy = "cliente")
	//private AsuntoClienteDTO asunto;
	
	
	//en caso de tenr mas de un asunto de un cliente, tendriamos que recibir una lista de OneToMany
	//de un cliente que tenga muchos asuntos 
	//@OneToMany(mappedBy = "cliente")
	//private List<AsuntoClienteDTO> asunto;
	
	public Cliente() {
		
	}

	public Cliente(int id) {
		
		this.clienteId = id;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
/*
	public Asunto getAsunto() {
		return asunto;
	}

	public void setAsunto(Asunto asunto) {
		this.asunto = asunto;
	}*/

	/*public List<AsuntoClienteDTO> getAsunto() {
		return asunto;
	}

	public void setAsunto(List<AsuntoClienteDTO> asunto) {
		this.asunto = asunto;
	}*/

	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}

	//agragra lor tostring correspondientes
	
	
	

}
