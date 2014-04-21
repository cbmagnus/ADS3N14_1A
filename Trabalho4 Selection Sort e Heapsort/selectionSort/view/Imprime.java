package selectionSort.view;

import java.util.ArrayList;

public class Imprime {

	public void imprimeVetor(ArrayList<Integer> vetor, int troca, int compara){
		System.out.printf("Foram realizadas %d trocas e %d comparações \n", troca, compara);
		for(int i = 0; i < vetor.size(); i++){
			System.out.println(vetor.get(i));
		}
		System.out.println("-------------------");
	}
	
}
