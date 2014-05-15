package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import model.Nodo;

public class Leitura {
	
	Arvore ar = new Arvore();
	String arquivo = "C:/Users/net_darlan/Desktop/listaDesordenada.txt";
	
	public void carregaContatos(Arvore novaArvore){ // ------------------------------------------carrega lista de contatos da area de trabalho
		String nome;
		int fone;
		Scanner ler = null;
		File arq = new File(arquivo);
		try {
			ler = new Scanner(arq);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while(ler.hasNext()){ // ------------------------------ enquanto tiver linha as variaveis vao recendo os valores e inserindo na arvore
			nome = ler.next(); // ----------------------------- perguntar para professor porque do erro do nextLine() nao funcionar (não pega o proximo contato)
			fone = ler.nextInt();
			novaArvore.insere(nome, fone);
		}
		ler.close();
	
	} // Fim do carrega lista
	
	
	
	// ver como gravar um arquivo na ultima posição do .txt
	public void exporta(Nodo novo) throws IOException{ // --------------- Grava novo contato no txt ou exclui
		FileWriter arq = new FileWriter(arquivo);
		PrintWriter gravarArq = new PrintWriter(arq); // ----------------- variavel para gravar contato no .txt
		System.out.println(novo.getContato());
		for(int i = 0; i < ar.getContaNodo(); i++){ // ------------------- enquanto for menor que o numero de nodos vai gravando
			gravarArq.printf("%s%n%s%n", novo.getContato().getNome(), novo.getContato().getNumero());
		}
		gravarArq.close();
	} // fim do metodo exporta
	
} // fim da classe.
