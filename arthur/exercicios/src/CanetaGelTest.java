public class CanetaGelTest{
    public static void main(String[] args) throws Exception{
        
        caneta bic = new caneta();
        bic.setCor("vermelho");
        bic.setMarca("Bic");
        bic.setTamanho(0.2);
        bic.toString();
        System.out.println(bic.toString());
        

        CanetaGel compact = new CanetaGel();
        compact.setCor("Azul");
        compact.setTamanho(0.3);
        compact.setMarca("Compact");
        compact.setAroma("Flores");
        compact.setGlitter(false);
        compact.setPontaMacia(true);
        compact.toString();
        System.out.println(compact.toString());

        CanetaGel FaberCastell = new CanetaGel();
        FaberCastell.setCor("Vermelho");
        FaberCastell.setTamanho(0.7);
        FaberCastell.setMarca("Faber Castell");
        FaberCastell.setAroma("Morango");
        FaberCastell.setGlitter(true);
        FaberCastell.setPontaMacia(false);
        FaberCastell.toString();
        System.out.println(FaberCastell.toString());
    }

    
}