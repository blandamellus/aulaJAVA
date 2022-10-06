class Cliente{
    String nome; 
    String cpf;
    String telefone;
    String email;
    String endereco;
    String carrocomprado;
 }
 
 class Venda {
    double preco;
    double kilometragem;
    int donos;
    double valorEntrada;
 }
 
 class Carro {
    //Características de um carro
    String modelo;
    String marca;
    String fabricante;
    String chassi;
    String cor;
    int ano;
    Venda oferta;
    Cliente comprador;

    // Métodos (ações) de um carro
    void ligar(){
        System.out.println("O carro foi ligado");
    }

    void desligar(){
        System.out.println("O carro foi desligado");
    }

    void acelerar (){
        System.out.println("O carro está acelerando");
    }

    void freiar (){
        System.out.println("O carro está freiando");
    }

    void vender (Cliente comprador, String modelo){
        System.out.println("O carro foi vendido com sucesso");
    }
}

class revenda {
    public static void main (String args[]){
        //Criando o carro na revenda
        Carro corsa = new Carro();

        //Cadastrando as caracteristicas do carro "Corsa"
        corsa.modelo = "Corsa";
        corsa.marca = "Chevrolet";
        corsa.chassi = "ASD123";
        corsa.fabricante = "Chevrolet";
        corsa.cor = "Azul";
        corsa.ano = 2014;

        //Criando o carro gol
        Carro gol = new Carro();

        //Criando as ofertas do carro gol
        Venda informacoes = new Venda ();
        gol.oferta = informacoes;

        //Cadastrando as caracteristicas do carro "Gol"
        gol.modelo = "Gol";
        gol.marca = "Volkswagen";
        gol.chassi = "OPS398";
        gol.fabricante = "Volkswagen";
        gol.cor = "Preto";
        gol.ano = 2020; 

        //Cadastranso as informações de venda do gol
        informacoes.preco = 12.521;
        informacoes.valorEntrada = 2.480;
        informacoes.kilometragem = 5.478;
        informacoes.donos = 7;

        //Criando o cliente que comprou um carro
        Cliente dadosDoCliente = new Cliente ();

        //Cadastrando o cliente que comprou o carro
        dadosDoCliente.nome = "Arthur";
        //dadosDoCliente.telefone = "(51) 99854-8997";
        //dadosDoCliente.email = "arthurcampobom@gmail.com";
        //dadosDoCliente.endereco = "Campo Bom";
        dadosDoCliente.cpf = "028.478.987.55";

        //Vinculando os dados do cliente como comprador do carro
        gol.comprador = dadosDoCliente;

        //Testdrive com o Gol
        System.out.println("Testdrive do Gol:");
        //Fulano ligou o gol
        gol.ligar();
        //Fulano acelerou o gol
        gol.acelerar();
        //Fulano freiou o gol
        gol.freiar();
        //Fulano desligou o gol
        gol.desligar();

        // Exibindo as informações do corsa
        System.out.println("\nInformações do carro: \nModelo do carro: " + corsa.modelo + "\nMarca do carro: " + corsa.marca + "\nChassi do carro: " + corsa.chassi + "\nFabricante do carro: " + corsa.fabricante);

        //Exibindo as informações do gol
        System.out.println("\n\nInformações do Gol\nModelo:" + gol.modelo + "\nMarca: " + gol.marca + "\nChassi: " + gol.chassi + "\nFabricante: " + gol.fabricante + "\nCor: " + gol.cor + "\nAno de Fabricação: " + gol.ano);

        //Exibindo as informações de venda do gol

        System.out.println("Oferta\nPreço: " + informacoes.preco + "\nEntrada: " + informacoes.valorEntrada + "\nKilometragem: " + informacoes.kilometragem + "\nQuantidade de donos: " + informacoes.donos); 

        gol.vender(gol.comprador, gol.modelo);

        System.out.println("O cliente " + dadosDoCliente.nome + " comprou o carro " + gol.modelo);
    }
}