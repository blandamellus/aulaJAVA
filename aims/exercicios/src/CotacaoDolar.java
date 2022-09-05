import java.util.Scanner;

public class CotacaoDolar {
    public static void main(String[] args) throws Exception {
        int numero, cotacao, resultado;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("digite um numero");
        cotacao = entrada.nextInt();

        System.out.println("digite um numero");
        numero = entrada.nextInt();

        resultado = numero * cotacao;
        System.out.println("o resultado é " + resultado);

        }
}