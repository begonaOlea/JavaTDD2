package com.curso.mockito;

public class BServiceImp implements BService {

	private AService servicio;

	@Override
	public AService getAService() {
		return servicio;
	}

	@Override
	public void setAServcice(AService service) {
		this.servicio = service;
	}

	@Override
	public int multiplica(int a, int b) {
		int res = 0;
		for(int i = 0 ; i < a ; i ++) {
			res = servicio.suma(res, b);
		}
		return res;
	}

}
