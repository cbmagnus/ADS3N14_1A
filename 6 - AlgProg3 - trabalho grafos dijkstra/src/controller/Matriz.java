package controller;

import java.util.ArrayList;
import java.util.List;

import model.Arestas;
import model.Vertices;

public class Matriz {

	List<Arestas> listArestas = new ArrayList<Arestas>(); //lista de arestas pra popular a matriz
	List<Vertices> listVert = new ArrayList<Vertices>();
	
	
	public Matriz(List<Arestas> listArestas, List<Vertices> listVert) {
		super();
		this.listArestas = listArestas;
		this.listVert = listVert;
	}



	Arestas ar = new Arestas();
	Vertices vert = new Vertices();
	// a matriz tera o tamanho que tiver a lista de vertices
	private Double[][]  matriz = new Double[listVert.size()][listVert.size()];

	
	
	
	
	public void populaMatriz(){
		List<Arestas> listaArestas = listArestas; // variavel para trabalhar com a lista de arestas
		// enquanto a lista de aresta tiver algo continua loop
		while(!listaArestas.isEmpty()){ 
			// 1º valor da lista na linha. 2º valor na lista é a coluna este ponto recebe o custo (DOUBLE) IDA E VOLTA
			matriz[listaArestas.indexOf(0)][listaArestas.indexOf(1)] = (double) listaArestas.indexOf(2);
			matriz[listaArestas.indexOf(1)][listaArestas.indexOf(0)] = (double) listaArestas.indexOf(2);
			//apago os 3 primeiro numeros da lista e assim ppor diante
			listaArestas.remove(0);
			listaArestas.remove(1);
			listaArestas.remove(2);
		}
	}
	
	
	
	
	
	
	
}
