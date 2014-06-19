package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Leitura {

	public void leitura() throws FileNotFoundException{
		String file = "C:/Users/fast shop/Desktop/dijkstra trabalho final.txt";
		Scanner scan = new Scanner(new FileReader(file)).useDelimiter(",|\n");


		while (scan.hasNext()) {
			String nome = scan.next();
			String rg = scan.next();
			String cpf = scan.next();
		}
	}
}
