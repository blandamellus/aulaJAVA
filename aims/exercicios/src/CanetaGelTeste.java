public class CanetaGelTeste {
    public static void main(String[] args){

        //exemplo utilizando a classe pai

        Caneta bic = new Caneta ();
        bic.setCor( "azul");
        bic.setMarca("bic");
        bic.setTamanho(0.3);
        String mensagem = bic.toString();
        System.out.println(mensagem);

        //exemplo utilizando a classe filho
        CanetaGel compact = new CanetaGel ();
        compact.setCor("azul");
        compact.setTamanho( 0.2);
        compact.setMarca("compact");
        compact.setGlitter(false);
        compact.setPontaMacia(true);
        System.out.println(compact.toString());

    }
}