package com.company.outsources.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Cliente")
//Xml... esta tageando la clase Cliente como un objeto de tipo root
// el objeto root va a pasar entre llamaas
//entre metodos para acceder la informacion
public class Cliente {
	private Long id;
	private String nombre;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
