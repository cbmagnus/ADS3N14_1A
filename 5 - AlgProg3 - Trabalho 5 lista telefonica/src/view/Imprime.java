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
		System.out.println("Já existe este nome na lista tente outro \n");
	}
	
	
	
	public void contatoNaoEncontrado(){
		System.out.println("Contato não foi encontrado... \n");
	}
	
	
	
	public void erroArvoreVazia(){
		System.out.println("Arvore Vazia \n");
	}
	
	
	

}
