package heapsort.controll;

import heapsort.model.Vetor;
import heapsort.view.Imprime;

public class principal {

	public static void main(String[] args) {
		Vetor v = new Vetor();
		Imprime imprime = new Imprime();
		Heapsort sort = new Heapsort();
		
		//imprime.inicio();
		v.iniciaVetor();
		System.out.println("vetor Desordenado");
		imprime.imprimeVetor(v.getVetor(), sort.getTrocas(), sort.getCont());
		
		//sort.ordena(v.getVetor());
		//imprime.imprimeVetor(v.getVetor());
		
		sort.recria(v.getVetor());
		System.out.println("vetor Ordenado");
		imprime.imprimeVetor(v.getVetor(), sort.getTrocas(), sort.getCont());

	}

}
