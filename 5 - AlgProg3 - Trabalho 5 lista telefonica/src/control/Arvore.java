package control;

import view.Imprime;
import model.Contato;
import model.Nodo;

public class Arvore {
	
	private Nodo raiz; // --------------------------------------------------------variavel global
	
	Imprime imp = new Imprime();
	
	
	public Arvore(Nodo raiz) { //construtor
		this.raiz = raiz;
	}
	public Arvore(){ // construtor
		getRaiz();
	}
	
	
	
	
	public void insere(String nome, int fone){
		Nodo novoNodo = new Nodo();
		
		novoNodo.setContato(new Contato(nome, fone)); //forma diferente de inserção para teste
		//novoNodo.getContato().setNome(nome);
		//novoNodo.getContato().setNumero(fone);
		
		if(raiz == null){ // --------------------------------------------------------------- raiz vazia
			raiz = novoNodo;
		}
		else{ //raiz com nodos
			Nodo atual = raiz; // ----------------------------------------------------------- variavel nodo raiz
			Nodo lado; // ------------------------------------------------------------------- variavel auxiliar para inserir o novo nodo
			
			while(true){
				lado = atual;
				// compara se nome informado é maior ou menor que o existente e joga na variavel "comparacao"
				int comparacao = nome.compareToIgnoreCase(atual.getContato().getNome());
				
				if(comparacao < 0 ){ // ------------------------------------------------------ compara se menor vai para esquerda
					atual = atual.getFilhoEsquerdo();
					
					if(atual == null){ // ------------------------------------------------------insere o nodo;
						lado.setFilhoEsquerdo(novoNodo); // ----------------------------------- filho a esquerda recebe o nome e numero
						return;
					}
				}
				else if(comparacao > 0){ // ---------------------------------------------------- vai para direita
					atual = atual.getFilhoDireito();
			
					if(atual == null){ // ------------------------------------------------------- insere a direita
						lado.setFilhoDireito(novoNodo);
						return;
					}
				}
				else{
					imp.erroNomesIguais();
					break;
				}
			}	
		}
	} // fim do insere
	
	
	
	
	
	public Nodo pesquisa(String nome){
		Nodo atual = raiz; // ------------------------------------------------------- guardo o valor existente inicio
		
		// compara se nome informado é maior ou menor que o existente e joga na variavel "comparacao"
		int comparacao = nome.compareToIgnoreCase(atual.getContato().getNome());
		
		while(comparacao != 0){
			
			if(comparacao < 0){ // ----------------------------------------- se menor vai para esquerda
				atual = atual.getFilhoEsquerdo();
			}
			else if(comparacao > 0){ // ----------------------------------------- se maior vai para direita
				atual = atual.getFilhoDireito();
			}
			else if(atual == null){ // ----------------------------------------- se acabo os nodos não encontrou
				imp.contatoNaoEncontrado();
			}
		}
		
		return atual;
		
	} // fim da pesquisa
	
	
	

	public Nodo getRaiz() {
		return raiz;
	}
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
}
