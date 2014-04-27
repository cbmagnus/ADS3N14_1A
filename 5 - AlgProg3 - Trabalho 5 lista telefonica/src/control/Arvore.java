package control;

import view.Imprime;
import model.Contato;
import model.Nodo;

public class Arvore {
	
	private Nodo raiz; // ----------------------------------------------- variavel global
	private int contaNodo = 0;
	
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
		contaNodo ++;
		
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
					contaNodo --;
					break;
				}
			}	
		}
	} // fim do insere
	
	
	
	
	
	public Nodo pesquisa(String nome){
		
		Nodo atual = raiz; // ------------------------------------------------------- guardo o valor existente inicio
		
		if(atual == null){ // ------------------------------------------------------- se arvore vazia sai
			imp.erroArvoreVazia();
			return null;
		}
		
		// compara se nome informado é maior ou menor que o existente e joga na variavel "comparacao"
		int comparacao = comparaStrings(nome, atual.getContato().getNome());
		while(comparacao != 0){
			
			if(comparacao < 0){ // ----------------------------------------- se menor vai para esquerda
				atual = atual.getFilhoEsquerdo();
				if(atual == null){ // -------------------------------------------- se proximo is null sai
					imp.contatoNaoEncontrado();
					return null;
				}
				else{
					comparacao = comparaStrings(nome, atual.getContato().getNome());
				}
			}
			else if(comparacao > 0){ // ----------------------------------------- se maior vai para direita
				atual = atual.getFilhoDireito();
				if(atual == null){ // -------------------------------------------- se proximo is null sai
					imp.contatoNaoEncontrado();
					return null;
				}
				else{
					comparacao = comparaStrings(nome, atual.getContato().getNome());
				}
			}
		}
		return atual;
		
	} // fim da pesquisa
	
	
	
	
	
	public void apaga(String nome){
		Nodo atual = raiz; // ------------------------------------------------------- guardo o valor existente inicio
		Nodo aux = raiz;
		
		if(pesquisa(nome) == null){
			imp.contatoNaoEncontrado();
			return;
		}
		
		else{
			contaNodo --;
			atual = pesquisa(nome);
			
			if(atual.getFilhoEsquerdo() == null && atual.getFilhoDireito() == null){ // ---- verifica se tem filhos se não só exclui pq é folha
				if(atual == raiz){ // -------------------------------------------------------verifica se é raiz e zera arvore
					raiz = null;
				}
				else{
					atual = null;
				}
			}
			else if (atual.getFilhoDireito() == null){ // ------------------------ se NÃO tem filho na DIREITA sobe o da esquerda  
				if (atual == raiz){
					raiz = atual.getFilhoEsquerdo();
				}
				else{
					atual = atual.getFilhoEsquerdo();
				}
			}
			else if (atual.getFilhoEsquerdo() == null){ // ------------------------ se NÃO tem filho na ESQUERDA sobe o da direita
				if (atual == raiz){
					raiz = atual.getFilhoDireito();
				}
				else{
					atual = atual.getFilhoDireito();
				}
			}
			else{ // ---------------------------------------------------- se tiver DOIS FILHOS o ultimo nome a esquerda do direito sobe 
				aux = atual.getFilhoDireito();
				while(aux.getFilhoEsquerdo() != null){
					aux = aux.getFilhoEsquerdo();
				}
				atual = aux;
			}
		}
	} // fim do apaga
	
	
	
	
	
	
	public int comparaStrings(String nome1, String nome2){
		int comp = nome1.compareToIgnoreCase(nome2);
		return comp;
	}
	
	
	

	public Nodo getRaiz() {
		return raiz;
	}
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	public int getContaNodo(){
		return contaNodo;
	}
	
} // Fim da classe


