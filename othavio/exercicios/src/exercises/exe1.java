package exercises;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
     int [] numero = new int[100];
     int contar1=0, contar3=0, contar4=0;
     int contador=0;

     System.out.println("Entre com um número: ");
     numero[0] = entrada.nextInt();

     System.out.println("Entre com um número: ");
     numero[1] = entrada.nextInt();

     System.out.println("Entre com um número: ");
     numero[2] = entrada.nextInt();

        do {
            System.out.println("Entre com um número: ");
            numero[contador] = entrada.nextInt();

            if (numero[contador] == 1){
             contar1 = contar1 + 1;
            }
    
            if (numero[contador] == 3){
             contar3 = contar3 + 1;
            }
        
            if (numero[contador] == 4){
             contar4 = contar4 + 1;
            }

            if (numero[contador] == 4){
                contar4 = contar4 + 1;
            }

            contador ++;
        } while (numero[contador-1] != -1 && contador < 100);
    } 
}

