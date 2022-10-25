public class caneta {
    public static void main(String[] args) throws Exception{
        pen bic = new pen();
        bic.setCor("vermelha");
        bic.setMarca("Bic");
        bic.getTamanho(0.2);
        System.out.println(bic.toString());

        caneta tilibra = new caneta();
        tilibra.setCor("preto");
        tilibra.setMarca("tilibra");
        tilibra.getTamanho( 0.5);
        System.out.println(tilibra.toString());

        caneta Fc = new caneta();
        Fc.setCor("azul");
        Fc.setMarca("Fc");
        Fc.getTamanho( 0.7);
        System.out.println(Fc.toString());

        caneta Spamton = new caneta();
        Spamton.setCor("lilas e amarelo");
        Spamton.setMarca("Spamton");
        Spamton.getTamanho(0.3);
        System.out.println(Spamton.toString());

        caneta havan = new caneta("Havan", "laranja", 0.7);
        System.out.println(havan.toString);

        caneta mlg = new caneta("mlg");
        System.out.println(mlg.toString());

        String cor, marca;
        Double tamanho;

        System.out.println("entre com marca de sua caneta");
        marca = entrada.next();
        
        System.out.println("entre com cor de sua caneta");
        cor = entrada.next();

        System.out.println("entre com tamanho de sua caneta");
        tamanho = entrada.next();

        caneta Ncaneta = new caneta(marca, cor, tamanho);
        System.out.println(Ncaneta.toString());

        String vetor[] = new String[5];
        int vetorInt[] = new int[5];

        caneta[] coleçãoCaneta = new caneta[10];
        canetas[0] = new caneta("montBlanc", "preta",  0.2);
        canetas[0] = new caneta("hugo boss", "roxo",  0.2);
        canetas[0] = new caneta("montBlanc", "prata",  0.2);

        System.out.println(coleçãoCaneta[0].getCor());
        System.out.println(coleçãoCaneta[0].toString());

    }
}
