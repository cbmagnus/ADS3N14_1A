package selectionSort.model;

import java.util.ArrayList;

public class Vetor {
	
	private ArrayList<Integer> vetor = new ArrayList<>();

	public Vetor(ArrayList<Integer> vetor) {
		this.vetor = vetor;
	}
	
	public Vetor() {
		this.vetor = vetor;
	}
	
	public void iniciaVetor(){
		/*
		vetor.add(5);
		vetor.add(3);
		vetor.add(2);
		vetor.add(4);
		vetor.add(7);
		vetor.add(6);
		*/
		vetor.add(20);
		vetor.add(30);
		vetor.add(15);
		vetor.add(25);
		vetor.add(10);
		vetor.add(40);
		vetor.add(35);
	}

	public ArrayList<Integer> getVetor() {
		return vetor;
	}

	public void setVetor(ArrayList<Integer> vetor) {
		this.vetor = vetor;
	}
	
}
