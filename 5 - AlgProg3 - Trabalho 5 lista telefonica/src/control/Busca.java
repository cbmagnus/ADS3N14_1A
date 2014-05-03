package control;

import java.util.ArrayList;

import view.Imprime;

import model.Nodo;

public class Busca {
	
	ArrayList<Nodo> lista = new ArrayList<>();
	Imprime imp = new Imprime();
	
	
	public void largura(Nodo raiz){
		int cont = 0; // -------------------------------variavel auxiliar para sair do loop
		lista.add(raiz); // ------------------------------adicionado a raiz para iniciar a lista
		while(lista != null){
			imp.mostraNodo(lista.get(0));
			if(raiz.getFilhoEsquerdo() != null){ // ------------------ insere esquerdo na lista só se existir
				lista.add(raiz.getFilhoEsquerdo());
				cont ++;
			}
			if(raiz.getFilhoDireito() != null){ // ------------------ insere direito na lista só se existir
				lista.add(raiz.getFilhoDireito());
				cont ++;
			}
			if(cont != 0){
				lista.remove(0); // --------------------------------remove sempre o primeiro da lista
				raiz = lista.get(0);
				cont--;
			}else{
				return;
			}
		}
	}
	
	
	
	
	public void profundidade(Nodo raiz, String nome){
		
	}

}
