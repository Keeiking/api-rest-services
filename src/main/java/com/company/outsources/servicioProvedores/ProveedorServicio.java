package com.company.outsources.servicioProvedores;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


import com.company.outsources.modelo.Proveedor;

@Path("/serviciosproveedor")
public interface ProveedorServicio {

	
	@Path("/proveedor")
	@GET
	List<Proveedor> getProveedores();//cada vez que llegen a está uri con el metodo GET se ejecuta esté metodo	
	
	@Path("/proveedor/{idpr}")
	@GET
	Proveedor getProveedor(@PathParam("idpr") Long idpr);
	
	@Path("/proveedor")
	@POST
	Response crearProveedor(Proveedor proveedor);
	
	@Path("/productos/{idpr}")
	@PUT
	Response actualizarProveedor(Proveedor proveedor);
	
	/*
	//@RequestMapping(value = "/productos/{referencia}", method = RequestMethod.DELETE)
	@Path("/productos/{referencia}")
	@DELETE
	Producto eliminarProducto(@PathParam("referencia") Long referencia);
	*/
	@Path("/proveedor/{idpr}")
	@DELETE
	Response eliminarProveedor(@PathParam("idpr") Long idpr);

	

	
}
