import java.util.Scanner;

public class CanetaTeste{
    public static void main(String[] args) throws Exception{
        
        Caneta bic = new Caneta();
        bic.setCor("vermelho");
        bic.setMarca("bic");
        bic.setTamanho(0.2);
        System.out.println(bic.toString());

        Caneta tilibra = new Caneta();
        tilibra.setCor("preto");
        tilibra.setMarca("tilibra");
        tilibra.setTamanho(0.5);
        System.out.println(tilibra.toString());
        
        Caneta havan = new Caneta("havan", "laranja", 0.7);
        System.out.println(havan.toString());

        Caneta faberCastel = new Caneta("Faber Castel");
        System.out.println(faberCastel.toString());

        Scanner entrada = new Scanner (System.in);

        String cor, marca;
        Double tamanho;

        System.out.println("entre  com a marca da caneta: ");
        marca = entrada.next();

        System.out.println("entre com uma cor de caneta: ");
        cor = entrada.next();

        System.out.println("entre com o tamanho da caneta: ");
        tamanho = entrada.nextDouble();

        Caneta novaCaneta = new Caneta(marca, cor, tamanho);
        System.out.println(novaCaneta.toString());

        String vetor[] = new String[5];
        int vetorInt[] = new int[5];

        Caneta[] colecaoDeCanetas = new Caneta[10];
        colecaoDeCanetas[0] = new Caneta("montblanc", "preta", 0.2);
        colecaoDeCanetas[1] = new Caneta("Hugo Boss", "dourada", 0.1);
        colecaoDeCanetas[2] = new Caneta("Stabilo", "rosa", 0.5);

        System.out.println(colecaoDeCanetas[0].getCor());
        System.out.println(colecaoDeCanetas[0].toString());

        for (int i = 0; i < colecaoDeCanetas.length; i++){
            System.out.println(colecaoDeCanetas[i].toString());
        }

    }
}