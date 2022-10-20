package Vupuim;

public class CanetaTeste {

    public static void main(String[] args) throws Exception {
        Caneta bic = new Caneta();
        bic.setCor("Vermelho");
        bic.setMarca("Bic");
        bic.setTamanho("0.2");

        Caneta tilibra = new Caneta();
        tilibra.setCor("preto");
        tilibra.setMarca("tilibra");
        tilibra.setTamanho("0.5");

        Caneta havan = new Caneta("Havan", "laranja", "0.7");
        System.out.println(havan.toString());


    }
    
}
