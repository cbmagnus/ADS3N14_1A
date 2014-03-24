public class Menu {
	
	public static void ajuda(){
		System.out.println("\ncontatos para mostrar contatos");
		System.out.println("inserir para inserir contato");
		System.out.println("excluir para apagar contato");
		System.out.println("sair");
	}
	
	public void menu(){
		String opcao;
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		do{
			opcao = sc.nextLine();
			switch(opcao){
			case "agenda": 
				controller.imprimeLista();
				break;
				
			case "inserir":
				
				
			case "excluir":
				
				
			case "ajuda":
				ajuda();
				break;
				
			case "sair":
				System.exit(0);
				break;
				
			default:
				System.out.println("\nopção invalida digite uma das opções ou ajuda para mostra-las");
				break;
			}
		}while(!opcao.equals("sair"));
		System.exit(0);
	}
}
