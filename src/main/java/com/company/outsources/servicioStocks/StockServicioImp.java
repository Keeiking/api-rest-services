package com.company.outsources.servicioStocks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.company.outsources.modelo.Stock;

@Service
public class StockServicioImp implements StockServicio {
	
	//Hash Table
	Map<Long,Stock> stocks = new HashMap<Long,Stock>();
	long id1 =121;
	long id2 =122;
	long id3 =123;
	long id4 =124;
	String name1 = "Madero1";
	String name2 = "Trucks7";
	String name3 = "Ruedas9";
	String name4 = "Rodachos4";
	long cant1 = 0;
	long cant2 = 2;
	long cant3 = 3;
	long cant4 = 4;
	
	public StockServicioImp() {
		init();
	}
	
	void init() {
		Stock stock1 = new Stock();
		stock1.setCantidad(cant1);
		stock1.setId(id1);
		stock1.setNombre_produ(name1);
		stocks.put(stock1.getId(), stock1);
		
		Stock stock2 = new Stock();
		stock2.setCantidad(cant2);
		stock2.setId(id2);
		stock2.setNombre_produ(name2);
		stocks.put(stock2.getId(), stock2);
	
		Stock stock3 = new Stock();
		stock3.setId(id3);
		stock3.setNombre_produ(name3);
		stock3.setCantidad(cant3);
		stocks.put(stock3.getId(), stock3);
		
		Stock stock4 = new Stock();
		stock4.setId(id4);
		stock4.setNombre_produ(name4);
		stock4.setCantidad(cant4);
		stocks.put(stock4.getId(), stock4);
	
	
	}
	
	@Override
	public List<Stock> getStocks() {
		
		Collection<Stock> result = stocks.values();
		List<Stock> respuesta = new ArrayList<>(result);
		return respuesta;
	}
	
	@Override
	public Stock getStock(Long id) {
		Stock var;
		var = stocks.get(id);
		System.out.println("GEEET " + var);
		return stocks.get(id);
	}

	@Override
	public Response crearStock(Stock stock) {
		stock.setId(++id4);
		stocks.put(stock.getId(), stock);
		return Response.ok(stock).build();
	}

	@Override
	public Response actualizarStock(Stock stock) {
		Stock stockActual = stocks.get(stock.getId());
		Response respuesta;
		
		if(stockActual != null) {
			stocks.put(stock.getId(), stock);
			
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.notModified().build();
		}
		return respuesta;
	}

	@Override
	public Response eliminarStock(Long id) {
		Response respuesta;
		
		if(id != null) {
			stocks.remove(id);
			
			respuesta = Response.ok().build();
		}else {
			respuesta = Response.noContent().build();
		}
		return respuesta;
	}

	@Override
	public Long verificarStock(Long id) {

		long cant = 2;
		cant = stocks.get(id).getCantidad();
		System.out.println("GEEET "+ cant);
		return cant;
		
	}
	
}