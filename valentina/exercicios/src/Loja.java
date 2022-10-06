import java.util.Scanner;

import javax.swing.text.Position;

class LojaEletronicos{
    String ssd;
    String hd;
    String placaMae;
    String placaVideo;
    String memoriaRam;
    String gabinete;
    String fonte;
    String mouse;
    String[] pedido = new String[8];

    public String[] fazerPedido(String item, int posicao){
        pedido[posicao] = item;
        return this.pedido;
    
    }

    public void vender(String nomeCliente){
        System.out.println("Estou vendo um pedido fechado.");

    }

    public void comprar(int cnpj, String nomeProduto){
        System.out.println("Comprando nova mercadoria.");
        System.out.println("Pedido de " + nomeProduto + " realizado em nome do CNPJ: " + cnpj);

    }

    public void trocar(String pecaComProblema, String nomeCliente){
        System.out.println("Pedido de assistência para peça " + pecaComProblema + "em nome do Cliente " + nomeCliente);
        
    }

    public void consertar(String dataAgendamento, String dataRetirada, String equipamento){
        System.out.println("O equipamento " + equipamento + " foi recebido na data " + dataAgendamento + " e estará finalizado na data " + dataRetirada);
    }
}

public class Loja {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        LojaEletronicos gamerX = new LojaEletronicos();

        gamerX.fonte = "Fonte 600V";
        gamerX.gabinete = "Gabinete Gamer";
        gamerX.hd = "HD - 1Tb 7000rpm";
        gamerX.memoriaRam = "Kingston 16Gb Mem";
        gamerX.mouse = "Mouse - Microsoft 180";
        gamerX.placaMae = "Asus";
        gamerX.placaVideo = "RTX 4090TI";
        gamerX.ssd = "500 Gb pcle";

        gamerX.comprar(123456789, "NVIDIA");
        gamerX.vender("Antonio");
        gamerX.trocar("mouse", "Maria");
        //gamerX.consertar();

        String []dadosDoPedido = gamerX.fazerPedido(gamerX.gabinete, 0);
        dadosDoPedido = gamerX.fazerPedido(gamerX.hd, 1);
        dadosDoPedido = gamerX.fazerPedido(gamerX.mouse, 2);


        System.out.println("Exibir o carrinho 0 " + dadosDoPedido[0]);
        System.out.println("Exibir o carrinho 1 " + dadosDoPedido[1]);
        System.out.println("Exibir o carrinho 1 " + dadosDoPedido[2]);

        String dataAgendamento;
        String dataRetirada;
        String equipamento;

        System.out.println("O que você deixa consertar? ");
        equipamento = entrada.next();

        System.out.println("Quando você deixa consertar? ");
        dataAgendamento = entrada.next();

        System.out.println("Quando você deseja retirar? ");
        dataRetirada = entrada.next();
        
        gamerX.consertar(dataAgendamento, dataRetirada, equipamento);
        

        
    }
}