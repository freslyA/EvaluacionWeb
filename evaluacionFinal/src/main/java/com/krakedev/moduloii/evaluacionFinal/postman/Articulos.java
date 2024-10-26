package com.krakedev.moduloii.evaluacionFinal.postman;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("funciones")
public class Articulos {
	
	@Path("m1")
	@GET
	public String saludar() {
		return "Hola mundo de rest webs services";
	}
	

	
	
}
