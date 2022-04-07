package com.company.outsources.modelo;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Pedido")
public class Pedido {

	private long id_pedido;
	private long id_producto;
	private String nombre_producto;
	private long cantidad;
	private String proveedor;
	
	public long getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(long id_pedido) {
		this.id_pedido = id_pedido;
	}
	public long getId_producto() {
		return id_producto;
	}
	public void setId_producto(long id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	

}
