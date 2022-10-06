import java.util.Scanner;

//Exercício 1 Faça um programa que retorne o valor digitado por extenso, limitando-se a número de 1 a 9.

public class  Aula15_exercicio_1{
    public static void main(String[] args) throws Exception {
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
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um valor inteiro: ");
        valor = entrada.nextInt();

        switch (valor) {
            case 1: // verifica o valor que o usuário digitou
                System.out.println(numerosPorExtenso[0]);
                break;
            case 2: // 2
                System.out.println(numerosPorExtenso[1]);
                break;
            case 3:
                System.out.println(numerosPorExtenso[2]);
                break;  
            case 4:
                System.out.println(numerosPorExtenso[3]);
                break;
            case 5:
                System.out.println(numerosPorExtenso[4]);
                break;
            case 6:
                System.out.println(numerosPorExtenso[5]);
                break;
            case 7:
                System.out.println(numerosPorExtenso[6]);
                break;
            case 8:
                System.out.println(numerosPorExtenso[7]);
                break;
            case 9:
                System.out.println(numerosPorExtenso[8]);
                break;                
            default:
                System.out.println("Deu ruim...");
                break;
        }



        // recebe valor do usuário
        // salvar valores por extenso? vetor
        // limite de entrada 1 a 9 (numeros inteiros)
        



  
    }
}