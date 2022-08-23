import java.util.Scanner;

public class exercicio2_Aula7 {
    public static void main(String[] args) throws Exception{
        
        //Faça um Programa que leia um número e exiba o dia correspondente da semana.(1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

        Scanner entrada = new Scanner(System.in);
        int diaSemana;

        System.out.println("Informe o dia da semana (numero): ");
        diaSemana = entrada.nextInt();

        if(diaSemana == 1){
            System.out.println("O número informado é Domingo");
        } else if(diaSemana == 2){
            System.out.println("O número informado é Segunda");
        } else if(diaSemana == 3){
            System.out.println("O número informado é Terça");
        } else if(diaSemana == 4){
            System.out.println("O número informado é Quarta");
        } else if(diaSemana == 5){
            System.out.println("O número informado é Quinta");
        } else if(diaSemana == 6){
            System.out.println("O número informado é Sexta");
        } else if(diaSemana == 7){
            System.out.println("O número informado é Sábado");
        } else{
            System.out.println("Foi digitado um valor inválido!");
        }
        


    }
}