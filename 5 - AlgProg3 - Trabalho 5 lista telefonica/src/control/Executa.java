package control;

import java.io.IOException;
import java.util.Scanner;

import model.Nodo;
import view.Imprime;
import view.Travessias;

public class Executa {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Arvore ar = new Arvore();
		Imprime imp = new Imprime();
		Leitura ler = new Leitura();
		Travessias trav = new Travessias();
		Busca busca = new Busca();
		
		String nome;
		int fone;
		int opcao;
		
		ler.carregaContatos(ar);
		
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
			
			case 1: // ------------------------------------------------------------------- ADICIONA
				System.out.println("Digite o NOME do contato a ser inserido: ");
				scan = new Scanner(System.in);
				nome = scan.nextLine();
				System.out.println("Digite o NUMERO do contato: ");
				scan = new Scanner(System.in);
				fone = scan.nextInt();
				ar.insere(nome, fone);
				System.out.println("Contato inserido com sucesso!");
				break;

			case 2: // -------------------------------------------------------------------- PROCURA
				System.out.println("Digite o NOME do contato a ser pesquisado: ");
				scan = new Scanner(System.in);
				nome = scan.nextLine();
				Nodo n = ar.pesquisa(nome);
				if(n != null){
					imp.mostraNodo(n);
				}
				break;

			case 3: // -------------------------------------------------------------------- DELETAR
				System.out.println("Digite o NOME do contato a ser deletado: ");
				scan = new Scanner(System.in);
				nome = scan.nextLine();
				ar.apaga(nome);
				break;
				
			case 5:
				System.out.println("Travessia Prefixa.\n");
				trav.prefixa(ar.getRaiz());
				break;
				
			case 6:
				System.out.println("Travessia Infixa.\n");
				trav.infixa(ar.getRaiz());
				break;
				
			case 7:
				System.out.println("Travessia Posfixa.\n");
				trav.posfixa(ar.getRaiz());
				break;
				
			case 8:
				System.out.println("Lista por Largura.\n");
				busca.largura(ar.getRaiz());
				break;
				
			case 9:
				System.out.println("Lista por Profundidade.\n");
				
				break;
				
			case 0:
				System.out.println("Tchau");
				try {
					Leitura le = new Leitura();
					le.exporta(ar.getRaiz(), busca.getListaLargura());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
				break;
				
			default:
				System.out.println("Opção invalida");
				break;
			}
			
		}while(opcao != 0);
		
		
	}
}
