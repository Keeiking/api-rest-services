package com.company.outsources.servicioPedidos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.company.outsources.modelo.Pedido;


@Service
public class PedidoServicioImp implements PedidoServicio {
	//Hash Table
	Map<Long,Pedido> pedidos = new HashMap<Long,com.company.outsources.modelo.Pedido>();
	long id_pedido1 =121;
	long id_produ1 = 1;
	String producto1 = "Madero";
	long cant1 = 500;
	String proveedor1 = "Flip";
	
	
	public PedidoServicioImp() {
		init();
	}


	private void init() {
		// TODO Auto-generated method stub
		Pedido pedido1 = new Pedido();
		pedido1.setId_pedido(id_pedido1);
		pedido1.setId_pedido(id_produ1);
		pedido1.setNombre_producto(producto1);
		pedido1.setCantidad(cant1);
		pedido1.setProveedor(proveedor1);
		pedidos.put(pedido1.getId_pedido(), pedido1);
	}
	

	public List<Pedido> getPedidos() {
		
		Collection<Pedido> result = pedidos.values();
		List<Pedido> respuesta = new ArrayList<>(result);
		return respuesta;
	}
	
	@Override
	public Pedido getPedido(Long id) {
		Pedido var;
		var = pedidos.get(id_pedido1);
		System.out.println("GEEET " + var);
		return pedidos.get(id);
	}
	
	@Override
	public Response crearPedido(Pedido pedido) {
		pedido.setId_pedido(id_pedido1);
		pedidos.put(pedido.getId_pedido(), pedido);
		return Response.ok(pedido).build();
	}
	
	@Override
	public Response actualizarPedido(Pedido pedido) {
		Pedido pedidoActual = pedidos.get(pedido.getId_pedido());
		Response respuesta;
		
		if(pedidoActual != null) {
			pedidos.put(pedido.getId_pedido(), pedido);
			
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}

	@Override
	public Response eliminarpedido(Long id_pedido) {
		Response respuesta;
		
		if(id_pedido != null) {
			pedidos.remove(id_pedido);
			
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.noContent().build();
		}
		return respuesta;
	}

	


}
