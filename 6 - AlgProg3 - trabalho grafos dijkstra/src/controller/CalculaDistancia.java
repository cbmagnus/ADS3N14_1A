package controller;

public class CalculaDistancia {

	public double calcDist(Double x1, Double x2, Double y1, Double y2){
		double distancia = Math.sqrt( (Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
		return distancia;
	}
	
}
