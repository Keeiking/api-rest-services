package com.company.outsources.servicioFacturas;

import com.company.outsources.modelo.Factura;
import javax.ws.rs.core.Response;

//manejo de uris
import javax.ws.rs.Path;// me permite poner los endpoint

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

@Path("/serviciosfactura")
public interface FacturaServicio {
	
	@Path("/facturas")
	@GET
	List<Factura> getFacturas();//cada vez que llegen a está uri con el metodo GET se ejecuta esté metodo
	
	@Path("/facturas/{id_fac}")
	@GET
	Factura getFactura(@PathParam("id_fac") Long id_c);
	
	
	@Path("/facturas")
	@POST
	Response crearFactura(Factura factura);
	
	@Path("/facturas/{id_fac}")
	@PUT
	Response actualizarFactura(Factura factura);
	
	/*
	//@RequestMapping(value = "/facturas/{id_fac}", method = RequestMethod.DELETE)
	@Path("/facturas/{id_fac}")
	@DELETE
	Cliente eliminarCliente(@PathParam("id") Long id);
	*/
	@Path("/facturas/{id_fac}")
	@DELETE
	List<Factura> eliminarFactura(@PathParam("id_fac") Long id_fac);
}
