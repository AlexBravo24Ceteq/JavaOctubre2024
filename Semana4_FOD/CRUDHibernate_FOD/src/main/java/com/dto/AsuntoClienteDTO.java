package com.dto;
import javax.persistence.*;

import com.entity.Cliente;

import java.util.Date;

@Entity
@Table(name = "ASUNTO")

public class AsuntoClienteDTO {

    @Id
   
    @Column(name = "ID_ASUNTO", columnDefinition = "NUMBER")
    private int asuntoId;

    @Column(name = "ESTADO", columnDefinition = "NVARCHAR2(50)")
    private String estado;

    @Column(name = "FECHA_INICIO", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "FECHA_FINALIZADA", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date fechaFinalizada;
    
    //hacemos un join para poder la info del cliente a traves del Id
    //y bolvemos a establecer la relacion que existe entre estas dos entidades
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE", nullable = false)
    private Cliente cliente;

    // Constructor vacío necesario para JPA
    public AsuntoClienteDTO() {
    }

    // Constructor completo
    public AsuntoClienteDTO(int asuntoId, String estado, Date fechaInicio, Date fechaFinalizada, Cliente cliente) {
        this.asuntoId = asuntoId;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizada = fechaFinalizada;
        this.cliente = cliente;
    }

    public int getAsuntoId() {
		return asuntoId;
	}

	public void setAsuntoId(int asuntoId) {
		this.asuntoId = asuntoId;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "AsuntoClienteDTO [asuntoId=" + asuntoId + ", estado=" + estado + ", fechaInicio=" + fechaInicio
				+ ", fechaFinalizada=" + fechaFinalizada + ", cliente=" + cliente + "]";
	}

	
}
