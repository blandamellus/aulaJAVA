import java.util.Scanner;

public class Stringexercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String textoinicial = "";
        int vogal = 0;
        System.out.println("Entre com um texto:");
        textoinicial = entrada.next();
        
        //ex a

        System.out.println("Tamanho = " + textoinicial.length());

        //ex b

        System.out.println(textoinicial.toUpperCase());

        //ex c
        
        for(int j = 0; j < textoinicial.length(); j++){
            char carac = textoinicial.trim().charAt(j);
            if(carac == 'a' || carac == 'e' || carac == 'i' || carac == 'o' || carac == 'u'){
                vogal++;
            }

        }
        System.out.println("Vogais = " + vogal);

        //ex d

        char letrainicial = textoinicial.charAt(0);
        System.out.println(letrainicial);

        char letra = Character.toUpperCase(letrainicial);
        System.out.println(letra);

        if(textoinicial.charAt(0) == letra){
            System.out.println("A primeira letra está maiúscula");
        } else {
            System.out.println("A primeira letra esta minúscula");
        }

        //ex e

        System.out.println(textoinicial.toUpperCase().endsWith("RIO"));

        //ex f

        int digitosNaString = 0;
        for(int j = 0; j < textoinicial.length(); j++){
            char carac = textoinicial.trim().charAt(j);
            if(carac == '9' ||
               carac == '8' ||
               carac == '7' ||
               carac == '6' ||
               carac == '5' ||
               carac == '4' ||
               carac == '3' ||
               carac == '2' ||
               carac == '0' ||
               carac == '1')
                digitosNaString++;
        
            }
    
        }
        System.out.println("Na minha String tem " + digitosNaString + "digitos");


        
   
    }
    
}
