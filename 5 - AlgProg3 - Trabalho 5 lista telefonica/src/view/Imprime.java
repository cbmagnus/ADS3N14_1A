package view;

import model.Nodo;

public class Imprime {
	
	
	public void mostraNodo(Nodo novo){
		System.out.printf("%s 	- 	%d \n", novo.getContato().getNome(), novo.getContato().getNumero());
	}
	
	
	
	public void erroNomesIguais(){
		System.out.println("Já existe este nome na lista tente outro \n");
	}
	
	
	
	public void contatoNaoEncontrado(){
		System.out.println("Contato não foi encontrado... \n");
	}
	
	
	
	public void mostraArvore(Nodo novo){
		System.out.println("raiz = " + novo.getContato().getNome());
		System.out.println("esquerdo = " + novo.getFilhoEsquerdo().getContato().getNome());
		System.out.println("direito = " + novo.getFilhoDireito().getContato().getNome());
	}
	
	
	
	public void erroArvoreVazia(){
		System.out.println("Arvore Vazia \n");
	}
	
	
	

}
