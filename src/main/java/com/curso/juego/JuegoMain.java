package com.curso.juego;

public class JuegoMain {
	
	Juego juego;

	public JuegoMain() {
		juego = new Juego();
	}
	
	
	public void usoPoner(int x, int y) throws OtroJuegoException {
		
		try {
			juego.ponerFicha(x, y);
		} catch (JuegoException e) {
			throw new OtroJuegoException("Has puesto posicion mal",e);
		}
	}
	
	
	public static void main(String[] args) {
		JuegoMain mi = new JuegoMain();
		try {
			mi.usoPoner(0, 7);
		} catch (OtroJuegoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
