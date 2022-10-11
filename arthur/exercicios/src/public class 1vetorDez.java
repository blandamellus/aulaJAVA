import java.util.Scanner;

public class 1vetorDez {
        public static void main(String[] args) throws Exception{

            Scanner scan = new Scanner (System.in);

            int[] vetorPares = new int [10];

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

            for (int i = 0; i <vetorPares.lenght; i++){
                System.out.println(vetorPares);
            }

            // usuario com uma informação

            Scanner entrada = new Scanner(System.in);
            int numero, contador;
            boolean bandeira = false;
            int [] vetorNovo = new int[10];

            System.out.println("informe um número: ");
            numero = entrada.nextInt();

            while (bandeira != true) {
                
                if(numero%2 == 0){
                    vetorNovo[contador] = numero;
                    contador++;  //contador = contador +1
                
                }
                numero = numero + 1;


                if(contador == 9){
                    bandeira = true;
                }

                

            }

            //exibir vetor

            for (int i = 0; i < vetorNovo.lenght; i++){
                System.out.println(vetorNovo[i]);
            }



            

        
    }
}