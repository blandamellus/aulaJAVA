class LojaEletronicos{

    String ssd;
    String hd;
    String placaMae;
    String placaVideo;
    String memRam;
    String gabinete;
    String fonte;
    String mouse;
    
    String [] pedido = new String[8];
    
public String[] fazerPedido(String item){
    pedido[0] = item; // temos um vetor de 8 

return this.pedido;
}

    public void vender(String nomeCliente){
        System.out.println("estou vendendo um pedido fechado. ");

    }
    public void comprar(int cnpj, String nomeProduto){
        System.out.println("comprando nova mercadoria");
        System.out.println("pedido de " + nomeProduto + "realizado em nome do CNPJ: " + cnpj);
    }
    public void trocar(String pecaComProblemas, String nomeCliente){

    System.out.println("pedido de assitência para peça" + pecaComProblemas + "em nome do cliente" + nomeCliente);

    }
    public void consertar(String dataAgendamento, String dataRetirada, String equipamento){

        System.out.println("o equipamento " + equipamento + "foi recebido na data " + dataAgendamento + " e estara finalizado na data" + dataRetirada);

    }
}


public class Loja{

    public static void main(String[] args) throws Exception{
        LojaEletronicos gamerX = new LojaEletronicos();

        gamerX.fonte = "fonte 600w";
        gamerX.gabinete = "gabinete gamer";
        gamerX.hd = "1Tb 7000pm";
        gamerX.memRam = "Kingston 16Gb Mem";
        gamerX.mouse = "Microsofit 180";
        gamerX.placaMae = "Asus";
        gamerX.placaVideo = "RTX 4090TI";
        gamerX.ssd = "500 Gb pcle";
        
        
        gamerX.comprar (243796014, "NVIDIA");
        gamerX.vender ("Ântonio");
        gamerX.trocar(pecaComProblemas "mouse", nomeCliente: "Joana");
        //gamerX.consertar(String );
       
        String []dadosPedido = gamerX.fazerPedido(item: "gabinete",1);
        
        String []dadosPedido = gamerX.fazerPedido(item: "mouse",0);
       
        System.out.println("exibir o carrinho" + dadosPedido[1]);


        
    }
} 




