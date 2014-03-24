package controle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import view.ConsoleView;

public class Controller {
	
	private ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();
	private ConsoleView view = new ConsoleView();
	private String nomeArq = ("C:/Users/net_darlan/Desktop/lista.txt");
	private StringTokenizer st = null;
	
	public void iniciaLista() {
		//verifica se existe arquivo
		File arq = new File(nomeArq);
		if (!arq.exists()){
			view.ArqNaoEncontrado();
		}
		
        try {
        	//abrindo arquivo para leitura
			FileReader reader = new FileReader(nomeArq);
			 //leitor do arquivo
	        BufferedReader leArq = new BufferedReader(reader);
	        
	        String linha = leArq.readLine();
	        //o token "," define quando termina a primeira frase.
	        while (linha != null) {
	        	st = new StringTokenizer(linha, ",");
	        	while(st.hasMoreTokens()){
	        		Nodo um = new Nodo();
	        		String nome = st.nextToken();
	        		String numero = st.nextToken();
	        		um.setNome(nome);
	        		um.setTelefone(numero);
					lista.insert(um);
					linha = leArq.readLine();
	        	}
	        }
	        
		} catch (FileNotFoundException e) {
			System.err.println("erro ao ler");
		} catch (IOException e) {
			System.out.println("erro no arquivo. (controller linha 35)");
		}
        
	}

	public void imprimeLista() {
		Nodo nodo = lista.getHead();
		while (nodo != null) {
			view.imprime(nodo.getNome(), nodo.getTelefone());
			nodo = nodo.getNext();
		}
	}

}
