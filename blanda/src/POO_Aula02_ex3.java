import java.util.Scanner;

public class POO_Aula02_ex3 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int numero, a=0, b=0, c=0, maior=0, menor=0, contador=0;
        boolean bandeira = false;
                
        // quando as 3 variaveis estiverem com dados maiores que 0, para!
        
        while (bandeira == false) { // bandeira != true
              
            if (a > 0 && b > 0 && c > 0){
                System.out.println("Saindo do while...");
                bandeira = true;
                // break;

            }else{
                System.out.println("Informe um número [maior que 0]: ");
                numero = entrada.nextInt();
                
                if (numero > 0) {

                    // apenas para o primeiro, pq o código começa com 0
                    if(contador == 0){
                        menor = numero;
                        contador = 1;
                    }
                    // verifica se o valor digitado é menor do que o já salvo
                    if (numero < menor) {
                        menor = numero;                    
                    }
                    // verifica se o valor digitado é maior do que o já salvo
                    if(numero > maior) {
                        maior = numero;
                    }

                    if (a == 0) {
                        a = numero;
                    } else if (b == 0) {
                        b = numero;
                    } else if (c == 0) {
                        c = numero;
                    }  
                }
            }
            System.out.println("O menor número digitado até agora: " + menor);
            System.out.println("O maior número digitado até agora: " + maior);
        }
        System.out.println("O MENOR * MAIOR: " + menor*maior);
        System.out.println("O MAIOR / MENOR: " + maior/menor);
    }
}