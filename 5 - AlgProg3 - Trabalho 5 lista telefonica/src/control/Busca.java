package control;

import java.util.ArrayList;

import view.Imprime;

import model.Nodo;

public class Busca {
	
	ArrayList<Nodo> lista = new ArrayList<>();
	Imprime imp = new Imprime();
	
	
	public void largura(Nodo raiz){
		if(raiz == null){
			return;
		}
		else{
			lista.add(raiz);
			while(lista != null){
				imp.mostraNodo(lista.get(0));
				if(raiz.getFilhoEsquerdo() != null){
					lista.add(raiz.getFilhoEsquerdo());
				}
				if(raiz.getFilhoDireito() != null){
					lista.add(raiz.getFilhoDireito());
				}
				if(lista.get(0) == null){
					return;
				}
				else{
					lista.remove(0);
					raiz = lista.get(0);
				}
			}
		}
	}
	
	
	
	
	public void profundidade(Nodo raiz, String nome){
		
	}

}
