import java.util.Scanner;

public class Aula14_ProjetoBatalhaNaval {
    public static void main(String[] args) {
                
        String [][] campoDeBatalha = new String [5][5];
        String tabuleiro = "";

        campoDeBatalha[1][0] = "|N|";
        campoDeBatalha[4][0] = "|H|";
        campoDeBatalha[2][2] = "|N|";
        campoDeBatalha[3][2] = "|N|";
        campoDeBatalha[1][3] = "|H|";
        campoDeBatalha[0][4] = "|B|";
        campoDeBatalha[2][4] = "|B|";
        campoDeBatalha[3][4] = "|H|";

        for (int linha = 4; linha >= 0 ; linha--) {
            for (int coluna = 0; coluna < campoDeBatalha.length; coluna++) {
                //System.out.print("X: " + linha + " Y:" + coluna);    
                if(campoDeBatalha[linha][coluna] == null){
                    System.out.print("|A|");
                }else{
                    System.out.print(campoDeBatalha[linha][coluna]);    
                }
                
            }

            
        }

    }
}
/*
[1][0] navio
[4][0] helicoptero
[2][2] navio
[3][2] navio
[1][3] helicoptero
[0][4] barquinho
[2][4] barquinho
[3][4] helicoptero

*/