package model;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private String telefone;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	@Override
	public int compareTo(Pessoa pessoa) {
		if(this.nome.compareTo(pessoa.nome) < 0){
			return -1;
		}
		else if(this.nome.compareTo(pessoa.nome) > 0){
			return 1;
		}
		return this.getNome().compareToIgnoreCase(pessoa.getNome());
	}

}