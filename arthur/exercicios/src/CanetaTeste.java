import java.util.Scanner;

public class CanetaTeste {
    public static void main(String[] args) throws Exception{

        caneta bic = new caneta();
        bic.setCor("vermelho");
        bic.setMarca("Bic");
        bic.setTamanho(0.2);
        bic.toString();
        System.out.println(bic.toString());

        caneta tilibra = new caneta();
        tilibra.setCor("preto");
        tilibra.setMarca("Tilibra");
        tilibra.setTamanho(0.5);
        tilibra.toString();
        System.out.println(tilibra.toString());

        caneta faberCastell = new caneta();
        faberCastell.setCor("Amarela");
        faberCastell.setMarca("Faber Castell");
        faberCastell.setTamanho(0.3);
        faberCastell.toString();
        System.out.println(faberCastell.toString());

        caneta Havan = new caneta();
        Havan.setCor("Verde");
        Havan.setMarca("Havan");
        Havan.setTamanho(0.2);
        Havan.toString();
        System.out.println(Havan.toString());

        Scanner entrada = new Scanner(System.in);

        String cor, marca;
        Double tamanho;

        
        System.out.println("Entre com a marca da caneta");
        marca = entrada.next();

        System.out.println("Entre com uma cor da caneta");
        cor = entrada.next();

        System.out.println("Entre com o tamanho da caneta");
        tamanho = entrada.nextDouble();

        caneta novaCaneta = new caneta(marca, cor, tamanho);
        System.out.println(novaCaneta.toString());

          String vetor[] = new String[5];
          int vetorInt[] = new int[5];


          caneta[] colecaoDeCanetas = new caneta[10];
          colecaoDeCanetas[0] = new caneta("montblanc", "preta", 0.2);
          colecaoDeCanetas[1] = new caneta("Hugo Boss", "Dourada", 0.1);
          colecaoDeCanetas[2] = new caneta("Stabillo", "Rosa", 0.5);

          System.out.println(colecaoDeCanetas[0].getCor());
         System.out.println(colecaoDeCanetas[0].toString());

         for (int i = 0; i < colecaoDeCanetas.length; i++){
             System.out.println(colecaoDeCanetas[i].toString());
         }



    }
}