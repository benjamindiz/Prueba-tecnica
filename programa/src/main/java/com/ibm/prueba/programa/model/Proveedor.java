package com.ibm.prueba.programa.model;

import java.util.Date;

public class Proveedor {

	private Long idProveedor;
	private String nombre;
	private Date fechaDeAlta;
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
