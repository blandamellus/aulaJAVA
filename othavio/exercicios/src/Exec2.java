public class Exec2 {
    String ssd;
    String HD;
    String placa_mae;
    String placa_video;
    String mem_ram;
    String gabinete;
    String fonte;
    String mouse;
    String[] pedido = new String[8];

    public String[] vetorPedido(String item){
        pedido[0] = item; 
        return this.pedido;
    }

    public static void vender(String nomeCliente){
        System.out.println("EStou vendo um pedido fechado.");
    }

    public static void comprar(int cnpj, String nomeProduto){
        System.out.println("Comprando niva mercadoria");
        System.out.println("Pedido de " + nomeProduto + "realizado em nome do CNPJ: " + cnpj);

    }

    public static void trocar(String pecaComProblemas, String nomeCliente){
        System.out.println("Pedido de assistência para peça " + pecaComProblemas + " em nome do Cliente " + nomeCliente);


    }

    public static void consertar(){

    }
    
}

public class Loja {
    public static void main(String[] args) throws Exception {
        LojaEletronicos gamerX = new LojaEletronicos();

        gamerX.fonte = "Fonte 600V";
        gamerX.gabinete = "gabinete gamer";
        gamerX.hd = "1TB 7000rpm";
        gamerX.memoriaRam = "Kingston 16Gb Mem";
        gamerX.mouse = "Microsoft 180";
        gamerX.placaMae = "Asus";
        gamerX.placaVideo = "RTX 4090TI";
        gamerX.ssd = "500 Gb pcle";


        gamerX.comprar(cnpj: 105000151, nomeProduto:"NVIDIA");
        gamerX.vender(nomeCliente: "Antonio");
    }
}
