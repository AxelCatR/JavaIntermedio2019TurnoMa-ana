package com.utn.clase7;

public class Disco extends Multimedia{
	
//	Escribe una clase Disco, que herede de la clase Multimedia ya
//	realizada. La clase Disco tiene, aparte de los elementos 
//	heredados, un atributo para almacenar el g�nero al que 
//	pertenece (rock, pop, �pera�). La clase debe tener un m�todo 
//	para obtener el nuevo atributo y debe sobreescribir el m�todo 
//	toString() para que devuelva toda la informaci�n.
	private Genero genero ; 
	
	public Disco(String titulo, String autor, double duracion, Formato formato , Genero genero) {
		super(titulo, autor, duracion, formato);
		this.genero = genero ;
	}

	@Override
	public String toString() {
		return "Disco [genero=" + genero + "]";
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
	
	
}
