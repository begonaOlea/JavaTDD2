package com.curso.servicios;

public interface LoginService {
	
	boolean login(String nombre, String clave );
	void setRepositorio(UsuariosRepository repo);

}
