package model;

import java.io.IOException;

import controller.CalculaDistancia;
import controller.Leitura;
import controller.Matriz;

import view.Pergunta;

public class Main {

	public static void main(String[] args) throws IOException {
		CalculaDistancia c = new CalculaDistancia();
		Leitura ler = new Leitura();
		Pergunta pergunta = new Pergunta();
		Matriz matriz = new Matriz();
		
		
		ler.leitura();
		ler.mostraTeste();
		matriz.mostraListas();
		
		
//		pergunta.pergunta();
//		double a = c.calcDist(8.0, 6.0, 8.0, 6.0);
//		System.out.println(a);
		
		
	}

}
