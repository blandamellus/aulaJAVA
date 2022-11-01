package Vupuim;

public class CanetaGelTeste {
    //exemplo classe pai
    public static void main(String[] args) throws Exception{
        Caneta bic = new canetaGel();
        bic.setCor("Azul");
        bic.setMarca("Bic");
        bic.setTamanho('0.3');
        String mensagem = bic.toString();
        System.out.println(mensagem);

        CanetaGel compact = new canetaGel();
        compact.setCor("Azul");
        compact.setTamanho('0.2');
        compact.setMarca("Compact");
        compact.setGlitters(false);
        compact.setPontaMacia(true);
        System.out.println(compact.toString());
    }

    
}
