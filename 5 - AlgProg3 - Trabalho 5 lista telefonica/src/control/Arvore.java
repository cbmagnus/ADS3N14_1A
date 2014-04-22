package control;

import model.Contato;
import model.Nodo;

public class Arvore {
	
	Contato cont;
	private Nodo raiz;

	public Arvore(Nodo raiz) { //construtor
		this.raiz = raiz;
	}
	
	public void insere(String nome, int fone){
		Nodo novoNodo = new Nodo();
		
		novoNodo.setContato(new Contato(nome, fone)); //forma diferente de inserção
		novoNodo.getContato().setNome(nome);
		novoNodo.getContato().setNumero(fone);
		
	}

}
