package model;

public class Nodo {
	
	private Contato contato;
	private Nodo filhoEsquerdo;
	private Nodo filhoDireito;
	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Nodo getFilhoEsquerdo() {
		return filhoEsquerdo;
	}

	public void setFilhoEsquerdo(Nodo filhoEsquerdo) {
		this.filhoEsquerdo = filhoEsquerdo;
	}

	public Nodo getFilhoDireito() {
		return filhoDireito;
	}

	public void setFilhoDireito(Nodo filhoDireito) {
		this.filhoDireito = filhoDireito;
	}

}
