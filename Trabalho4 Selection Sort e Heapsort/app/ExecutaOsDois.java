package app;

import java.util.ArrayList;

import selectionSort.controll.Selection;
import selectionSort.model.Vetor;
import heapsort.controll.Heapsort;
import heapsort.view.Imprime;

public class ExecutaOsDois {

	public static void main(String[] args) {
		
		Heapsort sort = new Heapsort();
		Imprime imprime = new Imprime();
		selectionSort.view.Imprime imprimeSel = new selectionSort.view.Imprime();
		Selection sel = new Selection();
		Vetor vetor = new Vetor();
		heapsort.model.Vetor v = new heapsort.model.Vetor();
		
		//heapSort
		v.setVetor(vetorTeste());
		sort.recria(vetorTeste());//heapSort
		System.out.println("Metodo de ordenação HeapSort");
		imprime.imprimeVetor(v.getVetor(), sort.getTrocas(), sort.getCont());//heapSort
		
		
		//SelectionSort
		vetor.setVetor(vetorTeste());
		sel.ordena(vetorTeste());//SelectionSort
		System.out.println("Metodo de ordenação SelectionSort");
		imprimeSel.imprimeVetor(vetor.getVetor(), sel.getContTroca(), sel.getContComparacao());//SelectionSort

	}
	
	public static ArrayList<Integer> vetorTeste(){
		ArrayList<Integer> vetor = new ArrayList<>();
		
		vetor.add(20);
		vetor.add(30);
		vetor.add(15);
		vetor.add(25);
		vetor.add(10);
		vetor.add(40);
		vetor.add(35);
		
		return vetor;
	}

}
