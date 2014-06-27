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
			
			//Variaveis para guardar valores das arestas
			int vertX = listaArestas.get(0).getVertX();
			int vertY = listaArestas.get(0).getVertY();
			double custo = listaArestas.get(0).getCusto();
			
			//variaveis para guardar valores para calcular o custo
			double x1 = listVert.get(vertX).getX();
			double x2 = listVert.get(vertX).getY();
			double y1 = listVert.get(vertY).getX();
			double y2 = listVert.get(vertY).getY();
			
			double total = (calcDist(x1, x2, y1, y2) + custo);
			
			// 1º valor da lista na linha. 2º valor na lista é a coluna este ponto recebe o custo (DOUBLE) IDA E VOLTA
			matriz[vertX][vertY] = total;
			matriz[vertY][vertX] = total;
			
			//apago o 1 primeiro numeros da lista e assim por diante
			listaArestas.remove(0);
		}
		System.out.println(matriz[0][1]);
		System.out.println(matriz[0][2]);
		System.out.println(matriz[0][3]);
		System.out.println(matriz[1][2]);
		System.out.println(matriz[1][3]);
		System.out.println(matriz[2][3]);
	}
	
	
	
	//cuidar para não colocar os valores na ordem errada
	public double calcDist(Double x1, Double x2, Double y1, Double y2){
		double distancia = Math.sqrt( (Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
		return distancia;
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
