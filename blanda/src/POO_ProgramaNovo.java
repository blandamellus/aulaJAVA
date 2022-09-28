/* 
Requisitos:
    - Sacar dinheiro, 
    - Depositar dinheiro, 
    - Tirar extrato,
    - Abrir uma conta, 
    - Fechar um conta, 
    - Atualizar os dados da conta,
    - Pagar uma conta,
    - Empréstimo,
    - Cartão, 
    - Transferir 
 */

class Conta{
    int numeroConta;
    String nomeTitular;
    double saldo;
    double limite;
    double salario;

    void sacar(double quantidade){
        double novoSaldo;
        novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    void depositar (double quantidade){
        this.saldo += quantidade;
    }


    
}

class ProgramaNovo {
    public static void main (String args[]){
        //Criando a conta
        Conta minhaConta;
        minhaConta = new Conta();

        // Alterando os valores da conta
        minhaConta.nomeTitular = "Diego Pinheiro";
        minhaConta.saldo = 1500.00;
        minhaConta.limite = 150.00;
        minhaConta.numeroConta = 48468;

        // Fazer um saque
        minhaConta.sacar(200);

        // Fazer um deposito
        minhaConta.depositar(500);

        System. out.println("O saldo atual de " + minhaConta.nomeTitular + " é de " + minhaConta.saldo + " Reais");

    }
}