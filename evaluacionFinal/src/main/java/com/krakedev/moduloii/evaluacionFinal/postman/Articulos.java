package com.krakedev.moduloii.evaluacionFinal.postman;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.krakedev.moduloii.evaluacion.servicios.ServiciosArticulo;
import com.krakedev.moduloii.evaluacionFinal.entidades.Articulo;

@Path("funciones")
public class Articulos {

	@Path("m1")
	@GET
	public String saludar() {
		return "Hola mundo de rest webs services";
	}
	
<<<<<<< HEAD

	
=======
	@Path("insertar")
	@POST
	//@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar (Articulo a) {
		System.out.println(">>>>>>>"+a);
		ServiciosArticulo s = new ServiciosArticulo();
	
	}
>>>>>>> 1ca4ab3be0151dc0e3c8f54563ae78e2b1dca804
	
}
