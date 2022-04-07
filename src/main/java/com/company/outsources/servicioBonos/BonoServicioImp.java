package com.company.outsources.servicioBonos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.company.outsources.modelo.Bono;


@Service
public class BonoServicioImp implements BonoServicio {

	//Hash Table
		Map<Long,Bono> bonos = new HashMap<Long,Bono>();
		long idAct =123;
		
		//contructor
		public BonoServicioImp() {
			init();//init para crear el bono por primera vez
		}
		
		void init() {
			Bono bono = new Bono();
			bono.setIdBono(idAct);
			bono.setValor("50000");
			bonos.put(bono.getIdBono(), bono);
		}

		@Override
		public List<Bono> getBonos() {
			// TODO Auto-generated method stub
			Collection<Bono> result = bonos.values();
			List<Bono> respuesta = new ArrayList<>(result);
			System.out.print("imprimiooooo bono");
			return respuesta;
		}
		
		@Override
		public Bono getBono(Long idBono) {
			return bonos.get(idBono);
		}

		@Override
		public Response crearBono(Bono bono) {
			bono.setIdBono(++idAct);
			bonos.put(bono.getIdBono(), bono);
			return Response.ok(bono).build();
		}

		@Override
		public Response actualizarBono(Bono bono) {
			Bono bonoActual = bonos.get(bono.getIdBono());
			Response respuesta;
			
			if(bonoActual != null) {
				bonos.put(bono.getIdBono(), bono);
				
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
		public List<Bono> eliminarBono(Long idBono) {
			bonos.remove(idBono);
			Collection<Bono> result = bonos.values();
			List<Bono> respuesta = new ArrayList<>(result);
			return respuesta;
			
		
		}

	

}

	
