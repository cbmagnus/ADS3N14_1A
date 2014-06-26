package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import view.Mensagens;

import model.Arestas;
import model.Vertices;

public class Leitura {

	private List<Arestas> listAr = new ArrayList<Arestas>(); // listas secundarias
	private List<Vertices> listVert = new ArrayList<Vertices>(); // listas secundarias
	
	Matriz matriz = new Matriz(); //passo pra matriz as listas preenchidas
	
	
	public void leitura() throws FileNotFoundException{

		String file = "C:/Users/fast shop/Desktop/dijkstra trabalho final.txt";
		Scanner scan = new Scanner(new FileReader(file));//.useDelimiter(" |\n");// ",|\n"   \\s*vertices\\s*

		do{
			String linha = scan.nextLine();
			if(linha.equalsIgnoreCase("vertices")){
				linha = scan.nextLine();

				while(scan.hasNext() && !linha.equalsIgnoreCase("arestas")){ // enquanto tiver algo o arquivo executa

					Vertices vertice = new Vertices();
					String[] vert = linha.split(" ");

					//adiciono a lista os valores existentes no vetor de Strings convertendo para os respectivos tipos
					vertice.setVertice(Integer.parseInt(vert[0]));
					vertice.setX(Double.parseDouble(vert[1]));
					vertice.setY(Double.parseDouble(vert[2]));
					vertice.setAnterior(-1);

					listVert.add(vertice); //adiciona a lista o novo vertice
					
					linha = scan.nextLine(); // pega proxima linha
				}
				
				if(linha.equalsIgnoreCase("arestas")){
					linha = scan.nextLine(); // pega proxima linha

					while(linha != null){ // enquanto tiver algo o arquivo executa
						Arestas aresta = new Arestas();
						//Separa em cada posição do vetor o que tiver na string "linha" separadas por " " espaço em branco
						String[] ar = linha.split(" ");

						//adiciono a lista os valores existentes no vetor de Strings convertendo para os respectivos tipos
						aresta.setVertX(Integer.parseInt(ar[0]));
						aresta.setVertY(Integer.parseInt(ar[1]));
						aresta.setCusto(Double.parseDouble(ar[2]));

						listAr.add(aresta); //adiciona a lista a nova aresta
						
						if(scan.hasNext()){
							linha = scan.nextLine();// pega proxima linha
						}else{
							linha = null;
						}
					}
				}
			}
			else{
				Mensagens msg = new Mensagens();
				msg.erroLeitura();
			}
		
		}while(scan.hasNext());
		scan.close();
		
		matriz.setListArestas(listAr);
		matriz.setListVert(listVert);		

	}
	
	
	
	
	// getMatriz para buscar ela preenchida na classe main (Gambiarra)...
	public Matriz getMatriz(){
		return matriz;
	}
	
	
	
}
