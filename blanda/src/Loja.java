import java.util.Scanner;

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

    public void fazerPedido(String item, int posicao){
        
        this.pedido[posicao] = item; 
        //return this.pedido;
    }
    

    public void vender(String nomeCliente){
        System.out.println("Estou vendendo um pedido fechado para " + nomeCliente );
    }
    
    public void comprar(int cnpj, String nomeProduto){
        System.out.println("Comprando nova mercadoria");
        System.out.println("Pedido de " +  nomeProduto + " realizado em nome do CNPJ: " + cnpj);
    } 

    public void trocar(String pecaComProblemas, String nomeCliente){
        System.out.println("Pedido de assistência para peça " + pecaComProblemas + " em nome do Cliente " + nomeCliente);
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
        gamerX.gabinete = "gabinete gamer";
        gamerX.hd = "1Tb 7000rpm";
        gamerX.memoriaRam = "Kingston 16Gb Mem";
        gamerX.mouse = "Microsofit 180";
        gamerX.placaMae = "Asus";
        gamerX.placaVideo = "RTX 4090TI";
        gamerX.ssd = "500 Gb pcle";
        
        // cnpj = 9 digitos
        gamerX.comprar(105000151, "NVIDIA");
        gamerX.vender("Antonio");
        gamerX.trocar("mouse", "Maria");
        

        gamerX.fazerPedido(gamerX.gabinete, 0);
        gamerX.fazerPedido(gamerX.hd, 1);
        gamerX.fazerPedido(gamerX.mouse, 2);

                
        System.out.println("Exibir o carrinho 0 " + gamerX.pedido[0]);
        System.out.println("Exibir o carrinho 1 " + gamerX.pedido[1]);
        System.out.println("Exibir o carrinho 2 " + gamerX.pedido[2]);

        // testando com entrada do usuário
        String dataAgenda;
        String dataRetira;
        String equipamento;
        System.out.println("O que você deseja consertar? ");
        equipamento = entrada.next();

        System.out.println("Quando você deseja consertar? ");
        dataAgenda = entrada.next();
        
        System.out.println("Quando você deseja retirar? ");
        dataRetira = entrada.next();

        gamerX.consertar(dataAgenda, dataRetira, equipamento);

    }
}