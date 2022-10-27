class lolja_Eletronicos{

    String ssd;
    String hd;
    String placaMom;
    String placaVid;
    String memRam;
    String gabnete;
    String fonte;
    String mouse;
    private String[] vPedidos = new String [8];


public String[] vetorPedido(){

    String [] vPedidos = new String [8];
    vPedidos[0] = item;
    return vPedidos;

}

public void vender(){

    System.out.println("i am [watching] a closed [deal]");

}

public void comprar(String nProduto){

    System.out.println("getting the [full stock]");

    System.out.println("Recieving " + nProduto + " on the [stock]");
}

public void trocar(String pecaComProb, String nomeCliente){

    System.out.println("[Switch] is needed " + pecaComProb + "right [[BIG]] " + nomeCliente);

}

public void consertar(String items, String Data, String claim){

    System.out.println("So LIght ner we will need " + items + "to make it [BIG] again, so get here " + Data + "and you'll need to [claim your prise]" + claim);

}
}
public class eletronico{

    public static void main(String[] args) throws Exception{
        Scanner entrada = new scanner(System.in);

        lolja_Eletronicos Spamshots = new lolja_Eletronicos();

        Spamshots.ssd = "256Gb fast [thing]";
        Spamshots.hd = "1Tb 7000rpm will make your [puter][better than ever]!";
        Spamshots.placaMom = "Asus";
        Spamshots.placaVid = "RTX 1997 Ti";
        Spamshots.memRam = "kingston 16Gb Mem";
        Spamshots.gabinete = "Gabinete Gamer";
        Spamshots.fonte = "Fonte 600v";
        Spamshots.mouse = "microsoft 180";

        Spamshots.comprar (10500151,  "NVIDIA ");
        Spamshots.vender("carlos");
        Spamshots.troca("mouse", "[Hochi Mama]");
        Spamshots.consertar("32/02", "01/01/1997", "[[HyperlinkBlocked]]");

        ComData = Spamshots.vPedidos(Spamshots.mouse);


        String []ComData = Spamshots.vPedidos("hd");

        System.out.println("Show of shopping kart 1 " + ComData[0]);
        System.out.println("Show of shopping kart 2 " + ComData[1]);
        System.out.println("Show of shopping kart 3 " + ComData[2]);

        System.out.println("Whatcha want to sell?");

        System.out.println("");

        System.out.println("");

        System.out.println("");


    }
}