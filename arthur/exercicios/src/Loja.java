import java.util.Scanner;

class LojaEletronicos{

    String ssd;
    String hd;
    String placaMae;
    String placaVideo;
    String mouse;
    String fonte;
    String gabinete;
    String memoriaRam;
    String [] pedido = new String[8];

    public String[] fazerPedido(String item, int posicao){
        pedido[posicao] = item;
        
        return this.pedido;
    }

    public void vender(String nomeCliente){
        System.out.println("Estou vendendo um pedido fechado.");

    }
    public void comprar(int cnpj, String nomeProduto){
        System.out.println("Comprando nova mercadoria");
        System.out.println("Pedido de" + nomeProduto + "realizado em nome do CNPJ:" + cnpj);

    }
    public void trocar(String pecaComProblema, String nomeCliente){
        System.out.println("Pedido de assistência para peça " + pecaComProblema + 
        " em nome do Cliente" + nomeCliente);

    }
    public void consertar(String dataAgendamento, String dataRetirada, String equipamento){
        System.out.println("O equipamneto foi recebido na data" + dataAgendamento + 
        "e estará finalizado na data" + dataRetirada);

    }

     
 }

    public class Loja {

        public static void main(String[] args) throws Exception {
            
            Scanner entrada = new Scanner(System.in);
            LojaEletronicos gamerX = new LojaEletronicos();

            gamerX.fonte = " Fonte 600v";
            gamerX.gabinete = " gabinete gamer";
            gamerX.hd = " 1 Tb 7000rpm";
            gamerX.memoriaRam = " Kingston 16GB mem";
            gamerX.placaMae = " Asus";
            gamerX.placaVideo = " RTX 4090TI";
            gamerX.ssd = " 500 Gb pcle";
            gamerX.mouse = " Microsft 180";
            
            //11 int
            // 14

            gamerX.comprar(987654321," NVIDIA ");

            gamerX.vender("Antonio");

            gamerX.trocar("mouse"," Maria");

            String []dadosDoPedido = gamerX.fazerPedido(gamerX.gabinete, 0);
            
            dadosDoPedido = gamerX.fazerPedido(gamerX.mouse, 1);

            dadosDoPedido = gamerX.fazerPedido(gamerX.hd, 2);


            System.out.println("Exibir o carrinho 0 " + dadosDoPedido[0]);

            System.out.println("Exibir o carrinho 1 " + dadosDoPedido[1]);

            System.out.println("Exibir o carrinho 2 " + dadosDoPedido[2]);

            String equipamento;
            String dataAgenda;
            String dataRetira;

            System.out.println(" O que você deseja consertar? ");
            equipamento = entrada.next();
            
            System.out.println(" O que você deseja consertar? ");
            dataAgenda = entrada.next();


            System.out.println(" O que você deseja consertar? ");
            dataRetira = entrada.next();


            gamerX.consertar(" Dia 10 Out", "Dia 15 Out", "Fonte");


        }
    }

