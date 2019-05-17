package com.utn.clase7bis;

public class Libro extends Publicacion implements Prestable{
	
	private boolean prestado;

	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		this.prestado = false;
	}

	@Override
	public void prestar() {
		
		System.out.println("se presto el libro ");
		prestado = true;
		
	}

	@Override
	public void devolver() {
		
		System.out.println("se devolvio el libro ");
		prestado = false;
		
	}

	@Override
	public boolean prestado() {
		
		return prestado;
	}

	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + "]";
	}
	
	
//	 Interface - Escribe un programa para una biblioteca que contenga 
//	 libros y revistas.
//	 �	Las caracter�sticas comunes que se almacenan tanto para las 
//	 revistas como para los libros son el c�digo, el t�tulo, y el a�o
//	 de publicaci�n. Estas tres caracter�sticas se pasan por par�metro 
//	 en el momento de crear los objetos.
//	 �	Los libros tienen adem�s un atributo prestado. Los libros, 
//	 cuando se crean, no est�n prestados.
//	 �	Las revistas tienen un n�mero. En el momento de crear. En el
//	 momento de crear las revistas se pasa el n�mero por par�metro.
//	 �	Tanto las revistas como los libros deben tener (aparte de los
//			 constructores) un m�todo toString() que devuelve el 
//alor de todos los atributos en una cadena de caracteres. 
//Tambi�n tienen un m�todo que devuelve el a�o de publicaci�n, 
//y otro el c�digo.
//	 �	Para prevenir posibles cambios en el programa se tiene 
//	 que implementar una interfaz Prestable con los m�todos prestar()
//	 ,devolver() y prestado. La clase Libro implementa esta interfaz
	
	
}
