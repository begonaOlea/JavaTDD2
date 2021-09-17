package com.curso.servicios;

//@Service
public class LoginServiceImp implements LoginService {

	//@Autowired
	private UsuariosRepository repositorio;
	

	@Override
	public boolean login(String nombre, String clave) {
	   
       Usuario u = repositorio.getUsuarioByNombre(nombre);
       if( u == null || ! u.getClave().equals(clave))
    	   return false;
       else
    	   return true;
	}

	
	public void setRepositorio(UsuariosRepository repositorio) {
		this.repositorio = repositorio;
	}
	
}
