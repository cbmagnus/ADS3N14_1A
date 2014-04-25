package control;

import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		
		Arvore ar = new Arvore();
		
		for(int i = 0; i < 3; i ++){
			Scanner sc = new Scanner(System.in);
			System.out.println("nome ");
			String nom = sc.nextLine();
			System.out.println("numero ");
			int num = sc.nextInt();

			ar.insere(nom, num);
		}
		ar.imp.mostraArvore(ar.getRaiz());

	}

}
