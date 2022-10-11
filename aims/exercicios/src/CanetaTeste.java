import java.util.Scanner;

public class CanetaTeste {
    public static void main(String[] args) throws Exception {
            Caneta bic = new Caneta ();
            bic.setCor ("vermelho");
            bic.setMarca ("Bic");
            bic.setTamanho (0.2);
            System.out.println (bic.toString());

            Caneta tilibra = new Caneta();
            tilibra.setCor ("preto");
            tilibra.setMarca ("Tilibra");
            tilibra.setTamanho (0.5);
            System.out.println (tilibra.toString());

            Caneta compactor = new Caneta();
            compactor.setCor ("rosa");
            compactor.setMarca ("Compactor");
            compactor.setTamanho (0.1);
            System.out.println (compactor.toString());

            Caneta paperMate = new Caneta();
            paperMate.setCor ("verde");
            paperMate.setMarca ("Paper Mate");
            paperMate.setTamanho (0.1);
            System.out.println (paperMate.toString());

            Caneta Glow = new Caneta("Glow", "amarelo", 0.2);
            System.out.println (Glow.toString());

            Scanner entrada = new Scanner (System.in);
            String cor,marca;
            Double tamanho;

            System.out.println ("digite a marca da caneta");
            marca = entrada.next();

            System.out.println ("digite a cor da caneta");
            cor = entrada.next();

            System.out.println ("digite o tamanho da caneta");
            tamanho = entrada.nextDouble();

            Caneta novaCaneta = new Caneta (marca, cor, tamanho);
            System.out.println(novaCaneta.toString());

            String vetor[] = new String[5];
            int vetorInt[] = new int[5];

            Caneta[] colecaoDeCanetas = new Caneta [5];
            colecaoDeCanetas[0] = new Caneta ("mountblack", "azul", 0.2);
            colecaoDeCanetas[1] = new Caneta ("waw", "roxo", 0.2);
            colecaoDeCanetas[2] = new Caneta ("tshinji", "preto", 0.2);

            System.out.println (colecaoDeCanetas[0].getCor());
            System.out.println (colecaoDeCanetas[0].toString());
            
            for (int i = 0; i < colecaoDeCanetas.length; i++){
                System.out.println (colecaoDeCanetas[i].toString());
            }










        }

}