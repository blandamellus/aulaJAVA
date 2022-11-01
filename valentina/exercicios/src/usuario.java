import java.util.Scanner;

public class usuario {
    public static void main(String[] args) throws Exception {
        /*recebe numeros do usuario;
        armazena no vetor
        verificar e contar numeros 1, 3, 4 - for
        repetição até discar "-1" - while */

        Scanner entrada = new Scanner(System.in);
        int [] vetorNumero = new int[100];
        int contar1 = 0, contar3 = 0, contar4 = 0;
        int contador = 0;

        for(int i = 0; i < 100; i++){
            System.out.println("Insira um número de 0 à 9: ");
            vetorNumero[i] = entrada.nextInt();

            if (vetorNumero[contador] == 1){
                contar1++;
            }
            if (vetorNumero[contador] == 3){
                contar3 = contar3 + 1;
            }
            if (vetorNumero[contador] == 4){
                contar4 = contar4 + 1;
            }
        
            if (vetorNumero[i] == -1){
                System.out.println("Encerrada a entrada de dados");
                break;
            }
            contador++;
        }
        System.out.println("O total de números 1: " + contar1);
        System.out.println("O total de números 3: " + contar3);
        System.out.println("O total de números 4: " + contar4);
    }
}