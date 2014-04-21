package heapsort.controll;

import heapsort.model.Vetor;

import java.util.ArrayList;

public class Heapsort {
	private Vetor v = new Vetor();
	private ArrayList<Integer> teste = new ArrayList<>();
	private int cont = 0;
	private int trocas = 0;
	
	
	
	public ArrayList<Integer> ordena(ArrayList<Integer> vet){
		
		ArrayList<Integer> novo = new ArrayList<>();
		int raiz;
		int esq;
		int dir;
		int ultimo = vet.size();
		
		//for para validar o heap
		novo.add(vet.get(0));
		for(int a = 0; a < (ultimo / 2); a++){
			for(int i = 0; i < (ultimo / 2); i++){

				if(vet.get(i) < vet.get(i * 2 + 1)){
					//adiciona na posição i o valor que estava a esquerda se for maior
					raiz = vet.get(i * 2 + 1);
					esq = vet.get(i);
					vet.set(i, raiz);
					vet.set(i * 2 + 1, esq);
					novo.set(i, raiz);
					novo.add((i * 2 + 1), esq);
					cont++;
				}else{
					novo.add((i * 2 + 1), vet.get(i * 2 + 1));
					cont++;
				}
				if(i * 2 + 2 <= vet.size() - 1){
					if(vet.get(i) < vet.get(i * 2 + 2)){
						//adiciona na posição i o valor que estava a direita se for maior
						raiz = vet.get(i * 2 + 2);
						dir = vet.get(i);
						vet.set(i, raiz);
						vet.set(i * 2 + 2, dir);
						novo.set(i, raiz);
						novo.add((i * 2 + 2), dir);
						cont++;
					}else{
						novo.add((i * 2 + 2), vet.get(i * 2 + 2));
						cont++;
					}
				}
			}
		}
		//v.setVetor(novo);
		return novo;
	}
	
	
	
	
	
	public void recria(ArrayList<Integer> vetor){
		int raiz = 0;
		int ultimo = 0;
		
		do{
			ordena(vetor);
			
			raiz = vetor.get(0);
			ultimo = vetor.get(vetor.size() - 1);

			vetor.set(0, ultimo);
			vetor.set(vetor.size() -1, raiz);
			trocas ++;

			teste.add(vetor.get(vetor.size()-1));

			vetor.remove(vetor.size() -1);

		}while(vetor.size() != 0);
		vetor.addAll(teste);
	}

	
	
	public ArrayList<Integer> getTeste(){
		return teste;
	}
	
	public int getCont(){
		return cont;
	}
	
	public int getTrocas(){
		return trocas;
	}

}
