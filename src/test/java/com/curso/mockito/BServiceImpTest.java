package com.curso.mockito;



import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


public class BServiceImpTest {
	
	@Mock
	AService servicioA;

	@Test
	public void testMultiplicar2por4Es8SinMock() {
		
		AService a = new AServiceImp();
		BService b = new BServiceImp();
		b.setAServcice(a);
		Assert.assertEquals(b.multiplica(2, 4), 8);
	
	}
	
	
	@Test
	public void testMultiplicar2por4Es8ConMock() {
		
		Mockito.when(servicioA.suma(2, 4)).thenReturn(8);
		//Mockito.when(....).thenThrow(new RuntimeException());
		
		BService b = new BServiceImp();
		b.setAServcice(servicioA);
		Assert.assertEquals(b.multiplica(2, 4), 8);
	
	}

}
