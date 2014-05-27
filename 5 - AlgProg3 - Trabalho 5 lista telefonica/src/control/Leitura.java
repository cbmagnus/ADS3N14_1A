package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Nodo;

public class Leitura {
	
	Busca b = new Busca();
	Arvore ar = new Arvore();
	String arquivo = "C:/Users/net_darlan/Desktop/listaDesordenada.txt";
	
	public void carregaContatos(Arvore novaArvore){ // --------------------------------carrega lista de contatos da area de trabalho
		String nome;
		int fone;
		Scanner ler = null;
		File arq = new File(arquivo);
		try {
			ler = new Scanner(arq);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while(ler.hasNext()){ // -------------------------- enquanto tiver linha as variaveis vao recendo os valores e inserindo na arvore
			nome = ler.next(); // --------- perguntar para professor porque do erro do nextLine() nao funcionar (não pega o proximo contato)
			fone = ler.nextInt();
			novaArvore.insere(nome, fone);
		}
		ler.close();
	
	} // Fim do carrega lista
	
	
	
	// ver como gravar um arquivo na ultima posição do .txt
	public void exporta(Nodo novo, ArrayList<Nodo> list) throws IOException{ // --------------- Grava novo contato no txt ou exclui
		FileWriter arq = new FileWriter(arquivo);
		PrintWriter gravarArq = new PrintWriter(arq);
		while(!list.isEmpty()){
			gravarArq.printf("%s%n%s%n", list.get(0).getContato().getNome(), list.get(0).getContato().getNumero());
			list.remove(0); // ------------------------------ removo o primeiro nodo da lista para dar fim ao loop e poder imprmir o proximo
		}
		gravarArq.close();
		arq.close();
	} // fim do metodo exporta
	
} // fim da classe.
