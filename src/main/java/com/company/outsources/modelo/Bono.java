package com.company.outsources.modelo;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Bono")

public class Bono {
	
	private Long idBono;
	private String valorBono;
	
	public Long getIdBono() {
		return idBono;
	}
	public void setIdBono(Long idBono) {
		this.idBono = idBono;
	}
	public String getValor() {
		return valorBono;
	}
	public void setValor(String valorBono) {
		this.valorBono = valorBono;
	}

}
