/* Sacar dinheiro, depositar dinheiro, tirar extrato,
abrir uma conta, fechar um conta, 
atualizar os dados da conta, pagar um conta,
empréstimo, cartão, transferir 
 */
class Cliente{
    String nome;
    String sobrenome;
    String cpf;
}

class Conta{
    int numeroConta;
    double saldo;
    double limite;
    double salario;
    Cliente titular;

    boolean sacar (double quantidade){
        if (this.saldo < quantidade){
            return false;
        }
        else {
           this.saldo -= quantidade;
           return true;
        }       
    }
    void depositar (double quantidade){
        this.saldo += quantidade;
    }

    boolean transferirPara (Conta destino, double valor){
        boolean retirada = this.sacar(valor);
        if (retirada == false){
            return false; // não deu pra sacar
        }
        else {
            destino.depositar(valor);
            return true;
        }
    }
}

 class Programanovo {
    public static void main (String args[]){
        //Criando a conta
        Conta minhaConta;
        minhaConta = new Conta();

        //Criando uma segunda conta
        Conta turmaDeJava;
        turmaDeJava = new Conta();

        turmaDeJava.saldo = 10;


        Cliente conexao = new Cliente ();
        minhaConta.titular = conexao;

        Cliente clienteDaMinhaConta = minhaConta.titular;
       
        // Alterando os valores da conta
        clienteDaMinhaConta.nome = "Diego Pinheiro";
        minhaConta.saldo = 500.00;
        minhaConta.limite = 150.00;
        minhaConta.numeroConta = 48468;

        // Fazer um saque
        //minhaConta.sacar(200);

        // Fazer um saque com retorno
        
        if (minhaConta.sacar(800.00)){
            System.out.println("Seu saque foi realizado com sucesso;");
        } else{
            System.out.println("Não foi possível sacar o valor solicitado. Por favor, confira seu saldo.");
        }
        case 2:
        minhaConta.depositar(quantidade: 200);
        case 3:
            if (turmaDeJava.transferidaPara(minhaConta, valor: 10)){
                System.out.println ( "A tranferencia foi realuzada com sucesso.");
            }
        case 4:
            Systen.out,println ("conta foi criada com sucesso");
        case 5:
            System.out.println("O saldo atual de " + clienteDaMinhaconta.nome + " É de" minhaConta.saldo + " Reais");
        case 0:
            System.out,println( "A opcão inserida nao existe");
    





        // Fazer um deposito
        minhaConta.depositar(500);

        // Fazer uma transferência
        if(turmaDeJava.transferirPara(minhaConta,10)){
            System.out.println("A transferência foi realizada com sucesso.");
        }
        else{
            System.out.println("Não foi possível realizar a transferência.");
        }
        

        System.out.println("O saldo atual de " + clienteDaMinhaConta.nome + " é de " + minhaConta.saldo + " Reais");



    }
}




