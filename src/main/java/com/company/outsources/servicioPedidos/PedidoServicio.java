package com.company.outsources.servicioPedidos;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.company.outsources.modelo.Pedido;

@Path("/serviciospedidos")
public interface PedidoServicio {
	
	@Path("/pedidos")
	@GET 
	List<Pedido> getPedidos();
	
	@Path("/pedido/{id_pedido}")
	@GET
	Pedido getPedido(@PathParam("id_pedido1") Long id);

	@Path("/pedidos")
	@POST
	Response crearPedido(Pedido pedido);

	@Path("/pedido/{id_pedido}")
	@PUT
	Response actualizarPedido(Pedido pedido);
	
	@Path("/pedido/{id_pedido}")
	@DELETE
	Response eliminarpedido(@PathParam("id_pedido") Long id_pedido);
	
}
