package view;

import java.io.IOException;

import controller.Leitura;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Leitura ler = new Leitura();
		Pergunta pergunta = new Pergunta();
		
		ler.leitura();
		ler.getMatriz().populaMatriz();
		
		pergunta.pergunta();

		ler.getMatriz(pergunta.getVerticePartida(), pergunta.getVerticeChegada());
		
	}

}
