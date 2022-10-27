public class CanetaTeste {
    public static void main(String[] args) throws Exception {
        
        Caneta bic = new Caneta();
        bic.setCor("vermelho");
        bic.setMarca("Bic");
        bic.setTamanho(0.2);
        System.out.println(bic.toString());

        Caneta tilibra = new Caneta();
        tilibra.setCor("preto");
        tilibra.setMarca("Tilibra");
        tilibra.setTamanho(0.5);
        System.out.println(tilibra.toString());
        


        
    }
}