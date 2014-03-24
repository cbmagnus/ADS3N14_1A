package controle;

import model.ListaEncadeada;


public class ListaOrdenada<T extends Comparable<T>>	extends ListaEncadeada<T>
{	
	public Nodo<T> procuraNodo(Nodo<T> needle)
	{
		Nodo<T> atual = getHead();
		Nodo<T> anterior = null;
		T nomeNeedle = needle.getNome();

		while (atual != null) {
			T nomeAtual = atual.getNome();
			int cmp = nomeNeedle.compareTo(nomeAtual);
			if (cmp == 0)
				return atual; 
			if (cmp < 0)
				return anterior;
			anterior = atual;
			atual = atual.getNext();
		}
		return anterior;
	}

	@Override
	public void append(Nodo<T> novo) //adicionar
	{
		insert(novo);
	}

	@Override
	public void insert(Nodo<T> novo, Nodo<T> anterior)
	{
		insert(novo);
	}

	@Override
	public void insert(Nodo<T> novo)
	{
		Nodo<T> anterior = procuraNodo(novo);

		if (anterior == null) {
			novo.setNext(head);
			head = novo;
			if (tail == null)
				tail = novo;
		} else {
			novo.setNext(anterior.getNext());
			anterior.setNext(novo);
			if (tail == anterior)
				tail = novo;
		}

	}
}
