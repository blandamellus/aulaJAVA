public class exercicio2{
    public static void main 

    //Faça um programa que leia um numero e exiba o dia correspondente da semana.
    (1-Domingo, 2-Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

    Scanner entrada = new Scanner(System.in);
    int diaSemana;

    System.out.println("informe o dia da semana (numero):");
    diaSemana = entrada.nextint();

    if(diaSemana == 1){
        System.out.println("o numero informado é domingo")
    } else if(diaSemana == 2){
        System.out.println("o numero informado é segunda")
    } else if(diaSemana == 3){
        System.out.println("o numero informado é terça")
    } else if(diaSemana == 4){
        System.out.println("o numero informado é quarta")
    } else if(diaSemana == 5){
        System.out.println("o numero informado é quinta")
    } else if(diaSemana == 6){
        System.out.println("o numero informado é sexta")
    } else if(diaSemana == 7){
        System.out.println("o numero informado é sábado")
    }
}