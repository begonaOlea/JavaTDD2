package com.curso.servicios;

public class MiUsuarioRepository implements UsuariosRepository {

	private Usuario u = new Usuario(1,"Luis","1234");
	

	@Override
	public Usuario getUsuarioByNombre(String nombre) {
		Usuario r = null;
	
		if(nombre.equals("Luis")) {
			r = u;
		}
		return r;
	}

}
