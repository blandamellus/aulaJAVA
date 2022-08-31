import java.util.Scanner;

// Faça um algoritmo que receba um número e exiba o mês, do ano, correspondente.
public class Switch {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int numeroMes = 0;

        System.out.println("Informe o numero do mês: ");
        numeroMes = entrada.nextInt();

        if(numeroMes == 1){
            //exibe o texto do bloco
        }

        switch (numeroMes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Errouuu!");
                break;
        }
  
    }
}