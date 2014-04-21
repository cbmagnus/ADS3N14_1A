package view;

import controller.Tabuleiro;

public class ImprimeTabuleiro {
	Tabuleiro tab = new Tabuleiro();
	
	public void imprimeTabuleiro(int tabuleiro[][]){
		//System.out.println("\tA \tB \tC \tD \tE \tF \tG \tH \tI \tJ");
		System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10");
		
        for(int linha = 0 ; linha < 10 ; linha ++ ){
            System.out.print((linha+1)+"");
            for(int coluna = 0 ; coluna < 10 ; coluna ++ ){
                if(tabuleiro[linha][coluna]==-1){
                    System.out.print("\t"+".");
                }else if(tabuleiro[linha][coluna]==0){
                    System.out.print("\t"+"-");
                }else if(tabuleiro[linha][coluna]==1){
                    System.out.print("\t"+"O");
                }
                
            }
            System.out.println();
        }
	}
	
}
