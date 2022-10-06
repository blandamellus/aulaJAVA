// Exercício 2 Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.

public class Aula15_exercicio_2{
    public static void main(String[] args) throws Exception {
                     // 0  1  2  3  4  5  6  7  8  9
        int [] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int posicao = 9;

        for(int passo = 0; passo < vetor.length; passo++){
            System.out.println(vetor[posicao]);
            posicao = posicao - 1;
        }
    }
}