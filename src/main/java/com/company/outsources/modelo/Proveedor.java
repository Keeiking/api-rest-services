package com.company.outsources.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Proveedor")
public class Proveedor {
	private Long idpr;
	private String Nombre;
	private String des_pro;
	private Long telf;
	
	public Long getIdpr() {
		return idpr;
	}
	public void setIdpr(Long idpr) {
		this.idpr = idpr;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDes_pro() {
		return des_pro;
	}
	public void setDes_pro(String des_pro) {
		this.des_pro = des_pro;
	}
	public Long getTelf() {
		return telf;
	}
	public void setTelf(Long telf) {
		this.telf = telf;
	}
	

}
