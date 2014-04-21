package heapsort.model;

import java.util.ArrayList;

public class Vetor {

	ArrayList<Integer> vetor = new ArrayList<>();;

	public Vetor(ArrayList<Integer> vetor) {
		this.vetor = vetor;
	}
	
	public Vetor(){
		this.vetor = vetor;
	}


	public void iniciaVetor(){
		vetor.add(12);
		vetor.add(7);
		vetor.add(25);
		vetor.add(18);
		vetor.add(3);
		vetor.add(14);
		vetor.add(22);
	}

	
	public ArrayList<Integer> getVetor() {
		return this.vetor;
	}

	public void setVetor(ArrayList<Integer> vetor) {
		this.vetor = vetor;
	}

}
