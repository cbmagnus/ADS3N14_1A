package control;

import java.util.Scanner;

import view.Imprime;

public class Executa {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Arvore ar = new Arvore();
		Imprime imp = new Imprime();
		Leitura ler = new Leitura();
		
		String nome;
		int fone;
		int opcao;
		
		ler.carregaLista();
		
		do{
			Scanner scan = new Scanner(System.in);
			System.out.println("\nDigite 1 para ADICIONAR contato");
			System.out.println("Digite 2 para PROCURAR contato");
			System.out.println("Digite 3 para DELETAR contato");
			System.out.println("Digite 5 para Travessia prefixa");
			System.out.println("Digite 6 para Travessia infixa");
			System.out.println("Digite 7 para Travessia posfixa");
			System.out.println("Digite 8 para Busca em Largura");
			System.out.println("Digite 9 para Busca em Profundidade");
			System.out.println("Digite 0 para sair \n");
			
			System.out.println("Qual sua opção? : ");
			opcao = scan.nextInt();
			
			switch (opcao) {
			
			case 1: // ------------------------------------------------------ ADICIONA
				System.out.println("Digite o NOME do contato: ");
				scan = new Scanner(System.in);
				nome = scan.nextLine();
				System.out.println("Digite o NUMERO do contato: ");
				scan = new Scanner(System.in);
				fone = scan.nextInt();
				ar.insere(nome, fone);
				break;

			case 2: // ------------------------------------------------------ PROCURA
				System.out.println("Digite o NOME do contato: ");
				scan = new Scanner(System.in);
				nome = scan.nextLine();
				//ar.pesquisa(nome);
				imp.mostraNodo(ar.pesquisa(nome));
				break;

			case 3: // ------------------------------------------------------ DELETAR
				System.out.println("Digite o NOME do contato: ");
				scan = new Scanner(System.in);
				nome = scan.nextLine();
				ar.apaga(nome);
				break;
				
				
			case 0:
				System.out.println("Tchau");
				System.exit(0);
				break;
				
			default:
				System.out.println("Opção invalida");
				break;
			}
			
		}while(opcao != 0);
		
		
	}
}

/*
Arvore ar = new Arvore();
Scanner scan = new Scanner(System.in);

for(int i = 0; i < 3; i ++){
	Scanner sc = new Scanner(System.in);
	System.out.println("nome ");
	String nom = sc.nextLine();
	System.out.println("numero ");
	int num = sc.nextInt();

	ar.insere(nom, num);
}
ar.imp.mostraArvore(ar.getRaiz());

System.out.println("nome ");
String nomee = scan.nextLine();
//ar.pesquisa(nomee);

ar.imp.mostraNodo(ar.pesquisa(nomee));

System.out.println("Digite o nome a apagar");
String nome1 = scan.nextLine();
ar.apaga(nome1);

scan.close();

*/