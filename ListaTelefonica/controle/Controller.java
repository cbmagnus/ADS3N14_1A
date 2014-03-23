package controle;

import view.ConsoleView;

public class Controller {

	private ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();
	private ConsoleView view = new ConsoleView();

	public void iniciaLista() {
		for (int i = 0; i < 6; ++i) {
			Nodo<Integer> novo = new Nodo<Integer>();
			novo.setChave((int)(Math.random() * 60));
			lista.insert(novo);
		}
	}

	public void imprimeLista() {
		Nodo<Integer> nodo = lista.getHead();
		while (nodo != null) {
			view.imprimeInteiro(nodo.getChave());
			nodo = nodo.getNext();
		}
	}

}
