public class testPen{
    public static void main(String[] args) throws Exception{
        pen bic = new pen();
        bic.setCor(cor = "vermelha");
        bic.setMarca(marca = "Bic");
        bic.getTamanho(tamanho =  0.2);
        System.out.println(bic.toString());

        caneta tilibra = new caneta();
        tilibra.setCor(cor = "preto");
        tilibra.setMarca(marca = "tilibra");
        tilibra.getTamanho(tamanho =  0.5);
        System.out.println(tilibra.toString());

        caneta Fc = new caneta();
        Fc.setCor(cor = "azul");
        Fc.setMarca(marca = "Fc");
        Fc.getTamanho(tamanho =  0.7);
        System.out.println(Fc.toString());

        caneta Spamton = new caneta();
        Spamton.setCor(cor = "lilas e amarelo");
        Spamton.setMarca(marca = "Spamton");
        Spamton.getTamanho(tamanho =  0.3);
        System.out.println(Spamton.toString());

        caneta havan = new caneta();
        (marca:"Havan", cor:"laranja", tamanho: 0.7);
        System.out.println(havan.toString);

        caneta mlg = new caneta(marca:"mlg");
        System.out.println(mlg.toString());

        String cor, marca;
        Double tamanho;

        System.out.println(x:"entre com marca de sua caneta");
        marca = entrada.next();
        
        System.out.println(x:"entre com cor de sua caneta");
        cor = entrada.next();

        System.out.println(x:"entre com tamanho de sua caneta");
        tamanho = entrada.next();

        caneta Ncaneta = new caneta(marca, cor, tamanho);
        System.out.println(Ncaneta.toString());

        String vetor[] = new String[5];
        int vetorInt[] = new int[5];

        caneta[] coleçãoCaneta = new caneta[10];
        canetas[0] = new caneta(marca:"montBlanc", cor:"preta", tamanho: 0.2);
        canetas[0] = new caneta(marca:"hugo boss", cor:"roxo", tamanho: 0.2);
        canetas[0] = new caneta(marca:"montBlanc", cor:"prata", tamanho: 0.2);

        System.out.println(coleçãoCaneta[0].getCor());
        System.out.println(coleçãoCaneta[0].toString());

    }
}