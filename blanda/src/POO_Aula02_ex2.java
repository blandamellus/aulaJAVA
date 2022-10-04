import java.util.Scanner;

public class POO_Aula02_ex2 {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        int [][] matriz = new int [4][4];
        int numero;

        System.out.println("Informe um número inteiro: ");
        numero = entrada.nextInt();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {                
                matriz[linha][coluna] = numero;
                System.out.print("|"+ matriz[linha][coluna] + "|");

                numero = numero * 2; 
            }
            System.out.println();
        }




        





        
  
    }
}