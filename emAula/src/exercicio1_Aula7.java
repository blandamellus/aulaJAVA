import java.util.Scanner;

public class exercicio1_Aula7 {
    public static void X_main(String[] args) throws Exception{
        // Faça um Programa que leia três números e mostre o maior deles.
        int numero1, numero2, numero3; 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Informe um número00: ");
        numero2 = entrada.nextInt();
        
        System.out.println("Informe um número: ");
        numero3 = entrada.nextInt();
        
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("Primeiro número é maio:r " + numero1);
        } else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("segundo número é maior: " + numero2);
        } else{
            System.out.println("Terceiro número é maior: " + numero3);
        }
    }
}



