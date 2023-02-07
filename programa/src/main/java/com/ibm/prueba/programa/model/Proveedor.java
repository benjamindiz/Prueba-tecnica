package com.ibm.prueba.programa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_proveedor")
	private Long idProveedor;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="fecha_de_alta")
	private Date fechaDeAlta;
	
	@Column(name="id_cliente")
	private Long idCliente;
	
	
	public Long getIdProveedor() {
		return idProveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	
}
