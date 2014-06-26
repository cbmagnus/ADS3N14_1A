package controller;

import java.util.ArrayList;
import java.util.List;

import model.Arestas;
import model.Vertices;

public class Matriz {

	private List<Arestas> listArestas = new ArrayList<Arestas>(); //lista de arestas pra popular a matriz
	private List<Vertices> listVert = new ArrayList<Vertices>();
	
	// a matriz tera o tamanho que tiver a lista de vertices
	private Double[][]  matriz = new Double[listVert.size()][listVert.size()];

	//construtor
	public Matriz(List<Arestas> listArestas, List<Vertices> listVert) {
		super();
		this.listArestas = listArestas;
		this.listVert = listVert;
	}
	
	
	public Matriz() {
		super();
	}






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
	
	
	
	
	
	
	public void mostraListas(){
		System.out.println(listVert.size());
		System.out.println(listArestas.size());
	}






	public List<Arestas> getListArestas() {
		return listArestas;
	}

	public void setListArestas(List<Arestas> listArestas) {
		this.listArestas = listArestas;
	}

	public List<Vertices> getListVert() {
		return listVert;
	}

	public void setListVert(List<Vertices> listVert) {
		this.listVert = listVert;
	}

	public Double[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Double[][] matriz) {
		this.matriz = matriz;
	}
		
}
