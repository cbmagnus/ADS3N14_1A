package selectionSort.controll;

import java.util.ArrayList;

public class Selection {

	private int raiz = 0;
	private int prox = 0;
	private int indiceMenor = 0;
	private int indiceMaior = 0;
	private int contComparacao = 0;
	private int contTroca = 0;
	
	public void ordena(ArrayList<Integer> vetor){
		
		for(int a = 0; a < vetor.size() - 1; a++){
			raiz = vetor.get(a);
			indiceMenor = a;
			
			for(int i = a + 1; i < vetor.size(); i++){
				contComparacao ++;
				if(raiz > vetor.get(i)){
					contTroca ++;
					raiz = vetor.get(i); 
					prox = vetor.get(a); 
					indiceMenor = a;
					indiceMaior = i;
					vetor.set(indiceMenor, raiz);
					vetor.set(indiceMaior, prox);
					
					//System.out.println(vetor.get(indiceMenor));
					//System.out.println(vetor.get(indiceMaior));
				}
			}
		}
	}
	
	public int getContTroca(){
		return contTroca;
	}
	
	public int getContComparacao(){
		return contComparacao;
	}
}
