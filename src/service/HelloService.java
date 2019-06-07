package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import modelo.Usuario;

@Path("hello")
public class HelloService {
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario teste() {
		
		return new Usuario(1, "Jo�s");
	}
	
	@GET
	@Path("listausuario")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> lista() {
		List<Usuario> lista = new ArrayList<Usuario>();
		lista.add(new Usuario(1, "Jo�s"));
		lista.add(new Usuario(2, "Maria"));
		lista.add(new Usuario(3, "Pedro"));
		lista.add(new Usuario(4, "Joao"));
		
		return lista;
	}

}
