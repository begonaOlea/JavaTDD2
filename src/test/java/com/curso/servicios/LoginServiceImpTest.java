package com.curso.servicios;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceImpTest {
	
	 @Mock
	 UsuariosRepository repo;

	@Test
	public void testLoginUsuarioNoExisteDevuelveFalse() {
		
		UsuariosRepository repositorio = new MiUsuarioRepository();
		LoginService servicioLogin = new LoginServiceImp();
		servicioLogin.setRepositorio(repositorio);
		
		Assert.assertEquals(servicioLogin.login("Laura", "1234"),false);

	}
	
	@Test
	public void testLoginUsuarioExisteDevuelveTrue() {
		
		UsuariosRepository repositorio = new MiUsuarioRepository();
		LoginService servicioLogin = new LoginServiceImp();
		servicioLogin.setRepositorio(repositorio);
		
		Assert.assertEquals(servicioLogin.login("Luis", "1234"),true);

	}
	
	@Test
	public void testLoginUsuarioExisteYClavemasDevuelvefalse() {
		
		UsuariosRepository repositorio = new MiUsuarioRepository();
		LoginService servicioLogin = new LoginServiceImp();
		servicioLogin.setRepositorio(repositorio);
		
		Assert.assertEquals(servicioLogin.login("Luis", "2222"),false);

	}
	

	
	//import static org.mockito.Mockito.*;
	@Test
	public void testLoginUsuarioNoExisteConMockito() {
		
		//UsuariosRepository repo = mock(UsuariosRepository.class);
		when(repo.getUsuarioByNombre("Laura"))
		       .thenReturn(null); 
		
		LoginService servicioLogin = new LoginServiceImp();
		servicioLogin.setRepositorio(repo);
		
		Assert.assertEquals(servicioLogin.login("Laura", "2222"),false);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void testLoginUsuarioExisteNoCoincideClaveConMockito() {
		 UsuariosRepository repo = mock(UsuariosRepository.class);
		 when(repo.getUsuarioByNombre("Laura"))
		       .thenReturn(new Usuario(1,"Laura","1234")); 
		
		LoginService servicioLogin = new LoginServiceImp();
		servicioLogin.setRepositorio(repo);
		
		Assert.assertEquals(servicioLogin.login("Laura", "2222"),false);
	}
	

}
