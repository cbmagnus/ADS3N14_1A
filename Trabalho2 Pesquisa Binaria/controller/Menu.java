package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

import view.InformeContato;

public class Menu {
	
	public void menu(){
		String opcao;
		PessoaController control = new PessoaController();
		InformeContato informe = new InformeContato();
		
		
		try {
			control.carregaLista();
		} catch (FileNotFoundException e) {
			System.out.println("Erro na leitura do arquivo");
			e.printStackTrace();
		}
		
		
		do{
			
			Collections.sort(control.contatos);
				
			System.out.println("\ndigite sua opção: inserir, procurar, apagar, mostrar, sair");
			Scanner scan = new Scanner(System.in);
			opcao = scan.nextLine();
			
			
			switch (opcao) {
			case "inserir":
				//informe.informeContato(control.contatos);
				control.insereContato(control.contatos);
				break;
				
			case "procurar":
				informe.informaPesquisa();
				//String x = (informe.getNome());
				control.procurarContato(informe.getNome());
				control.procuraContatoBinario(informe.getNome());
				break;
				
			case "apagar":
				informe.informaPesquisa();
				control.excluiContato(informe.getNome());
				break;
				
			case "mostrar":
				control.mostraAgenda();
				break;
				
			case "sair":
				try {
					control.exportar(control.contatos);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);

			default:
				System.out.println("Opção invalida");
				break;
			}
		}while(opcao != "sair");
	}
	
	

}
