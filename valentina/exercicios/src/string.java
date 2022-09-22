import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        
        // AULA 12

        Scanner scan = new Scanner(System.in);
        String textoInicial = "";
        int vogal = 0;
        
        System.out.println("Entre com um texto: ");
        textoInicial = scan.next();
        
        // exercicio A - O número de caracteres da string.
        System.out.println("o texto de entrada contém: " + textoInicial.lenght());


        // exercicio B - A string com todas suas letras em maiúsculo.
        System.out.println(textoInicial.toUpperCasa());


        // exercicio C - O número de vogais da string.

        for(int j = 0; j < textoInicial.length(); j ++){
            char carac = textoInicial.charAt(j);
            if(carac == 'a' || carac == 'e' || carac == 'i' || carac == 'o' || carac == 'u'){
                vogal++;
            }
        }
        System.out.println(vogal);


        // exercicio D - Se a string digitada começa com letra maiúsculas.

        char letrainicial = textoInicial.charAt(0);
        System.out.println(letrainicial);

        char letra = Character.toUpperCase(letrainicial);
        System.out.println(letra); 

        if(textoInicial.charAt(0) == letra){
            System.out.println("A primeira letra está maiúscula");            
        } else {
            System.out.println("A primeira letra está minúscula");
        }

        // exercicio E - Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).
        System.out.println(textoInicial.toUpperCase().endsWith("RIO"));

        // exercicio F - O número de dígitos (0 a 9) da string.

        int digitosNaString = 0
        for(int j = 0; j < textoInicial.length(); j ++){
            char carac = textoInicial.charAt(j);
            if(carac == '9' || 
               carac == '8' || 
               carac == '7' || 
               carac == '6' || 
               carac == '6' || 
               carac == '5' || 
               carac == '4' || 
               carac == '3' || 
               carac == '2' ||
               carac == '1' ||
               carac ==- '0'){
                digitosNaString++;
            }
        }
        System.out.println("Na minha String tem " + digitosNaString + "digitos");

    }
}