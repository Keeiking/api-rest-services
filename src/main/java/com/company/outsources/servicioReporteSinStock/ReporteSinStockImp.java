package com.company.outsources.servicioReporteSinStock;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.company.outsources.modelo.Reporte;
import com.company.outsources.modelo.Stock;
import com.company.outsources.servicioReporte.ReporteServicioImp;
import com.company.outsources.servicioStocks.StockServicioImp;


@Service
public class ReporteSinStockImp implements ReporteSinStockMicroservicio {
	
	Map<Long, Reporte> reportes = new HashMap<Long,Reporte>();

	StockServicioImp stockImp= new StockServicioImp(); 
	Stock stock = new Stock();
	ReporteServicioImp reporteimp= new ReporteServicioImp();
	Reporte reporte = new Reporte();
	
	long idAct =12;
	long id=123;
	
	public ReporteSinStockImp() {
		init();
	}
	
	void init() {
		Reporte reporte = new Reporte();
		reporte.setIdReporte(idAct);
		reporte.setTipoReporte("Producto sin stock");
		reporte.setDescripcion("El producto 020 se ha quedado sin stock"); 
		reportes.put(reporte.getIdReporte(), reporte);
	}
	


	@Override
	public Response crearReporteProducto(Reporte reporte) {
		stock = stockImp.getStock(id);
		String nombrepStock = stock.getNombre_produ();
		reporte.setIdReporte(++idAct);
		reporte.setTipoReporte("Producto sin Stock");
		reporte.setDescripcion("el producto"+ nombrepStock +"Se ha quedado sin stock");
		reportes.put(reporte.getIdReporte(),reporte);
		return Response.ok(reporte).build();
	}

}
