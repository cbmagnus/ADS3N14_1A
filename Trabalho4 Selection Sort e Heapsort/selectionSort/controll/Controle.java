package selectionSort.controll;

import selectionSort.view.Imprime;
import selectionSort.model.Vetor;

public class Controle {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor();
		Selection sel = new Selection();
		Imprime imp = new Imprime();
		
		
		
		vetor.iniciaVetor();
		System.out.println("vetor Desordenado");
		imp.imprimeVetor(vetor.getVetor(), sel.getContTroca(), sel.getContComparacao());
		
		sel.ordena(vetor.getVetor());
		System.out.println("vetor Ordenado");
		imp.imprimeVetor(vetor.getVetor(), sel.getContTroca(), sel.getContComparacao());

	}

}
