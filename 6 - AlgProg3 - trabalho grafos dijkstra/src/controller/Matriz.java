package controller;

import java.util.ArrayList;
import java.util.List;

import model.Arestas;
import model.Vertices;

public class Matriz {

	private List<Arestas> listArestas; //lista de arestas pra popular a matriz
	private List<Vertices> listVert; //lista de certices pra popular a matriz
	// a matriz tera o tamanho que tiver a lista de vertices
	private Double[][] matriz;

	
	// Construtor
	public Matriz() {
		listArestas = new ArrayList<Arestas>();
		listVert = new ArrayList<Vertices>();
		matriz = new Double[listVert.size()][listVert.size()];
	}
	
	




	public void populaMatriz(){
		List<Arestas> listaArestas = listArestas; // variavel para trabalhar com a lista de arestas
		matriz = new Double[listVert.size()][listVert.size()];
		
		// enquanto a lista de aresta tiver algo continua loop
		while(!listaArestas.isEmpty()){ 
			// 1º valor da lista na linha. 2º valor na lista é a coluna este ponto recebe o custo (DOUBLE) IDA E VOLTA
			matriz[listaArestas.get(0).getVertX()][listaArestas.get(0).getVertY()] = listaArestas.get(0).getCusto();
			matriz[listaArestas.get(0).getVertY()][listaArestas.get(0).getVertX()] = listaArestas.get(0).getCusto();
			//apago os 3 primeiro numeros da lista e assim ppor diante
			listaArestas.remove(0);
		}
		System.out.println(matriz[0][1]);
		System.out.println(matriz[0][2]);
		System.out.println(matriz[0][3]);
		System.out.println(matriz[1][2]);
		System.out.println(matriz[1][3]);
		System.out.println(matriz[2][3]);
	}
	
	
	






	public List<Arestas> getListArestas() {
		return listArestas;
	}

	public void setListArestas(List<Arestas> listAresta) {
		this.listArestas = listAresta;
	}

	public List<Vertices> getListVert() {
		return listVert;
	}

	public void setListVert(List<Vertices> listVert) {
		this.listVert = listVert;
	}
		
}
