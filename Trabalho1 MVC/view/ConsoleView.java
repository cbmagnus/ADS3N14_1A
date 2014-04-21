package view;

public class ConsoleView {

	public <T> void imprime(T nome, T numero) {
		System.out.println("\n" + nome);
		System.out.println(numero);
	}
	
	/*public void ArqEncontrado(){
		System.out.println("Arquivo encontrado");
	}*/
	
	public void ArqNaoEncontrado(){
		System.out.println("Arquivo não encontrado");
	}
	

}