package model;


public class Vertices {
	
	private int vertice;
	private int anterior;
	private double x;
	private double y;
	private double distancia;
	private boolean visitado = false;

	//construtor 
	public Vertices() {
//		super();
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
