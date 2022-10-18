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
        /* double novoSaldo;
         novoSaldo = this.saldo + quantidade;
         this.saldo = novoSaldo;*/ 
        this.saldo += quantidade;
    }
}

public class programa{
public static void main (String args[]){
  // criando conta
    Conta minhaConta;
    minhaConta = new Conta();
//alterando os valores da conta
 minhaConta.nomeTitular = "Maiara Pimentel";
 minhaConta.saldo = 1500.00;
 minhaConta.limite = 150.00;
 minhaConta.numeroConta = 48468;

 //fazer um saque

 minhaConta.sacar(200);

minhaConta.depositar(500);

 System.out.println("O saldo atual de " + minhaConta.nomeTitular + " é de " + minhaConta.saldo + " reais");
   
}

 }