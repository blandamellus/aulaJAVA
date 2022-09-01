import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada;
            System.out.println("Escreva a inicial de um sexo: ");
            entrada = scan.next();
            System.out.println(entrada);
            if (entrada.equals("f")) {
                System.out.println("Feminino");
            } else if (entrada.equals("m")) {
                System.out.println("Masculino");
            } else {
                System.out.println("Inicial inválida");
            }
           
    }
}