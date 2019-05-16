package com.utn.clase5;

public class DeTres implements ISeriesNumericas {

	int iniciar;
	int valor;
	
	DeTres(){
		iniciar = 0;
		valor = 0;
	}
	
	@Override
	public int getSiguiente() {
		valor += 3;
				
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
	}

	@Override
	public void setComenzar(int x) {
		iniciar = x ;
		valor = x;
	}

}
