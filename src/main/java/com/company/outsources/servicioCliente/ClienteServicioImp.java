//logica de mensajeria    LOGICA CORE
//logica core del servicio
package com.company.outsources.servicioCliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;//anotacion

import com.company.outsources.modelo.Cliente;
import javax.ws.rs.core.Response;//libreria de respuestas

@Service
public class ClienteServicioImp implements ClienteServicio {
	
	//Hash Table
	Map<Long,Cliente> clientes = new HashMap<Long,Cliente>();
	long idAct =123;
	
	//contructor
	public ClienteServicioImp() {
		init();//init para crear el cliente por primera vez
	}
	
	void init() {
		Cliente cliente = new Cliente();
		cliente.setId(idAct);
		cliente.setNombre("Sara");
		clientes.put(cliente.getId(), cliente);//clientes para manejar put OJO		
	}

	@Override
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		Collection<Cliente> result = clientes.values();
		List<Cliente> respuesta = new ArrayList<>(result);
		return respuesta;
	}
	
	@Override
	public Cliente getCliente(Long id) {
		return clientes.get(id);
	}

	@Override
	public Response crearCliente(Cliente cliente) {
		cliente.setId(++idAct);
		clientes.put(cliente.getId(), cliente);
		return Response.ok(cliente).build();
	}

	@Override
	public Response actualizarCliente(Cliente cliente) {
		Cliente clienteActual = clientes.get(cliente.getId());
		Response respuesta;
		
		if(clienteActual != null) {
			clientes.put(cliente.getId(), cliente);
			
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
		/*clientes.put(cliente.getId(), cliente);
		 * return null;
		 * */
	}
/*
 * clientes.remove(id);
		return Response.ok(cliente).build();
 */
	@Override
	public List<Cliente> eliminarCliente(Long id) {
		clientes.remove(id);
		Collection<Cliente> result = clientes.values();
		List<Cliente> respuesta = new ArrayList<>(result);
		return respuesta;
		
	}
	
	
}
