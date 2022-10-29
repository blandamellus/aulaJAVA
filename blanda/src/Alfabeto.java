import java.util.Scanner;

/* Escreva um programa que solicite dois caracteres de A a Z ao usuário e imprima o número de caracteres existente
entre eles. Assuma que o usuário digite os 2 caracteres em ordem alfabética. Caso não o estejam, emitir mensagem de erro. Exemplo: Digite 2 caracteres: j t O numero de caracteres entre eles é: 9
*/ 

// O numero de caracteres entre eles é: 2 


public class Alfabeto {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        System.out.println("Informe uma letra: ");
        char carac1 = (char)entrada.nextLine().toLowerCase().charAt(0); 
        
        System.out.println("Informe uma letra: ");
        char carac2 = (char)entrada.nextLine().toLowerCase().charAt(0); 

        // verifica posicao
        int pos1=0;
        for (int i = 0; i < alfabeto.length; i++) {
            if (alfabeto[i] == carac1) {
                pos1 = i;
            }
        }

        int pos2=0;
        for (int i = 0; i < alfabeto.length; i++) {
            if (alfabeto[i] == carac2) {
                pos2 = i;
            }
        }

        // c = 2 +1
        // g = 7 -1
        // res 3, 4, 5 = 3
        int diferenca = (pos2 - pos1 -1);  
        if (carac1 >= 0 && carac2 >= 0 && diferenca >= 0) {
            System.out.println("O numero de caracteres entre eles é: " + diferenca);    
        } else{
            System.out.println("Entrada com ERRO!!!!");
        }

        

        
  
    }
}