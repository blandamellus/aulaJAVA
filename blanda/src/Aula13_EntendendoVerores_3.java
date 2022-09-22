import java.util.Scanner;

public class Aula13_EntendendoVerores_3 {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        Double [] vetorNotas = new Double[4];
        Double media = 0.0;

        for(int i = 0; i < vetorNotas.length; i++){
            System.out.println("Informe sua nota: ");
            vetorNotas[i] = entrada.nextDouble();
            media = media + vetorNotas[i];
        }
        media = media / vetorNotas.length;
        System.out.println(media);
        

        entrada.close();
    }
}
