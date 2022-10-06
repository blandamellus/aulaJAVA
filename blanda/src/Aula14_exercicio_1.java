import java.util.Scanner;

public class Aula14_exercicio_1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int [] vetor = new int[5];
        int posicao = 0;


for (int passo = 0; passo < vetor.length; passo++) 
{ // quero repetir 5 vezes o que tem aqui dentro
    // informando um valor a posicao informada
    System.out.println("Informe um número: ");
    vetor[posicao] = entrada.nextInt();
    posicao++;
} // até aqui   +1
    
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);
        System.out.println(vetor[4]);        

    }
}