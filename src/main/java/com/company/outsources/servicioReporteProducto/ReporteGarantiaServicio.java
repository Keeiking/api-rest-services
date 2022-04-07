package com.company.outsources.servicioReporteProducto;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.company.outsources.modelo.Cliente;
import com.company.outsources.modelo.Reporte;

@Path("/serviciosReporteGarantias")
public interface ReporteGarantiaServicio {
		
	@Path("/reportegarantias")
	@POST
	Response crearReporteGarantia(Reporte reporte);
}
