package com.company.outsources.servicioVerificarGarantia;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.company.outsources.modelo.Factura;
import com.company.outsources.modelo.Producto;
import com.company.outsources.servicioCliente.ClienteServicioImp;
import com.company.outsources.servicioFacturas.FacturaServicioImp;
import com.company.outsources.servicioProductos.ProductoServicioImp;

@Service
public class verifGarantiaServicioImp implements verifGarantiaServicio {
	
	ProductoServicioImp productoimp =  new ProductoServicioImp();
	Producto producto =  new Producto();
	
	FacturaServicioImp facturaimp =  new FacturaServicioImp();
	Factura factura =  new Factura();
	
	Date fecha = new Date();
	
	@Override
	public long getGarantia(Long id_f) {
		//obtenemos la factura
		factura = facturaimp.getFactura(id_f);
		//obtenemos la referencia del producto
		Date fecha_f = factura.getFecha();
		String example = "Tue Apr 30 23:13:51 COT 2021";
		
		long id_p = factura.getCod(); 
		System.out.print("codigo producto");
		System.out.print(fecha_f);
		//obtenemos el producto
		producto = productoimp.getProducto(id_p);
		//obtenemos la garantia que tiene ese producto
		long garant = producto.getGarantia();
		// comparamos la fecha de hoy con la fecha de la factura
		// verificamos este entre < dias menores o iguales a garantia de producto
		if(fecha.compareTo(fecha_f) <= garant) {
			garant = fecha.compareTo(fecha_f);
			
		}else {
			garant = fecha.compareTo(fecha_f);;
		}

		return garant;
	}

	
}
