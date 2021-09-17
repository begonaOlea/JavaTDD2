package com.curso.juego;

public class JuegoException extends Exception {

	public JuegoException() {
		
	}

	public JuegoException(String message) {
		super(message);
		
	}

	public JuegoException(Throwable cause) {
		super(cause);
	}

	public JuegoException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public JuegoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
