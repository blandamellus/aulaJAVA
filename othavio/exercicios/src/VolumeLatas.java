import java.util.Scanner;

public class VolumeLatas{
    public static void main(String[] args) throws Exception{

        Scanner entrada = new Scanner(System.in);
        double Volume, raio, altura;

        System.out.print("Digite o raio da lata: ");
        raio = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        altura = entrada.nextDouble();

        Volume = 3.141592653595
         * raio * raio * altura;

        System.out.print("O Volume da lata é " + Volume + "\n");

    }
}