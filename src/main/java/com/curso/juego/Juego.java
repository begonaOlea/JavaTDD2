package com.curso.juego;

public class Juego {

	private char[][] tablero = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, };

	private char jugador = 'X';
	
	private int contador = 0;

	public Juego() {
	}

	public void ponerFicha(int x, int y) throws JuegoException {

		if (x < 0 || x > 2) throw new JuegoException("Ficha fuera rango x");
		if(y < 0 || y >2 ) throw new JuegoException("Ficha fuera rango x");
		
		if(tablero[x][y] != ' ') throw new JuegoException("Ficha fuera rango x");
		
		//poner
		tablero[x][y] = jugador;
		contador ++;
		
		//cambiar jugador
		if (jugador == 'X' ) {
			jugador = 'O';
		}else {
			jugador = 'X';
		}

	}

	public char getJugador() {
		return jugador;
	}
	
	public int getContador() {
		return contador;
	}
	
	public String comprobarSiGana(char jugador) {
		//comprobar conexión x
		int conectan;
		
		//HORIZONTAL
		for(int i = 0; i < 3; i++) {
			conectan = 0;
			for(int j = 0; j < 3; j++ ) {
				if(tablero[i][j] == jugador) conectan++;
				else break;
			}
			if(conectan == 3) {
				return "Gana jugador " + jugador;
			}
		}
		
		//VERTICAL
		for(int i = 0; i < 3; i++) {
			conectan = 0;
			for(int j = 0; j < 3; j++ ) {
				if(tablero[j][i] == jugador) conectan++;
				else break;
			}
			if(conectan == 3) {
				return "Gana jugador " + jugador;
			}
		}
		
		if(contador == (3*3)) {
			return "Empate";
		}else {
			return "No hay ganador";
		}
	}

	public void mostrarTablero() {
        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero.length; y++) {
                System.out.print("("+tablero[x][y]+")");
            }
            System.out.println();
        }
    }
	
	
	
}
