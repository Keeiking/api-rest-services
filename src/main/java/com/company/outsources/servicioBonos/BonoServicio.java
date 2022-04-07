package com.company.outsources.servicioBonos;
//manipuladora de los mensajes
//describe el contrato que debe tener la administracion de mensajes

import com.company.outsources.modelo.Bono;
import javax.ws.rs.core.Response;

//manejo de uris
import javax.ws.rs.Path;// me permite poner los endpoint
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;


@Path("/serviciosbono")
public interface BonoServicio {
	
	
	@Path("/bonos")
	@GET 
	List<Bono> getBonos();//cada vez que llegen a está uri con el metodo GET se ejecuta esté metodo
	
	@Path("/bonos/{idBono}")
	@GET
	Bono getBono(@PathParam("idBono") Long idBono);
	
	@Path("/bonos")
	@POST
	Response crearBono(Bono bono);
	
	@Path("/bonos/{idBono}")
	@PUT
	Response actualizarBono(Bono bono);
	

	@Path("/bonos/{idBono}")
	@DELETE
	List<Bono> eliminarBono(@PathParam("idBono") Long idBono);

}