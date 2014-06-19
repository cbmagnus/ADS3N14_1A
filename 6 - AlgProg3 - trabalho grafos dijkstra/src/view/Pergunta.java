package view;

import java.util.Scanner;

public class Pergunta {

	int verticePartida;
	int verticeChegada;
	
	public void pergunta(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha qual vertice de partida: ");
		verticePartida = scan.nextInt();
		
		System.out.println("Escolha qual vertice que deseja chegar: ");
		verticeChegada = scan.nextInt();
	}
	
	
	public int getVerticePartida(){
		return this.verticePartida;
	}
	
	public int getVerticeChegada(){
		return this.verticeChegada;
	}
	
}
