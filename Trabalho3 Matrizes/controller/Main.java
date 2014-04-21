package controller;


import view.ImprimeTabuleiro;

public class Main {
	
	public static void main(String[] args) {
	
		Tabuleiro T = new Tabuleiro();
		ImprimeTabuleiro impTab = new ImprimeTabuleiro();
		Navio navios = new Navio();
		
		
		T.iniciaTabuleiro(T.getTabuleiro());
		impTab.imprimeTabuleiro(T.getTabuleiro());
		T.darTiro();
		T.alteraTabuleiro(T.getTiro(), navios.getSubmarino(), T.getTabuleiro());
		impTab.imprimeTabuleiro(T.getTabuleiro());
		
		
		
		
		/*
		navios.iniciaNavios(navios.portaAviao(), 1);
		
		
		do{
			impTab.imprimeTabuleiro(T.getTabuleiro());
            tiro.darTiro();
            T.setTentativas(T.getTentativas() + 1);
            
            
            if(tiro.acertou(T.getTiro(), T.getNavios())){
            	T.dica(T.getTiro(),T.getNavios(),T.getTentativas());
                T.setAcertos(T.getAcertos() + 1);
            }                
            else{
                T.dica(T.getTiro(),T.getNavios(),T.getTentativas());
            }
            
            T.alteraTabuleiro(T.getTiro(), T.getNavios(), T.getTabuleiro());
            

        }while(T.getAcertos() != 5);
        
        System.out.println("\n\n\nJogo terminado. Você acertou os 3 navios em "+ T.getTentativas()+" tentativas");
        impTab.imprimeTabuleiro(T.getTabuleiro());
		
		
		
*/
	}

}
