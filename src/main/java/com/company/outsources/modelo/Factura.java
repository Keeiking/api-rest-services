package com.company.outsources.modelo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name="Factura")

public class Factura {
	private Long id_fac;//id factura
	private Long id_c;// id cliente
	private Long cod;// codigo producto
	private Long cant;// cantidad
	private Date fecha;
	
	
	public Long getId_fac() {
		return id_fac;
	}
	public void setId_fac(Long id_fac) {
		this.id_fac = id_fac;
	}
	public Long getId_c() {
		return id_c;
	}
	public void setId_c(Long id_c) {
		this.id_c = id_c;
	}
	public Long getCod() {
		return cod;
	}
	public void setCod(Long cod) {
		this.cod = cod;
	}
	public Long getCant() {
		return cant;
	}
	public void setCant(Long cant) {
		this.cant = cant;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
