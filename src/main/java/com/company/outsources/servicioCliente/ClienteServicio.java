//Cabeza
//Maneja la logica de procesamiento de los mensajes
package com.company.outsources.servicioCliente;
//manipuladora de los mensajes
//describe el contrato que debe tener la administracion de mensajes

import com.company.outsources.modelo.Cliente;
import javax.ws.rs.core.Response;

//manejo de uris
import javax.ws.rs.Path;// me permite poner los endpoint


import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;


@Path("/servicioscliente")
public interface ClienteServicio {

	@Path("/clientes")
	@GET
	List<Cliente> getClientes();//cada vez que llegen a está uri con el metodo GET se ejecuta esté metodo
	
	@Path("/clientes/{id}")
	@GET
	Cliente getCliente(@PathParam("id") Long id);
	
	
	@Path("/clientes")
	@POST
	Response crearCliente(Cliente cliente);
	
	@Path("/clientes/{id}")
	@PUT
	Response actualizarCliente(Cliente cliente);
	
	/*
	//@RequestMapping(value = "/clientes/{id}", method = RequestMethod.DELETE)
	@Path("/clientes/{id}")
	@DELETE
	Cliente eliminarCliente(@PathParam("id") Long id);
	*/
	@Path("/clientes/{id}")
	@DELETE
	List<Cliente> eliminarCliente(@PathParam("id") Long id);
}

