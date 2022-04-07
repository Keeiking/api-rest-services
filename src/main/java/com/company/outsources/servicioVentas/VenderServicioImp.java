/**
 * 
 */
package com.company.outsources.servicioVentas;

import com.company.outsources.modelo.Factura;
import com.company.outsources.modelo.Cliente;
import com.company.outsources.servicioCliente.ClienteServicio;
import com.company.outsources.servicioCliente.ClienteServicioImp;
import com.company.outsources.servicioFacturas.FacturaServicioImp;

/**
 * @author Lenovo
 *
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

@Service
public class VenderServicioImp implements VenderServicio{

	
	ClienteServicioImp cliente =  new ClienteServicioImp();
	FacturaServicioImp factura =  new FacturaServicioImp();
	
	Map<Long,Cliente> clientes = new HashMap<Long,Cliente>();
	Map<Long,Factura> facturas = new HashMap<Long,Factura>();
	
	//verificar disponibilidad
	//buscar si el cliente existe
	//crear factura
	//actualizar stock
	/**
	 * 
	 */
	public VenderServicioImp() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public List<Factura> getVentas() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Response crearVenta(Factura factura) {
		
		// TODO Auto-generated method stub
		//verificamos disponibilidad
		//buscamos el cliente
		cliente.getCliente(Long.parseLong("123"));
		
		//factura
		return null;
	}

}
