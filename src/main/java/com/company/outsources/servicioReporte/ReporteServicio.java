package com.company.outsources.servicioReporte;

import com.company.outsources.modelo.Reporte;
import javax.ws.rs.core.Response;

//manejo de uris
import javax.ws.rs.Path;// me permite poner los endpoint
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;



@Path("/serviciosreporte")
public interface ReporteServicio {
	
	@Path("/reportes")
	@GET 
	List<Reporte> getReportes();//cada vez que llegen a está uri con el metodo GET se ejecuta esté metodo
	
	@Path("/reportes/{idReporte}")
	@GET
	Reporte getReporte(@PathParam("idReporte") Long idReporte);
	
	@Path("/reportes")
	@POST
	Response crearReporte(Reporte reporte);
	
	@Path("/reportes/{idReporte}")
	@PUT
	Response actualizarReporte(Reporte reporte);
	

	@Path("/reportes/{idReporte}")
	@DELETE
	List<Reporte> eliminarReporte(@PathParam("idReporte") Long idReporte);	
}
