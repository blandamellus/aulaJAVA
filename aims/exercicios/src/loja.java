class lojaEletronicos {

    String ssd;
    String hd;
    String placaMae;
    String placaVideo; 
    String memoriaRam;
    String gabinete;
    String fonte;
    String mouse;
    
    public String[] vetorPedido(){
        String[] vPedidos = new String[8];
        
        return vPedidos;

    }
    public void vender (String nomeCliente) {
        System.out.println ("estou vendo um pedido fechado");
    }
    public void comprar (int cnpj, String nomeProduto){
        System.out.println ("comprando nova mercadoria");
        System.out.println ("pedido de " + nomeProduto + "realizado em nome do CNPJ:" + cnpj);

    }
    
    public void trocar (){}
    public void consertar (){}
}

public class loja {
    public static void main (String[] args) throws Exception{
    lojaEletronicos gamerX = new lojaEletronicos();
    gamerX.fonte = "fonte 600V";
    gamerX.gabinete = "gabinete gamer";
    gamerX.hd = "1Tb 7000rpm";
    gamerX.memoriaRam = "kingston 16GB mem";
    gamerX.mouse = "microsoft 180";
    gamerX.placaMae "asus";
    gamerX.placaVideo "RTX 4090TI";
    gamerX.ssd = "500 Gb pcle";
    //CNPJ = 9 DIGITOS 
    gamerX.comprar(cnpj:123456789;
    nomeProduto:"NVIDIA");
    gamerX.vender (nomeCliente:"thomas"); 

    gamerX.fazerpedido(gamerX.gabinete, posicao:0);
    gamerX.fazerpedido(gamerX.hd, posicao:1);
    gamerX.fazerpedido(gamerX.mouse, posicao:2);
    }
     
    }

}