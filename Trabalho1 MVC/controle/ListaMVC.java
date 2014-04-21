package controle;

public class ListaMVC {

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		Menu menu = new Menu();
		//controller.iniciaLista();
		controller.imprimeLista();
		menu.ajuda();
		menu.menu();
		
	}

}