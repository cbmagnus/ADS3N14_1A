package view;

import java.util.Scanner;

public class InformeContato {

	String nome;
	String fone;
	
	public void informaPesquisa(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		nome = scan.nextLine();
		nome = nome.toLowerCase();
	}
	
	public String getNome(){
		return this.nome;
	}
	
}
