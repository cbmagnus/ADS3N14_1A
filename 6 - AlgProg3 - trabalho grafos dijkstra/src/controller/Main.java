package controller;

import java.io.IOException;

import view.Pergunta;

public class Main {

	public static void main(String[] args) throws IOException {
		Leitura ler = new Leitura();
		Pergunta pergunta = new Pergunta();
		
		ler.leitura();
		
		pergunta.pergunta();
		
	}

}
