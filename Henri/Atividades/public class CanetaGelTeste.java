public class CanetaGelTeste{
    public static void main(String[] args){
        CanetaGel bic = new CanetaGel();
        bic.setCor(cor = "azul");
        bic.setMarca(marca = "Bic");
        bic.getTamanho(tamanho =  0.3);
        System.out.println(bic.toString());
        String mensagem = bic.toString();
        System.out.println(mensagem);

        CanetaGel compact = new CanetaGel();
        compact.setCor(cor = "amarela");
        compact.setMarca(marca = "compact");
        compact.getTamanho(tamanho =  0.2);
        System.out.println(.toString());
        String mensagem2 = compact.toString();
        System.out.println(mensagem2);

        CanetaGel car = new CanetaGel();
        car.setCor(cor = "multicolor");
        car.setMarca(marca = "car");
        car.getTamanho(tamanho =  0.2);
        System.out.println(.toString());
        String mensagem2 = compact.toString();
        System.out.println(mensagem2);
    }
}