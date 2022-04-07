package com.company.outsources.servicioProvedores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.company.outsources.modelo.Proveedor;
import javax.ws.rs.core.Response;//libreria de respuestas


@Service
public class ProveedorServicioImp implements ProveedorServicio{

	//Hash Table
	Map<Long,Proveedor> proveedores = new HashMap<Long,Proveedor>();
	long idAct =123;
	long tele=31241;
	
	//contructor
	public ProveedorServicioImp() {
		init();//init para crear el cliente por primera vez
	}
	
	void init() {
		Proveedor proveedor = new Proveedor();
		proveedor.setIdpr(idAct);
		proveedor.setNombre("Sara");
		proveedor.setDes_pro("papas");
		proveedor.setTelf(tele);
		proveedores.put(proveedor.getIdpr(), proveedor);//clientes para manejar put OJO		
	}
	
	@Override
	public List<Proveedor> getProveedores() {
		// TODO Auto-generated method stub
		Collection<Proveedor> result = proveedores.values();
		List<Proveedor> respuesta = new ArrayList<>(result);
		return respuesta;
	}
	
	@Override
	public Proveedor getProveedor(Long idpr) {
		return proveedores.get(idpr);
	}

	@Override
	public Response crearProveedor(Proveedor proveedor) {
		proveedor.setIdpr(++idAct);
		proveedores.put(proveedor.getIdpr(), proveedor);
		return Response.ok(proveedor).build();
	}
	
	@Override
	public Response actualizarProveedor(Proveedor proveedor) {
		Proveedor proveedorActual = proveedores.get(proveedor.getIdpr());
		Response respuesta;
		
		if(proveedorActual != null) {
			proveedores.put(proveedor.getIdpr(), proveedor);
			
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
		public Response eliminarProveedor(Long id) {
			Response respuesta;
			if(id != null) {
				proveedores.remove(id);
				respuesta = Response.ok().build();
			}else {
				respuesta = Response.noContent().build();
			}
			return respuesta;		
		}

}
