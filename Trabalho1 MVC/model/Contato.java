package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import controle.Controller;

public class Contato {
	private String nome;
	private String telefone;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setTelefone(String fone){
		this.telefone = fone;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void insereContato(String nome, String fone){
		Controller controller = new Controller();
		try {
			String arquivo = "C:/Users/net_darlan/Desktop/lista.txt";
			FileWriter fw = new FileWriter(arquivo);
			BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true)); 
			System.out.println("teste222");
			bw.write(nome + "," + fone);
			bw.newLine();
			bw.close();
			fw.close();
			controller.iniciaLista();
			
		} catch (IOException e) {
			System.out.println("erro na gravação do arquivo");
		}
		
	}

}
