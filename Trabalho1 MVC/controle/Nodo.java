package controle;

public class Nodo<T> {
	private T nome;
	private T telefone;
	private Nodo<T> next;

	public Nodo()
	{
		nome = null;
		telefone = null;
		next = null;
	}

	public T getNome() {
		return nome;
	}

	public void setNome(T nome) {
		this.nome = nome;
	}
	
	public T getTelefone() {
		return telefone;
	}

	public void setTelefone(T telefone) {
		this.telefone = telefone;
	}

	public Nodo<T> getNext() {
		return next;
	}

	public void setNext(Nodo<T> next) {
		this.next = next;
	}
}
