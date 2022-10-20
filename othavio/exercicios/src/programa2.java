class conta {
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
        this.saldo += quantidade
    }
}

class programa2{

}
