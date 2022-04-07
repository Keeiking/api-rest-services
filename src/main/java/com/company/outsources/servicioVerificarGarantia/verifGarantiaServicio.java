package com.company.outsources.servicioVerificarGarantia;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/serviciogarantia")
public interface verifGarantiaServicio {
	@Path("/garantias/{referencia}")
	@GET
	long getGarantia(@PathParam("referencia") Long referencia);
}
