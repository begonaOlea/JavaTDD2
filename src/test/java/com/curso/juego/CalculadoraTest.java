package com.curso.juego;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora c;
	
	@Before
	public void antes() {	
		//Preparo escenario
		c = new Calculadora();	
	}
	
	@Test
	public void sumarDosMasDosES4_version2() {
		
		//Calculadora c = new Calculadora();
		int recibido = c.suma(2,2);
		
	//	if( recibido != 4)
	//			fail("2 + 2 no esta sumando 4 sino " + recibido);
		
		Assert.assertEquals(recibido, 4);
	}


}
