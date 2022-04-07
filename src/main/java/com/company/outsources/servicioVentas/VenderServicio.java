package com.company.outsources.servicioVentas;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.company.outsources.modelo.Factura;

@Path("/ServicioVender")
public interface VenderServicio {
	
	//obtener ventas
	@Path("/venderproductos")
	@GET 
	List<Factura> getVentas();//cada vez que llegen a está uri con el metodo GET se ejecuta esté metodo
	
	//registrar venta
	@Path("/venderproductos")
	@POST
	Response crearVenta(Factura factura);
}
