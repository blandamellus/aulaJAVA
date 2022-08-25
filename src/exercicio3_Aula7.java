import java.util.Scanner;

//import java.util.Scanner;

public class exercicio3_Aula7 {
    public static void x_main(String[] args) throws Exception{
        
        // Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
        
        Scanner entrada = new Scanner(System.in);
        Double nota;
        int contador = 0;
        System.out.println("Informe um nota: "); 
        nota = entrada.nextDouble();


        while(contador != 1) {
            System.out.println("Informe uma nota válida: "); 
            nota = entrada.nextDouble();

            if(nota >= 0 && nota <= 10){
                System.out.println("Nota Valida!");
                contador = 1;
            }
        
        }


    }
}