package heapsort.view;

import java.util.ArrayList;

public class Imprime {
	
	
	//@SuppressWarnings({ "unchecked", "rawtypes" })
	
	/*public void inicio(){
		Scanner scan = new Scanner(System.in);
		ArrayList vet = new ArrayList<>();
		int numero = 0;
		
		Vetor vetor = new Vetor();
		
		System.out.println("Digite 2 para iniciar com numeros pré definidos ou 9 para inserir seus numeros");
		
		int escolha = scan.nextInt();
		if(escolha == 9){
			System.out.println("digites os numeros a serem inseridos. E -1 para parar. ");
			numero = scan.nextInt();
			vet.add(numero);
			
			while (numero != -1 ){
				for(int i = 1; numero != -1; i++){
					numero = scan.nextInt();  
					
					if(numero == -1){
						escolha = -1;
						vetor.setVetor(vet);
						break;
					}else{
						vet.add(numero);
					}
					
				}
				
			}
			
		}else if(escolha == 2){
			vetor.iniciaVetor();
		
		}else{
			System.out.println("Não válido");
		}
		
	}*/
	
	
	public void imprimeVetor(ArrayList<Integer> vetor, int troca, int compara){
		System.out.printf("Foram realizadas %d trocas e %d comparações \n", troca, compara);
		for(int i = 0; i < vetor.size(); i++){
			System.out.println(vetor.get(i));
		}
		System.out.println("-------------------");
	}

}
