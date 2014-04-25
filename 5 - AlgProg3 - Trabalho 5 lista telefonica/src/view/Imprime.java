package view;

import model.Nodo;

public class Imprime {
	
	public void mostraNodo(String nome, int numero){
		System.out.printf("%s 		- 	%d", nome, numero);
	}
	
	public void erroNomesIguais(){
		System.out.println("Já existe este nome na lista tente outro");
	}
	
	public void mostraArvore(Nodo novo){
		System.out.println("raiz = " + novo.getContato().getNome());
		System.out.println("esquerdo = " + novo.getFilhoEsquerdo().getContato().getNome());
		System.out.println("direito = " + novo.getFilhoDireito().getContato().getNome());
	}

}
