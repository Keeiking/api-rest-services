package com.company.outsources.servicioReporteProducto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.company.outsources.modelo.Producto;
import com.company.outsources.modelo.Reporte;
import com.company.outsources.servicioProductos.ProductoServicioImp;
import com.company.outsources.servicioReporte.ReporteServicioImp;
import com.company.outsources.servicioVerificarGarantia.verifGarantiaServicioImp;

@Service
public class ReporteGarantiaServicioImp implements ReporteGarantiaServicio {
	
	long id_fact = 123;  
	long idAct = 1;
	Map<Long,Reporte> reportes = new HashMap<Long,Reporte>();
		
	verifGarantiaServicioImp verifGartimp =  new verifGarantiaServicioImp();
	ReporteServicioImp reportImp =  new ReporteServicioImp();
	//Reporte report =  new Reporte();
	
	public ReporteGarantiaServicioImp() {
		// TODO Auto-generated constructor stub
		//reportImp.getReportes();
		init();
	}

	void init() {
		Reporte reporte = new Reporte();
	    reportes.put(reporte.getIdReporte(), reporte);
	}

	
	@Override
	public Response crearReporteGarantia(Reporte rep) {
		
		// TODO Auto-generated method stub
		//Factura
		//long id_fact = report.getId_fact();
		// verificamos si tiene garantia o no 
		long diasGarantia = verifGartimp.getGarantia(id_fact);
		rep.setIdReporte(++idAct);
		rep.setId_fact(id_fact);
		rep.setTipoReporte("Garantia");
		rep.setEstado(Integer.toString((int) diasGarantia));
		reportes.put(rep.getIdReporte(), rep);
		return Response.ok(rep).build();
	}
	
	

}
