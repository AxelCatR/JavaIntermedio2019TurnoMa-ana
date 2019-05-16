package com.utn.clase5;

public class SerieNumericaDeDosEnDos implements ISeriesNumericasHerencia{

	int iniciar ;
	int valor ;
	int anterior;
	
	//metodo Constructor
	 SerieNumericaDeDosEnDos(){
		iniciar = 0;
		valor = 0 ;	
		
	}
	
	//Siempre que implementemos un m�topdo definido por una
	//interfaz, debe implementarse como P�BLICO porque 
	//todo los miembros de una interfaz son implicitamente p�blicos
	@Override
	public int getSiguiente() {
		anterior = valor;
		valor += 2;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
		anterior = valor - 2 ;
	}

	@Override
	public void setComenzar(int x) {
		iniciar = x ;
		valor = x;
		anterior =  x - 2;
	}

	//a�adimos un m�todo que no esta definido en la Interface ISeriesNumericas
	public int getAnterior() {
		return anterior;		
	}
}

