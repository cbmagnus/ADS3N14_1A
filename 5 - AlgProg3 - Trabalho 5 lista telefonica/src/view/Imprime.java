package view;

import model.Nodo;

public class Imprime {
	
	
	public void mostraNodo(Nodo novo){
		if(novo == null){
			
		}else{
		System.out.printf("%s       	- %d \n", novo.getContato().getNome(), novo.getContato().getNumero());
		}
	}
	
	
	
	public void erroNomesIguais(){
		System.out.println("J� existe este nome na lista tente outro \n");
	}
	
	
	
	public void contatoNaoEncontrado(){
		System.out.println("Contato n�o foi encontrado... \n");
	}
	
	
	
	public void erroArvoreVazia(){
		System.out.println("Arvore Vazia \n");
	}
	
	
	

}
