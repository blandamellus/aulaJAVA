import java.util.Scanner;

public class CotacaoDolar {
    public static void main(String[] args) throws Exception {

        //Ler cotação do dolar, valor em dolar, converter pra real, mostrar resultado

        Scanner scan = new Scanner(System.in);
        Double valor;
        System.out.println("Escreva um valor em dólar: ");
        valor = scan.nextDouble();

        Double cotacao;
        System.out.println("Escreva valor da cotação: ");
        cotacao = scan.nextDouble();

        Double conversao = (valor * cotacao);

        System.out.println("Resultado é " + conversao);


    }
}