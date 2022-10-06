import java.util.Scanner;

public class VetorDez {
    public static void main(String[] args) throws Exception {
        
        // modo bracal - go horse
        int [] pares = new int [10];

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

        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }


        // usuário entra com uma informação

        Scanner entrada = new Scanner(System.in);
        int numero, contador=0;
        boolean bandeira = false;
        int [] vetorNovo = new int[10];

        System.out.println("Informe um número: ");
        numero  = entrada.nextInt();
        // == igual
        // != diferente

        while (bandeira != true) {
            if(numero%2 == 0){
                vetorNovo[contador] = numero;
                contador++; // contador = contador + 1
            }
            numero = numero + 1; // continua adionando valores na entrada do usuario
            
            // condição while
            if(contador == 10){
                bandeira = true;
            }
        }

        // exibir vetor preenchido
        for (int i = 0; i < vetorNovo.length; i++) {
            System.out.println(vetorNovo[i]);
        }





    }
}