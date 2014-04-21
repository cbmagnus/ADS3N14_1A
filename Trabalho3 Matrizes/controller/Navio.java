package controller;

import java.util.Random;

public class Navio {

	private int[][] portaAvioes = new int[5][2];
	private int[][] destroyer = new int[4][1];
	private int[][] fragata = new int[3][1];
	private int[][] torpedeiro = new int[2][1];
	private int[][] submarino = new int[5][5];


	public void iniciaNavios(int[][] navios, int qtd){
        Random sorteio = new Random();
        
        for(int navio = 0 ; navio < qtd; navio ++){
            navios[navio][0]=sorteio.nextInt(10);
            navios[navio][1]=sorteio.nextInt(10);
            
            
            //agora vamos checar se esse par não foi sorteado
            //se foi, so sai do do...while enquanto sortear um diferente
            for(int anterior = 0 ; anterior < navio ; anterior ++){
                if( (navios[navio][0] == navios[anterior][0])&&(navios[navio][1] == navios[anterior][1]) )
                    do{
                        navios[navio][0]=sorteio.nextInt(10);
                        navios[navio][1]=sorteio.nextInt(10);
                    }while( (navios[navio][0] == navios[anterior][0])&&(navios[navio][1] == navios[anterior][1]) );
            }
            
        }
    }
	
	
	
	public int[][] getPortaAvioes() {
		return portaAvioes;
	}


	public void setPortaAvioes(int[][] portaAvioes) {
		this.portaAvioes = portaAvioes;
	}


	public int[][] getDestroyer() {
		return destroyer;
	}


	public void setDestroyer(int[][] destroyer) {
		this.destroyer = destroyer;
	}


	public int[][] getFragata() {
		return fragata;
	}


	public void setFragata(int[][] fragata) {
		this.fragata = fragata;
	}


	public int[][] getTorpedeiro() {
		return torpedeiro;
	}


	public void setTorpedeiro(int[][] torpedeiro) {
		this.torpedeiro = torpedeiro;
	}


	public int[][] getSubmarino() {
		return submarino;
	}


	public void setSubmarino(int[][] submarino) {
		this.submarino = submarino;
	}
	
	
}
