import java.util.Scanner;

public class EntendendoVetores_2 {

    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);

        int semana;
        String [] vetor = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        do{
            System.out.println("Digite o número equivalente ao dia da semana: ");
            semana = entrada.nextInt();
        } while (7 >= 0);
        
        System.out.println(vetor[semana]);

        //if(){
        //
        //}
    }
    
}
