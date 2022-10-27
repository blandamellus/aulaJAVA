import java.util.Scanner;

class loja{
    String ssd;
    String hd;
    String placaMae;
    String placaVideo;
    String memRam;
    String gabinete;
    String fonte;
    String mouse;
    String[] vPedidos = new String [8];

    public String[] fazerPedido(String item, int posicao){
        String [] vPedidos = new String[8];
        this.vPedidos[posicao] = item;
    }

    public void vender(String nomeCliente){
        System.out.println("Estou vendendo um pedido fechado para " + nomeCliente);


    }

    public void comprar(int cnpj, String nomeProduto){
        System.out.println("comprando nova mercadoria");
        System.out.println("pedido de " + nomeProduto + "realizado em nome do CNPJ: " + cnpj);

    }

    public void trocar(String pecaComProblemas, String nomeCliente){
        System.out.println("Pedido de assistência para peça " + pecaComProblemas + " em nome do Cliente " + nomeCliente);

    }

    public void consertar(String dataAgendamento, String retirada, String equipamento){
        System.out.println("O equipamento " + equipamento + " foi recebido na data " + dataAgendamento 
     + " e estará finalizado na data " + retirada);

    }
}
public class eletronico {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);

    loja gamerX = new loja();

    gamerX.fonte = "Fonte 600V";
    gamerX.gabinete = "Gabinete gamer";
    gamerX.hd = "1Tb 7000rpm";
    gamerX.memRam = "Kingston 16Gb Mem";
    gamerX.mouse = "Microsoft 180";
    gamerX.placaMae = "Asus";
    gamerX.ssd = "256Gb";
    gamerX.placaVideo = "RTX 1660 TI";
    // 11 int
    // 14

    gamerX.comprar (105000151, "NVIDIA ");
    gamerX.vender("Antonio");
    gamerX.trocar("mouse", "Maria");
    gamerX.consertar("12/11", "24/11", "Teclado");

    String []dadosDoPedido = gamerX.fazerPedido(gamerX.gabinete, 0);
    gamerX.fazerPedido(gamerX.gabinete, 0);
    gamerX.fazerPedido(gamerX.hd, 1);
    gamerX.fazerPedido(gamerX.mouse, 2);

    System.out.println("Exibir o carrinho 0" + dadosDoPedido[0]);
    System.out.println("Exibir o carrinho 1" + dadosDoPedido[1]);
    System.out.println("Exibir o carrinho 2" + dadosDoPedido[2]);

    System.out.println("O que você deseja consertar? ");

    System.out.println("O que você deseja consertar? ");

    System.out.println("O que você deseja retirar? ");

    gamerX.consertar(dataAgendamento, retirada, equipamento);





    }
}



