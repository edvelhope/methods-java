//Esercizio 2: Metodo per trovare il massimo in un array
//Descrizione: Scrivi un programma che:
//
//Crei un array di numeri interi.
//Implementi un metodo chiamato trovaMassimo(int[] array) che restituisce il massimo valore nell'array.
//Stampi il massimo valore trovato.
//
//NB: l'array deve essere passato come parametro al metodo.

package main;

public class NumeroMassimo {
	static int trovaMassimo(int[] array) {
		int massimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > massimo) {
				massimo = array[i];
			}
		}
		return massimo;
	}

	public static void main(String[] args) {
		int[] numeri = { 40, 3, 30, 10, 50, 6 };
		int numeroMassimo = trovaMassimo(numeri);
		System.out.print("Il numero maggiore nell'array è " + numeroMassimo);
	}

}
