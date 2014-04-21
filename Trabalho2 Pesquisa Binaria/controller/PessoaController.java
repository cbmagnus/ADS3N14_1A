package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import view.InformeContato;

import model.Pessoa;

public class PessoaController {
	InformeContato inform = new InformeContato();
	ArrayList<Pessoa> contatos = new ArrayList<Pessoa>();
	
	
	
	public void PPessoaController(ArrayList<Pessoa> agenda){
		this.contatos = agenda;
	}
	
	
	
	public void carregaLista() throws FileNotFoundException {
		File arq = new File("C:/Users/net_darlan/Desktop/lista.txt");
		Scanner ler = new Scanner(arq);
        
		while(ler.hasNext()){
			Pessoa pes = new Pessoa();
			
			pes.setNome(ler.nextLine());
			pes.setTelefone(ler.nextLine());
			
			contatos.add(pes);
        }    
        ler.close();
	}
	
	
	
	public ArrayList<Pessoa> insereContato(ArrayList<Pessoa> agenda){
		Pessoa pes = new Pessoa();
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		pes.setNome(scan.nextLine().toLowerCase());
		
		System.out.println("Digite o telefone: ");
		pes.setTelefone(scan.nextLine());
		
		agenda.add(pes);
		return agenda;
	}
	
	
	
	
	public void excluiContato(String nome){ 
	    for (int i = 0; i < contatos.size(); i++) {  
	        if (contatos.get(i).getNome().equals(nome) || contatos.get(i).getTelefone().equals(nome)) {  
	            contatos.remove(i);
	            return;
	        }
	    }
	    System.out.println("nome não encontrado");
	}
	
	
	
	public void procuraContatoBinario(String nome){
		int cont = 0;
		int inicio = 0;
		int fim = contatos.size();
		int metade = (inicio + fim) / 2;
		
		//enquanto diferente do eu procuro
		while( ! contatos.get(metade).getNome().equals(nome)){
				
				while(contatos.get(metade).getNome().compareTo(nome) < 0){
					cont = cont + 1;
					inicio = metade;
					metade = (inicio + fim) / 2;
					
					if (contatos.get(metade).getNome().equals(nome)) {
						break;
					}else if(cont > contatos.size()){
						System.out.println("usuário não encontrado");
						return;
					}
				}
				
				while(contatos.get(metade).getNome().compareTo(nome) > 0){
					cont = cont + 1;
					fim = metade;
					metade = (inicio + fim) / 2;
					if (contatos.get(metade).getNome().equals(nome)) {
						break;
					}else if(cont > contatos.size()){
						System.out.println("usuário não encontrado");
						return;
					}
				}
		}
		
			if (contatos.get(metade).getNome().equals(nome)) {
				cont ++;
				System.out.println("arquivo encontrado com " + cont + " comparações\n");
				System.out.printf("%s - %s \n", contatos.get(metade).getNome(), contatos.get(metade).getTelefone());	
			}
		
	}
	
	
	
	public void procurarContato(String nome){
		int cont = 0;
		for (int i = 0; i < contatos.size(); i++) { 
			cont ++; 
	        if (contatos.get(i).getNome().equals(nome) || contatos.get(i).getTelefone().equals(nome)) {  
	            System.out.printf("%s - %s \n", contatos.get(i).getNome(), contatos.get(i).getTelefone());  
	            System.out.printf("form realizadas %d comparações \n\n", cont);
	            return;
	        }
	    }  
		System.out.println("nome não encontrado \n");
	}
	
	
	
	public void mostraAgenda(){
		if(contatos.isEmpty()){
			System.out.println("Lista vazia");
		}else{
			for(Pessoa p : contatos){
				System.out.printf("%s - %s \n", p.getNome(), p.getTelefone());
			}
		}
	}
	
	
		
	public void exportar(ArrayList<Pessoa> agenda) throws IOException {
		FileWriter arq = new FileWriter("C:/Users/net_darlan/Desktop/lista.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		int i, n = agenda.size();
		for (i=0; i<n; i++) { 
			gravarArq.printf("%s%n%s%n", agenda.get(i).getNome(), agenda.get(i).getTelefone());
			}
		gravarArq.close();
	}	
}