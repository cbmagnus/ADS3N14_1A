package trabalho1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = scan.nextLine();
		
		System.out.printf("Hello %s", nome);

	}

}
