package trabalho1;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Qual seu nome?");
		Pessoa pessoa = new Pessoa();
		
		System.out.printf("Hello %s", pessoa.nome);

	}

}
