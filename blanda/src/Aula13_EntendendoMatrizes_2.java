
// Desenho 1: 



import java.util.Scanner;

public class Aula13_EntendendoMatrizes_2 {
    public static void main(String[] args) throws Exception {

        String [][] matriz = new String[16][16];
        matriz[8][1]    = " X ";
        matriz[1][8]    = " X ";
        matriz[1][11]   = " X ";
        matriz[3][13]   = " X ";
        matriz[6][13]   = " X ";
        matriz[8][11]   = " X ";
        matriz[10][13]  = " X ";
        matriz[13][13]  = " X ";
        matriz[15][11]  = " X ";
        matriz[15][8]   = " X ";
        matriz[8][1]    = " X ";


        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(matriz[i][j] == null){
                    System.out.print("___");
                }else{
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}