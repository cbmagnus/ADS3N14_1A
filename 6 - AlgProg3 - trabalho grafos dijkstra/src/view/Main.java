package view;

import java.io.IOException;

import controller.CalculaDistancia;
import controller.Leitura;
import controller.Matriz;


public class Main {

	public static void main(String[] args) throws IOException {
//		CalculaDistancia c = new CalculaDistancia();
		Leitura ler = new Leitura();
//		Pergunta pergunta = new Pergunta();
		
		
		ler.leitura();
		ler.getMatriz().populaMatriz();
		
		
//		pergunta.pergunta();
//		double a = c.calcDist(8.0, 6.0, 8.0, 6.0);
//		System.out.println(a);
		
		
	}

}
