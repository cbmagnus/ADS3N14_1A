package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Arestas;
import model.Vertices;

public class Leitura {

	public void leitura() throws FileNotFoundException{
		
		CalculaDistancia dist = new CalculaDistancia();
		
		List<Arestas> listAr = new ArrayList<Arestas>(); // listas secundarias
		List<Vertices> listVert = new ArrayList<Vertices>(); // listas secundarias
		
		String file = "C:/Users/fast shop/Desktop/dijkstra trabalho final.txt";
		Scanner scan = new Scanner(new FileReader(file)).useDelimiter(" |\n");// ",|\n"   \\s*vertices\\s*

		
		while(scan.hasNext() || scan.nextLine().equals("vertices")){
			Vertices vertice = new Vertices();

			if(scan.nextLine().equals("vertices")){
			
			}
			System.out.println(scan.next());
			System.out.println(scan.next());
			System.out.println(scan.next());


			vertice.setVertice(scan.nextInt());
			vertice.setX(scan.nextDouble());
			vertice.setY(scan.nextDouble());
			vertice.setAnterior(-1);

			listVert.add(vertice);
		}
		while(scan.hasNext() || scan.nextLine().equals("arestas")){
			Arestas ar = new Arestas();

			ar.setVertX(scan.nextInt());
			ar.setVertY(scan.nextInt());
			ar.setCusto(scan.nextDouble());

			listAr.add(ar);
		}
		scan.close();
		Matriz matriz = new Matriz(listAr, listVert);
	}
}
