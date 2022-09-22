import java.util.Scanner;

public class EntendendoVetores {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        Double [] vetorNotas = new Double[4];
        Double media;

        System.out.println("Informe sua nota: ");
        vetorNotas[0] = entrada.nextDouble();
        System.out.println("Informe sua nota: ");
        vetorNotas[1] = entrada.nextDouble();
        System.out.println("Informe sua nota: ");
        vetorNotas[2] = entrada.nextDouble();
        System.out.println("Informe sua nota: ");
        vetorNotas[3] = entrada.nextDouble();

        media = (vetorNotas[0] + vetorNotas[1] + vetorNotas [2] + vetorNotas[3]) /vetorNotas.length;
        System.out.println(media);

        entrada.close();

    }
}