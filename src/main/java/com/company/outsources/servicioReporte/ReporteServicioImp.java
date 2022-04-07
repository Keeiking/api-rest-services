package com.company.outsources.servicioReporte;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;


import com.company.outsources.modelo.Reporte;

@Service
public class ReporteServicioImp implements ReporteServicio {

	//Hash Table
	public Map<Long,Reporte> reportes = new HashMap<Long,Reporte>();
	long idAct =123;
	long idAct2=234;
	
	//contructor
	public ReporteServicioImp() {
		init();//init para crear el bono por primera vez
	}

	
	void init() {
		Reporte reporte = new Reporte();
		reporte.setIdReporte(idAct);
		reporte.setIdSolicitante(idAct2);
		reporte.setTipoReporte("Garantia");
		reporte.setDescripcion("Las ruedas se despegaron");
		reporte.setId_fact(idAct);
		reporte.setEstado("2");
		reportes.put(reporte.getIdReporte(), reporte);
	}

	@Override
	public List<Reporte> getReportes() {
		// TODO Auto-generated method stub
		Collection<Reporte> result = reportes.values();
		List<Reporte> respuesta = new ArrayList<>(result);
		return respuesta;
	}
	
	@Override
	public Reporte getReporte(Long idReporte) {
		return reportes.get(idReporte);
	}
	
	
	@Override
	public Response crearReporte(Reporte reporte) {
		reporte.setIdReporte(++idAct);
		reportes.put(reporte.getIdReporte(), reporte);
		return Response.ok(reporte).build();
	}

	@Override
	public Response actualizarReporte(Reporte reporte) {
		Reporte reporteActual = reportes.get(reporte.getIdReporte());
		Response respuesta;
		
		if(reporteActual != null) {
			reportes.put(reporte.getIdReporte(), reporte);
			
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	
	}
/*
 * bonos.remove(id);
		return Response.ok(bono).build();
 */
	@Override
	public List<Reporte> eliminarReporte(Long idReporte) {
		reportes.remove(idReporte);
		Collection<Reporte> result = reportes.values();
		List<Reporte> respuesta = new ArrayList<>(result);
		return respuesta;
		
	
	}

}