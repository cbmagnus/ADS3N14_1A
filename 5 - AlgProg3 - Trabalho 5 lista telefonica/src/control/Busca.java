package control;

import java.util.ArrayList;
import view.Imprime;
import model.Nodo;


public class Busca {
	
	Imprime imp = new Imprime();
	ArrayList<Nodo> listaLargura = new ArrayList<>();

	public void largura(Nodo raiz){
		listaLargura = new ArrayList<>();
		ArrayList<Nodo> lista = new ArrayList<>();
		int cont = 0; // ------------------------------------- variavel auxiliar para sair do loop
		lista.add(raiz); // ---------------------------------- adicionado a raiz para iniciar a lista
		while(lista != null){
			imp.mostraNodo(lista.get(0));
			listaLargura.add(raiz); // ----------------------- Variavel para guardar sequencia de valores gravação TXT
			if(raiz.getFilhoEsquerdo() != null){ // ----------------- insere esquerdo na lista só se existir
				lista.add(raiz.getFilhoEsquerdo());
				cont ++;
			}
			if(raiz.getFilhoDireito() != null){ // ------------------ insere direito na lista só se existir
				lista.add(raiz.getFilhoDireito());
				cont ++;
			}
			if(cont != 0){
				lista.remove(0); // --------------------------------- remove sempre o primeiro da lista
				raiz = lista.get(0); // ------------------------------ raiz recebe proximo da fila
				cont--;
			}else{
				return;
			}
		}
	} // fim da busca em largura
	
	
	
	
	public void profundidade(Nodo raiz, String nome){
		
	}




	public ArrayList<Nodo> getListaLargura() {
		return listaLargura;
	}

}
