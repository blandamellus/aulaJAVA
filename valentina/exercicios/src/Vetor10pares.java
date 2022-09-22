import java.util.Scanner;

public class Vetor10pares {
    public static void main(String[] args){
                
        // modo braçal

        int [] vetorPares = new int [10];

        vetorPares[0] = 2;
        vetorPares[1] = 4;
        vetorPares[2] = 6;
        vetorPares[3] = 8;
        vetorPares[4] = 10;
        vetorPares[5] = 12;
        vetorPares[6] = 14;
        vetorPares[7] = 16;
        vetorPares[8] = 18;
        vetorPares[9] = 20;

        for (int i = 0; i < vetorPares.length; i++) {
            System.out.println(vetorPares[i]);
        }  
        
        
        // usuario entra com informação

        Scanner entrada = new Scanner(System.in);
        int numero, contador;
        boolean bandeira = false;
        int [] vetorNovo = new int [10];

        System.out.println("Informe um número: ");
        numero = entrada.nextInt();

        while (bandeira != true) {

            if(numero%2 == 0){
                vetorNovo[contador] = numero;
                contador++; // contador = contador + 1
            }
            numero = numero + 1;

            if(contador == 9){
                bandeira = true;
            }           
        }
        for (int i = 0; i < vetorNovo.length; i++) {
            System.out.println(vetorNovo[i]);
        }
    }
}

