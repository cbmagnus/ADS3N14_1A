package view;

import java.util.Scanner;

public class InformeContato {

	String nome;
	String fone;
	
	/*public ArrayList<Pessoa> informeContato(ArrayList<Pessoa> agenda){
		Pessoa pes = new Pessoa();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		pes.setNome(scan.nextLine());
		
		scan = new Scanner(System.in);
		System.out.println("Digite o telefone: ");
		pes.setTelefone(scan.nextLine());
		
		agenda.add(pes);
		return agenda;
	}*/
	
	public void informaPesquisa(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		nome = scan.nextLine();
		nome = nome.toLowerCase();
	}
	
	public String getNome(){
		return this.nome;
	}
	
	/*public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getTelefone(){
		return this.fone;
	}
	
	public void setTelefone(String fone){
		this.fone = fone;
	}*/
}
