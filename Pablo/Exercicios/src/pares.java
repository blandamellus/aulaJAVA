import java.util.Scanner;

public class pares {
    public static void main(String[] args) throws Exception {

        //Crie uma aplicação Java que preencha um vetor com 10 números pares.

        int[] pares = new int [10];
        
        pares[0] = 2;
        pares[1] = 4;
        pares[2] = 6;
        pares[3] = 8;
        pares[4] = 10;
        pares[5] = 12;
        pares[6] = 14;
        pares[7] = 16;
        pares[8] = 18;
        pares[9] = 20;

        for(int i = 0; i < pares.length; i++){
            System.out.println(pares[i]);
        }


        //usuario entra com uma informação

        Scanner entrada = new Scanner(System.in);
        int numero, contador1, posicao;
        boolean bandeira = false;
        int [] vetornovo = new int[10];

        System.out.println("informe um numero: ");
        numero = entrada.nextInt();
        while (bandeira != true) {
            
            if(numero%2 == 0){
                vetornovo[contador1] = numero;
                contador1++; // contador = contador + 1

            }
            numero = numero + 1;

            if(contador1 != 9){
                bandeira = true;
            }
            
        }
        for(int i = 0; i < vetornovo.length; i++){
            System.out.println(vetornovo[i]);
        }
    }
}