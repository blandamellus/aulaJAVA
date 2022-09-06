import java.util.Scanner;

public class VolumeLatas {
    public static void main(String[] args) throws Exception {

        //*calcular e apresentar o valor do volume de uma lata de oleo
        //V = 3.14159 * R * R * A
        //V = volume R = raio A = altura

        Scanner scan = new Scanner(System.in);

        Double raio;
        System.out.println("Insira o raio da lata de óleo: ");
        raio = scan.nextDouble();

        Double altura;
        System.out.println("Insira a altura da lata de óleo: ");
        altura = scan.nextDouble();

        Double volume = 3.14159 *raio *raio *altura;
        System.out.println("O volume da lata de óleo é: " + volume); 

    }
}