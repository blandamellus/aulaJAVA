import java.util.Scanner;

/* 2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.   
    Fazer um algoritmo que calcule e escreva:
    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres;
 */
public class HomensMulheres {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        // variaveis
        // 1 = mulher
        // 2 = homem
        int sexo, quantidadeMulheres=0, quantiadeHomens=0;
        float altura, somaAlturaHomens=0, mediaAlturaHomens=0, maiorAltura=0, menorAltura=0;
        
        // entrada
        for (int i = 0; i <= 10; i++){
            System.out.println("Informe o sexo da pessoa (1-Mulher e 2-Homem): ");
            sexo = entrada.nextInt();

            System.out.println("Informe a altura");
            altura = entrada.nextFloat();

            if(sexo == 1){
                quantidadeMulheres++;
            } else if(sexo == 2){
                quantiadeHomens++;
                // total de altura dos homens
                somaAlturaHomens = somaAlturaHomens + altura;
            } else {
                System.out.println("Opcao errada!");
            }

            // a maior e a menor altura do grupo;
            if(altura > maiorAltura){ 
                maiorAltura = altura;
            } else if (menorAltura == 0){ // erro por enquanto
                menorAltura = altura; 
                System.out.println("TESTE PASSEI AKI" + altura);
            } else if (altura < menorAltura){
                menorAltura = altura;
            }
        }

        // média de altura dos homens;
        mediaAlturaHomens = somaAlturaHomens / quantiadeHomens;

        System.out.println("A maior altura do grupo é " + maiorAltura );
        System.out.println("A menor altura do grupo é " + menorAltura );
        System.out.println("A média de altura dos homens é " + mediaAlturaHomens );
        System.out.println("Total de mulheres é " + quantidadeMulheres );
            
        // de 10 pessoas ???

        entrada.close();
  
    }
}