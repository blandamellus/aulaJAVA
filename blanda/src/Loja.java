class LojaEletronicos{
    String ssd;
    String hd;
    String placaMae;
    String placaVideo;
    String memoriaRam;
    String gabinete;
    String fonte;
    String mouse;

    public String[] vetorPedido(){
        String [] vPedidos = new String[8];
        return vPedidos;
    }

    public void vender(String nomeCliente){
        System.out.println("Estou vendo um pedido fechado.");

    }
    
    public void comprar(int cnpj, String nomeProduto){
        System.out.println("Comprando nova mercadoria");
        System.out.println("Pedido de " +  nomeProduto + " realizado em nome do CNPJ: " + cnpj);
    } 

    public void trocar(){}

    public void consertar(){}

}
public class Loja {
    public static void main(String[] args) throws Exception {      
        LojaEletronicos gamerX = new LojaEletronicos();

        gamerX.fonte = "Fonte 600V";
        gamerX.gabinete = "gabinete gamer";
        gamerX.hd = "1Tb 7000rpm";
        gamerX.memoriaRam = "Kingston 16Gb Mem";
        gamerX.mouse = "Microsofit 180";
        gamerX.placaMae = "Asus";
        gamerX.placaVideo = "RTX 4090TI";
        gamerX.ssd = "500 Gb pcle";






    }
}