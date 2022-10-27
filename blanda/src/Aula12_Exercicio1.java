import java.util.Scanner;

import javax.swing.text.Position;
/* Fazer um programa ler um vetor de inteiros e positivos e imprimir quantas vezes aparece o número 1, 3 e 4, nesta ordem. O vetor terá no máximo 100 posições. Sair do programa quando for digitado -1.

1. entrada do usuário Usando scanner e salvando no vetor
2. criar filtros dos numeros 1, 3, 4 para contar frequencia
3. criar estrutura de repetição para 100 entradas
*/
public class Aula12_Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int[] numero = new int[100];
        int contar1=0, contar3=0, contar4=0;
        int contador=0;

        do {
            System.out.println("Entre com um número: ");
            numero[contador] = entrada.nextInt();
            System.out.println(numero[contador]);

            if (numero[contador] == 1) {
                contar1 = contar1 + 1;
            }
    
            if (numero[contador] == 3) {
                contar3 = contar3 + 1;
            }
    
            if (numero[contador] == 4) {
                contar4 = contar4 + 1;
            }
            contador++;
        } while (numero[contador-1] != -1 && contador < 100);



        




    }
}