class Conta {
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
        /*double novoSaldo;
        novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;*/
        this.saldo += quantidade;
    }
}
class programa {

    public static void main(String args[]){
        //criando a conta
     Conta minhaConta;
     minhaConta = new Conta();
        //alterando os valores da conta
     minhaConta.saldo = 1500.00;
     minhaConta.nomeTitular = "Othavio Gallas de Oliveira";
     minhaConta.limite = 150.00;
     minhaConta.numeroConta = 48468;

        //fazer um saque
        minhaConta.sacar(200);

        //fazer um deposito
        minhaConta.depositar(500);


     System.out.println("O saldo atual de " + minhaConta.nomeTitular + " é de " + minhaConta.saldo + " Reais");
    }
    
}
