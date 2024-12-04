//Esercizio 1: ArrayList e metodi per la media
//Descrizione: Scrivi un programma che:
//
//1) Crei un ArrayList di numeri interi.
//2) Implementi un metodo chiamato calcolaMedia(ArrayList<Integer> lista) che restituisce la media dei numeri presenti nella lista.
//3) Stampi la media calcolata.
//
//NB: l'arraylist deve essere passato come parametro al metodo.

package main;

import java.util.ArrayList;

public class Metodi {

	public static void main(String[] args) {

		// Creazione di un arraylist di numeri

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		// Assegna il metodo ad una variabile e stampa

		int avg = calcolaMedia(numbers);
		System.out.print(avg);
	}

	// Creazione metodo

	static int calcolaMedia(ArrayList<Integer> lista) {

		// Variabile per somma e lunghezza

		int sum = 0;
		int size = lista.size();

		// Ciclo per fare la somma dei numeri

		for (int i = 0; i < lista.size(); i++) {
			sum += lista.get(i);
		}

		// Ritorna il calcolo della media

		return sum / size;
	}

}
