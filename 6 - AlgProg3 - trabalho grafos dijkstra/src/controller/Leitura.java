package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import model.Arestas;
import model.Vertices;

public class Leitura {

	public void leitura() throws FileNotFoundException{
		
//		Vertices vertice = new Vertices();
		Matriz matriz = new Matriz();
		CalculaDistancia dist = new CalculaDistancia();
		
		String file = "C:/Users/fast shop/Desktop/dijkstra trabalho final.txt";
		Scanner scan = new Scanner(new FileReader(file)).useDelimiter(",|\n ");

		String cond = "arestas";
		while (scan.hasNext()) {
			while(!scan.nextLine().equals("arestas")){
				Vertices vertice = new Vertices();
				
				vertice.setVertice(scan.nextInt());
				vertice.setX(scan.nextDouble());
				vertice.setY(scan.nextDouble());
				vertice.setAnterior(-1);
				
				matriz.listVert.add(vertice);
			}
			while(scan.hasNext()){
				Arestas ar = new Arestas();
				
				ar.setVertX(scan.nextInt());
				ar.setVertY(scan.nextInt());
				ar.setCusto(scan.nextDouble());
				
				matriz.listArestas.add(ar);
			}
		}
	}
}
