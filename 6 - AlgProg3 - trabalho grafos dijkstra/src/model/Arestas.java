package model;

import java.util.ArrayList;
import java.util.List;

public class Arestas {
	
	private double custo;
	private int vertX;
	private int vertY;
	private List<Arestas> listArestas = new ArrayList<Arestas>(); //lista de arestas pra popular a matriz
	private Vertices[][]  matriz = new Vertices[50][50];

	
	//construtor para receber valores (acho que não usaremos);
	public Arestas(double custo, int vertX, int vertY, Vertices[][] matriz,
			List<Arestas> listArestas) {
		super();
		this.custo = custo;
		this.vertX = vertX;
		this.vertY = vertY;
		this.matriz = matriz;
		this.listArestas = listArestas;
	}
	//construtor passando os valores existentes
	public Arestas() {
		super();
		getCusto();
		getListArestas();
		getMatriz();
		getVertX();
		getVertY();
	}

	
	
	
	//getters and setters
	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public int getVertX() {
		return vertX;
	}

	public void setVertX(int vertX) {
		this.vertX = vertX;
	}

	public int getVertY() {
		return vertY;
	}

	public void setVertY(int vertY) {
		this.vertY = vertY;
	}

	public Vertices[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Vertices[][] matriz) {
		this.matriz = matriz;
	}

	public List<Arestas> getListArestas() {
		return listArestas;
	}

	public void setListArestas(List<Arestas> listArestas) {
		this.listArestas = listArestas;
	}
	
	
}
