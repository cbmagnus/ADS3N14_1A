package control;

import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		
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
		ar.pesquisa(nomee);
		
		ar.imp.mostraNodo(ar.getRaiz());
		
		scan.close();

	}

}
