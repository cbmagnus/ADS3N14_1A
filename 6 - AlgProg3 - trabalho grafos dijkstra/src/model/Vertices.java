package model;

import java.util.List;
import java.util.ArrayList;

public class Vertices {
	
	private int vertice;
	private int anterior;
	private double x;
	private double y;
	private double distancia;
	private boolean visitado = false;
	
	//construtor para receber valores (acho que não usaremos);
	public Vertices(int vertice, int anterior, double x, double y,
			double distancia, boolean visitado) {
		super();
		this.vertice = vertice;
		this.anterior = anterior;
		this.x = x;
		this.y = y;
		this.distancia = distancia;
		this.visitado = visitado;
	}

	//construtor passando os valores existentes
	public Vertices() {
		super();
		getAnterior();
		getDistancia();
		getVertice();
		getX();
		getY();
	}
	
	
	//getters and setters
	public int getVertice() {
		return vertice;
	}
	public void setVertice(int vertice) {
		this.vertice = vertice;
	}
	public int getAnterior() {
		return anterior;
	}
	public void setAnterior(int anterior) {
		this.anterior = anterior;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public boolean isVisitado() {
		return visitado;
	}
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	
}
