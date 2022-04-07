package com.company.outsources.servicioReporteSinStock;
import com.company.outsources.modelo.Reporte;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;



@Path("/serviciosreporteproducto")
public interface ReporteSinStockMicroservicio {

	@Path("/reportesproducto")
	@POST
	Response crearReporteProducto(Reporte reporte);

}


