package com.company.outsources.servicioFacturas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.company.outsources.modelo.Factura;
@Service
public class FacturaServicioImp implements FacturaServicio {

	//Hash Table
	Map<Long,Factura> facturas = new HashMap<Long,Factura>();
	long idfac = 123;
	long cod = 123;
	long cant = 5;
	Date fecha = new Date();
	SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
	
	//contructor
	public FacturaServicioImp() {
		init();//init para crear el cliente por primera vez
	}
	
	void init() {
		Factura factura = new Factura();
		factura.setId_fac(idfac);
		factura.setId_c(idfac) ;
		factura.setCod(cod);
		factura.setCant(cant);
		factura.setFecha(fecha);
		System.out.print(factura.getId_fac());
		System.out.print("nooooooooooooooooo");
		facturas.put(factura.getId_fac(), factura);//clientes para manejar put OJO		
	}
	
	@Override
	public List<Factura> getFacturas() {
		// TODO Auto-generated method stub
		System.out.print("oooooooooooooooooooooooooooooooo");
		Collection<Factura> result = facturas.values();
		List<Factura> respuesta = new ArrayList<>(result);
		return respuesta;
	}

	@Override
	public Factura getFactura(Long id_fac) {
		return facturas.get(id_fac);
	}

	@Override
	public Response crearFactura(Factura factura) {
		factura.setId_fac(++idfac);
		facturas.put(factura.getId_fac(), factura);
		return Response.ok(factura).build();
	}

	@Override
	public Response actualizarFactura(Factura factura) {
		Factura facturaActual = facturas.get(factura.getId_fac());
		Response respuesta;
		
		if(facturaActual != null) {
			facturas.put(factura.getId_fac(), factura);
			
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}

	@Override
	public List<Factura> eliminarFactura(Long id_fac) {
		facturas.remove(id_fac);
		Collection<Factura> result = facturas.values();
		List<Factura> respuesta = new ArrayList<>(result);
		return respuesta;
	}

}
