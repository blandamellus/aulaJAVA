import java.util.Scanner;

//Exercício 1 Faça um programa que retorne o valor digitado por extenso, limitando-se a número de 1 a 9.

public class Aula15_exercicio_1_V2{
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        // String [] numerosPorExtenso = new String[9];
        String [] numerosPorExtenso = {"Um",       //0
                                       "Dois",     //1
                                       "Três",     //2 
                                       "Quatro",   //3
                                       "Cinco",    //4
                                       "Seis",     //5
                                       "Sete",     //6
                                       "Oito",     //7
                                       "Nove"};    //8    
        int valor;
        int posicaoReal;

        System.out.println("Informe um valor inteiro entre 1 e 9: ");
        valor = entrada.nextInt();

        // vai receber o valor e transformar em posicao real
        if (valor > 0 & valor < 10) {
            posicaoReal = valor - 1;
            System.out.println(numerosPorExtenso[posicaoReal]);    
        } else {
            System.out.println("Valor informado é inválido!");
        }
        // recebe valor do usuário
        // salvar valores por extenso? vetor
        // limite de entrada 1 a 9 (numeros inteiros)
        // tratar estouro do vetor (abaixo de 1)  
    }
}