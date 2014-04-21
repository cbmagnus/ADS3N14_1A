package controller;

import java.util.Scanner;

public class Tabuleiro {
	
	private int[][] tabuleiro = new int[10][10];
	//private int[][] navios = ; 
	private int[][] tiro = new int[2][2];
	private int tentativas = 0;
	private int acertos = 0;
	
    
	
    public void iniciaTabuleiro(int[][] tabuleiro){
		
    	for(int linha = 0 ; linha < 10 ; linha++ ){
            for(int coluna = 0 ; coluna < 10 ; coluna ++ ){
                tabuleiro[linha][coluna] = -1;
            }
    	}
    	this.tabuleiro = tabuleiro;
		
	}

    
    
    public void alteraTabuleiro(int[][] tiro, int[][] navios, int[][] tabuleiro){
        if(acertou(tiro, navios)){
        	tabuleiro[tiro[0][0]][tiro[0][1]] = 1;
        	setTabuleiro(tabuleiro);
        }
        else{
            tabuleiro[tiro[0][0]][tiro[0][1]]=0;
            setTabuleiro(tabuleiro);
        }
        	
    }
    
    
    
    public boolean acertou(int[][] tiro, int[][] navios){
        
        for(int navio=0 ; navio<navios.length ; navio++){
        	for(int t=0 ; t<tiro.length ; t++){
        		if( tiro[t][0]==navios[navio][0] && tiro[t][1]==navios[navio][1]){
        			System.out.printf("Você acertou o tiro (%d,%d)\n",tiro[t][0]+1,tiro[t][1]+1);
        			return true;
        		}
            }
        }
        return false;
    }
    
    
    
    
    public void dica(int[][] tiro, int[][] navios, int tentativa){
        int linha=0;
        int coluna=0;
        
        for(int fila=0 ; fila < navios.length ; fila++){
            if(navios[fila][0]==tiro[fila][0])
                linha++;
            if(navios[fila][1]==tiro[fila][1])
                coluna++;
        }
        
        System.out.printf("\nDica %d: \nlinha %d -> %d navios\n" + "coluna %d -> %d navios\n",tentativa,tiro[0][0]+1,linha,tiro[0][1]+1,coluna);
    }
    
    
    
    
    public int[][] darTiro(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Linha: ");
        int linha = entrada.nextInt();
        
        System.out.print("Coluna: ");
        int coluna = entrada.nextInt();
        
        int[][] novo = new int[linha][coluna];
        
        setTiro(novo);
        return novo;
        
    }
    
    
    
    

	public int[][] getTabuleiro() {
		return tabuleiro;
	}


	public void setTabuleiro(int[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}


	public int getTentativas() {
		return tentativas;
	}


	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}


	public int getAcertos() {
		return acertos;
	}


	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}


	public int[][] getTiro() {
		return tiro;
	}


	public void setTiro(int[][] tiro2) {
		this.tiro = tiro2;
	}


}
