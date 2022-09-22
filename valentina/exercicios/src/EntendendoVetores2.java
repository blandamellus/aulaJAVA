import java.util.Scanner;

public class EntendendoVetores2 {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        int semana;
        String [] vetor = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", " Sexta", "Sabábado"};
                        //    0          1         2         3         4         5         6;

        do {
            System.out.println("Digite o número equivalente ao dia da semana: ");
        semana = entrada.nextInt();
        }while(semana > 7); 

        System.out.println(vetor[semana]);


    }
}