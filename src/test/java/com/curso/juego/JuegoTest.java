package com.curso.juego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JuegoTest {
	
	private Juego j;

	@Before
	public void setUp() throws Exception {
		this.j = new Juego();
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected =  JuegoException.class)
	public void testPonerFichaEnTableroFueraRangoXLanzaJuegoExption() 
			throws JuegoException{
		
		//preparo un objeto juego  que todavia no tiene fichas puestas
		int x = 4;
		int y = 0;
		j.ponerFicha(x, y);
	}
	
	@Test(expected =  JuegoException.class)
	public void testPonerFichaEnTableroFueraRangoY() throws JuegoException{
		
		int x = 0;
		int y = 4;
		j.ponerFicha(x, y);

	}
	
	
	@Test(expected =  JuegoException.class)
	public void testPonerFichaEnTableYaHayFicha() throws JuegoException {
		
		//preparo un objeto juego  que todavia no tiene fichas puestas
		int x = 0;
		int y = 0;
		j.ponerFicha(x, y); //poniendo 0,0
		
		j.ponerFicha(x, y);

	}
	
	@Test
	public void testPonerFichaEnTableroSitioLibreIncrementaContador()  throws JuegoException {
		int x = 0;
		int y = 0;
		int antes = j.getContador();  
		j.ponerFicha(x, y);
		Assert.assertEquals(j.getContador(), antes +1);
	}
	
	@Test
	public void testPrimerJudagosDebeserX() {
		//sin tirar
		Assert.assertEquals(j.getJugador(),'X');
	}
	
	@Test
	public void testJudagosDespuesdeXDebeserO() throws JuegoException{
		//después de la primera tirada
		int x = 0;
		int y = 0;
		j.ponerFicha(x, y);
		Assert.assertEquals(j.getJugador(),'O');
	}
	
	@Test
	public void testJudagosDespuesdeODebeserX() throws JuegoException{
		//después de la primera tirada
		int x = 0;
		int y = 0;
		j.ponerFicha(x, y);
		Assert.assertEquals(j.getJugador(),'O');
		x = 0;
		y = 1;
		j.ponerFicha(x, y);
		Assert.assertEquals(j.getJugador(),'X');
	}
	
	

	@Test
	public void testPrimeraTiradaNoHayGanador() throws JuegoException{	
		j.ponerFicha(0, 0);  // X
		String ganador = j.comprobarSiGana('X');;
		Assert.assertEquals(ganador,"No hay ganador");	
	}
	
	@Test
	public void testGanoPorqueConecto3FichasHorizontalmente() throws JuegoException{
		
		j.ponerFicha(0, 0);  // X
		j.ponerFicha(1, 0);  // O
		j.ponerFicha(0, 1);  // X
		j.ponerFicha(2, 0);  // O
		j.ponerFicha(0, 2);  // X
		String ganador = j.comprobarSiGana('X');
		Assert.assertEquals(ganador,"Gana jugador X");	
	}
	
	@Test
	public void testNoGanoPorqueNoConecto3FichasHorizontalmente() throws JuegoException{
		
		j.ponerFicha(2, 1);  // X
		j.ponerFicha(1, 0);  // O
		j.ponerFicha(0, 1);  // X
		j.ponerFicha(2, 0);  // O
		j.ponerFicha(0, 2);  // X
		String ganador = j.comprobarSiGana('X');
		Assert.assertEquals(ganador,"No hay ganador");	
	}
	
	@Test
	public void testGanoPorConecto3FichasVerticalmente() throws JuegoException{
		
		j.ponerFicha(0, 2);  // X
		j.ponerFicha(0, 0);  // O
		j.ponerFicha(1, 2);  // X
		j.ponerFicha(1, 1);  // O
		j.ponerFicha(2, 2);  // X
		j.mostrarTablero();
		String ganador = j.comprobarSiGana('X');
		Assert.assertEquals(ganador,"Gana jugador X");	
	}
	
	@Test
	public void testHayEmpate() throws JuegoException{
		
		//lleno tablero
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++ ) {
				j.ponerFicha(x,y); 
			}
		}
		
		
		j.mostrarTablero();
		String ganador = j.comprobarSiGana('X');
		Assert.assertEquals(ganador,"Empate");
	}
	
	

}
