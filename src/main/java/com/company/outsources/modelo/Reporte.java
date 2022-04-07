package com.company.outsources.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Reporte")
public class Reporte {
	
	private Long idReporte;
	private Long idSolicitante;
	private String tipoReporte;
	private String descripcion;
	private long id_fact;
	private String estado;
	
	public Long getIdReporte() {
		return idReporte;
	}
	public void setIdReporte(Long idReporte) {
		this.idReporte = idReporte;
	}
	
	public Long getIdSolicitante() {
		return idSolicitante;
	}
	public void setIdSolicitante(Long idSolicitante) {
		this.idSolicitante = idSolicitante;
	}
		
	public String getTipoReporte() {
		return tipoReporte;
	}
	public void setTipoReporte(String tipoReporte) {
		this.tipoReporte = tipoReporte;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public long getId_fact() {
		return id_fact;
	}
	public void setId_fact(long id_fact) {
		this.id_fact = id_fact;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}


}
