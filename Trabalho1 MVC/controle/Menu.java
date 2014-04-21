package controle;

import java.util.Scanner;

import model.Contato;

public class Menu {
	
	public static void ajuda(){
		System.out.println("\nagenda para mostrar contatos");
		System.out.println("inserir para inserir contato");
		System.out.println("excluir para apagar contato");
		System.out.println("sair");
	}
	
	public void menu(){
		String opcao;
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		Contato contato = new Contato();
		controller.iniciaLista();
		
		do{
			opcao = sc.nextLine();
			switch(opcao){
			case "agenda": 
				controller.imprimeLista();
				break;
				
			case "inserir":
				System.out.println("Digite o nome a ser inserido: ");
				String nome = sc.nextLine();
				System.out.println("Digite o Telefone: ");
				String telefone = sc.nextLine();
				contato.insereContato(nome, telefone);
				break;
				
			case "excluir":
				break;
				
			case "ajuda":
				ajuda();
				break;
				
			case "sair":
				System.exit(0);
				break;
				
			default:
				System.out.println("\nopção invalida digite uma das opções ou ajuda para mostra-las");
				break;
			}
		}while(!opcao.equals("sair"));
		System.exit(0);
	}
}
