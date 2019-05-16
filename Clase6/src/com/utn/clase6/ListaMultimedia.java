package com.utn.clase6;

import javax.sql.rowset.spi.TransactionalWriter;
//
//Ejercicio3
//3) Escribe una clase ListaMultimedia para almacenar objetos de tipo multimedia. La clase debe tener un atributo, 
//que sea un array de objetos Multimedia y un entero para contar cuantos objetos hay almacenados. Adem�s, tiene un constructor y los siguientes m�todos:
//	
//a).el constructor recibe un entero por par�metro indicando el n�mero m�ximo de objetos que va a almacenar.
//b).int size(): devuelve el n�mero de objetos que hay en la lista.
//c).boolean add(Multimedia m): a�ade el objeto al final de la lista, y devuelve true, en caso de que la lista est� llena, devuelve false.
//d).Multimedia get(int position): devuelve el objeto situado en la posici�n especificada.
//e).String toString(): devuelve la informaci�n de los objetos que est�n en la lista.

public class ListaMultimedia {

	private Multimedia[] lista;
	private int contador;

	public ListaMultimedia(int capacidad) {
		lista = new Multimedia[capacidad];
		contador = 0;
	}

	public int size() {
		return contador;
	}

	private boolean llena() {
		return contador == lista.length;
	}

	public boolean add(Multimedia m) {
		if (llena()) {
			return false;
		} else {
			lista[contador] = m;
			contador++;
			return true;
		}

	}

	public Multimedia get(int posicion) {
		if (posicion > contador) {
			throw new IndexOutOfBoundsException();
		}
		return lista[posicion];
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < contador; i++) {
			s += lista[i].toString() + "\n";
		}
		return s;

	}
}
