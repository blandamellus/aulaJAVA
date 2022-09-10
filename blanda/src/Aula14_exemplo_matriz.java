import java.util.Scanner;

public class Aula14_exercicio_3 {
    public static void main(String[] args) {
        int [][] matriz = new int[2][2];

        matriz[0][0] = 6;
        matriz[1][0] = 7;
        matriz[0][1] = 9;
        matriz[1][1] = 8;
               // comeca 2
        for (int linha = 0; linha < matriz.length; linha++) {
                    // comeca 2
                    // matriz[1][0]
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print("X:"+linha + " Y:"+coluna + " = ");
                System.out.println(matriz[linha][coluna]);
                

            } // +1 coluna
        }// +1 linha


    }
}