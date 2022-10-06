import java.util.Scanner;

public class Aula13_EntendendoVerores_2 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);


        int semana;
        String [] vetor = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
                         //  0          1           2       3           4       5        6
        
                

        do {
            System.out.println("Digite o número equivalente ao dia da semana: ");
            semana = entrada.nextInt();
        }while(semana >= 7);


        //while( semana >= 7) {
        //    System.out.println("Digite o número equivalente ao dia da semana: ");
        //    semana = entrada.nextInt();
        //}
        
        
        // exibe o valor do vetor na posição informada pela variavel SEMANA
        System.out.println(vetor[semana]);
      


    }
}