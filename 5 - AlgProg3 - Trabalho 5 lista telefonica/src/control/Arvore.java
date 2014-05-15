package control;

import view.Imprime;
import model.Contato;
import model.Nodo;

public class Arvore {
	
	private Nodo raiz; // ----------------------------------------------- variavel global
	private Nodo paiProcurado = null;
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
		int contComp = 0; // -------------------------------------------------------- variavel para contar comparações
		
		if(atual == null){ // ------------------------------------------------------- se arvore vazia sai
			imp.erroArvoreVazia();
			return null;
		}
		
		// compara se nome informado é maior ou menor que o existente e joga na variavel "comparacao"
		int comparacao = comparaStrings(nome, atual.getContato().getNome());
		contComp ++;
		while(comparacao != 0){
			
			if(comparacao < 0){ // ----------------------------------------- se menor vai para esquerda
				paiProcurado = atual;
				atual = atual.getFilhoEsquerdo();
				if(atual == null){ // -------------------------------------------- se proximo is null sai
					imp.contatoNaoEncontrado();
					return null;
				}
				else{
					comparacao = comparaStrings(nome, atual.getContato().getNome());
					contComp ++;
				}
			}
			else if(comparacao > 0){ // ----------------------------------------- se maior vai para direita
				paiProcurado = atual;
				atual = atual.getFilhoDireito();
				if(atual == null){ // -------------------------------------------- se proximo is null sai
					imp.contatoNaoEncontrado();
					return null;
				}
				else{
					comparacao = comparaStrings(nome, atual.getContato().getNome());
					contComp ++;
				}
			}
		}
		System.out.printf("FORAM REALIZADAS %d COMPARAÇÕES \n", contComp);
		return atual;
	} // fim da pesquisa
	
	
	
	
	
	public void apaga(String nome){
		Nodo atual = pesquisa(nome); // ---------------------------------------------- verifica e identifica o nome na arvore
		Nodo aux = raiz;
		
		if(atual == null){
			return;
		}
		
		else{
			contaNodo --;
			
			if(atual.getFilhoEsquerdo() == null && atual.getFilhoDireito() == null){ // ---- verifica se tem filhos se não só exclui pq é folha
				if(atual == raiz){ // -------------------------------------------------------verifica se é raiz e zera arvore
					raiz = null;
				}
				else{
					if(paiProcurado.getFilhoDireito().getContato().getNome().equals(atual.getContato().getNome())){
						paiProcurado.setFilhoDireito(null);
					}
					else{
						paiProcurado.setFilhoEsquerdo(null);
					}
				}
			}
			
			
			else if (atual.getFilhoDireito() == null){ // ------------------------ se NÃO tem filho na DIREITA sobe o da esquerda  
				Nodo A = atual.getFilhoEsquerdo(); // ---------------------------- auxiliar para guardar o filho 
				atual.setContato(A.getContato()); // ------------------------------- filho deixa de existir
				atual.setFilhoDireito(A.getFilhoDireito()); // --------------------- filho deixa de existir
				atual.setFilhoEsquerdo(A.getFilhoEsquerdo()); // ------------------- filho deixa de existir
			}
			
			
			else if (atual.getFilhoEsquerdo() == null){ // ------------------------ se NÃO tem filho na ESQUERDA sobe o da direita
				Nodo A = atual.getFilhoDireito(); // ---------------------------- auxiliar para guardar o filho 
				atual.setContato(A.getContato()); // ------------------------------- filho deixa de existir
				atual.setFilhoDireito(A.getFilhoDireito()); // --------------------- filho deixa de existir
				atual.setFilhoEsquerdo(A.getFilhoEsquerdo()); // ------------------- filho deixa de existir
			}
			
			
			else{ // ---------------------------------------------------- se tiver DOIS FILHOS o ultimo nome a esquerda do direito sobe 
				aux = atual.getFilhoDireito(); // ------------------------ alterar o codigo o que muda é o conteudo do nodo e não o nodo em si
				Nodo pai = atual; // --------------------- auxiliar para guardar o pai
				while(aux.getFilhoEsquerdo() != null){
					pai = aux;
					aux = aux.getFilhoEsquerdo();
					if(aux.getFilhoEsquerdo() != null){
						pai = aux; // ---------------------------- pai só recebe filho esquerdo se existir outro para continuar sendo pai
					}
				}
				atual.setContato(aux.getContato()); // ------------ troca valor de atual pelo mais a esquerdo do nodo a direita.
				
				if(aux.getFilhoDireito() != null){ // -------------- verifico se o nome a ser ecluido tem filho a direita
					if(pai.getFilhoDireito().getContato().getNome().equals(aux.getContato().getNome())){ // --- verifico se é o filho a direita que eu quero
						if(aux.getFilhoDireito() != null){ // ----------- verifico se o valor a ser excluido tem filho a direita
							pai.setFilhoDireito(aux.getFilhoDireito()); // -- filho a direita do pai recebe filho a direita do nodo a ser excluido
						}
						else{ // ---------------------------------------------- se não tem filhos apenas exclui
						pai.setFilhoDireito(null);
						}
					}
					else{ // --------------------------------------------- o que eu quero é o filho da esquerda 
						if(aux.getFilhoDireito() != null){  // ------------ e verifico se o da esquerda te filhos a direita
							pai.setFilhoEsquerdo(aux.getFilhoDireito());
						}
						else{
							pai.setFilhoEsquerdo(null);
						}
					}
				}
				
				else{ // ------------------------------------------ se for = null verifico se é mesmo o filho direito e excluo
					if(pai.getFilhoDireito().getContato().getNome().equals(aux.getContato().getNome())){
						pai.setFilhoDireito(null);
					}
					else{ // -------------------------------------- se não excluo o esquerdo
						pai.setFilhoEsquerdo(null);
					}
				}
			}
		}
		System.out.println("Contato deletado com sucesso!");
		
	} // fim do apaga
	
	
	
	
	
	public int comparaStrings(String nome1, String nome2){
		int comp = nome1.compareToIgnoreCase(nome2);
		return comp;
	}
	
	
	

	public Nodo getPaiProcurado(){
		return paiProcurado;
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


