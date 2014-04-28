package view;

import model.Nodo;

public class Travessias {

	Imprime imp = new Imprime();
	
	public void prefixa(Nodo nodo){
		if(nodo != null){
			imp.mostraNodo(nodo); // --------------------------------- imprime a raiz
			prefixa(nodo.getFilhoEsquerdo()); // -------------------- imprime os da esquerda recursivamente
			prefixa(nodo.getFilhoDireito()); // --------------------- imprime os da direita recursivamente
		}
	} // fim da prefixa
	
	
	
	
	public void infixa(Nodo nodo){
		if(nodo != null){
			infixa(nodo.getFilhoEsquerdo()); // -------------------- imprime os da esquerda recursivamente
			imp.mostraNodo(nodo); // --------------------------------- imprime a raiz
			infixa(nodo.getFilhoDireito()); // --------------------- imprime os da direita recursivamente
		}
	}
	
	
	
	public void posfixa(Nodo nodo){
		if(nodo != null){
			posfixa(nodo.getFilhoEsquerdo()); // -------------------- imprime os da esquerda recursivamente
			posfixa(nodo.getFilhoDireito()); // --------------------- imprime os da direita recursivamente
			imp.mostraNodo(nodo); // --------------------------------- imprime a raiz
		}
	}
	
	
	
} // fim da classe
