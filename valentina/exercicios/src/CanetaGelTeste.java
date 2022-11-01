public class CanetaGelTeste{
    public static void main(String[] args){
        Caneta bic = new Caneta();
        bic.setCor("Azul");
        bic.setMarca("Bic");
        bic.setTamanho(0.3);

        bic.toString();
        System.out.println(bic.toString());

        CanetaGel compact = new CanetaGel();
        compact.setCor("azul");
        compact.setTamanho(0.2);
        compact.setMarca("Compact");
        compact.setGlitter(false);
        compact.setPontaMacia(true);
        compact.toString();
        System.out.println(compact.toString());

        CanetaGel FaberCastell = new CanetaGel();
        FaberCastell.setCor("preto");
        FaberCastell.setTamanho(0.3);
        FaberCastell.setMarca("Faber Castell");
        FaberCastell.setGlitter(true);
        FaberCastell.setPontaMacia(true);
        FaberCastell.toString();
        System.out.println(FaberCastell.toString());
    }
}