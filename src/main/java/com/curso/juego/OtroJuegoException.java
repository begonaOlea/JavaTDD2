package com.curso.juego;

public class OtroJuegoException extends Exception{

	public OtroJuegoException(String msg) {
		super(msg);
	}
	
	public OtroJuegoException(String msg, Throwable causa) {
		super(msg, causa);
	}
}
