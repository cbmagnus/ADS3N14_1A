package controller;

import java.util.List;

import model.Arestas;
import model.Vertices;

public class Matriz {

	private Arestas[][] mat = new Arestas[50][50]; 
	
	Arestas ar = new Arestas();
	Vertices vert = new Vertices();
	
	public void populaMatriz(){
		List lista = ar.getListArestas(); // variavel para trabalhar com a lista de arestas
		// enquanto a lista de aresta tiver algo continua loop
		while(!lista.isEmpty()){ 
			// linha primeiro numero da lista coluna 2º numero da lista recebe o custo DOUBLE
			mat[lista.indexOf(0)][lista.indexOf(1)] = (Arestas)lista.indexOf(2);
			//apago os 3 primeiro numeros da lista e assim ppor diante
			lista.remove(0);
			lista.remove(1);
			lista.remove(2);
		}
		ar.setMatriz(mat);
	}
	
}
