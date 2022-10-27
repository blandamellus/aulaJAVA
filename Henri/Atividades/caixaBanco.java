//Caixa eletrônico
class Conta{
    // Criando a conta do caixa
    int numeroConta;
    String nomeTitular;
    Double Saldo;
    Double Limite;

    Double Salario;

    void sacar(double quantidade){
        double novoSaldo;
        //this = palavra chave pra mostrar que faz parte de um atributo, e não somente uma variável.
        novoSaldo = this.Saldo - quantidade;
        this.Saldo = novoSaldo;
     }

    void depositar (double quantidade){
        //versão completa
        /double novoSaldo;
        novoSaldo = this.Saldo + quantidade;
        this.Saldo = novoSaldo;/

        //versão resumida usada quando ja tiver um codigo igual
        this.Saldo += quantidade;

        /* += ou -= Soma ou subtrai diretamente o valor da variável antiga com o valor da variável
       nova e guarda automaticamente nela mesma.
       Parecido com o ++ e -- que significam +1 e -1.*/
    }
}

public class objetos {
    public static void main (String args[]) throws Exception{
//      Criando a conta
        Conta minhaconta;
      minhaconta = new Conta();
      //alterando os valores da conta
      minhaconta.nomeTitular = "Cauan Borges";
      minhaconta.Saldo = 3000.00;
      minhaconta.Limite = 500.00;
      minhaconta.numeroConta = 92385;
      // Fazer um saque
      minhaconta.sacar(200);

      minhaconta.depositar(500);

      System.out.println("O saldo atual de " + minhaconta.nomeTitular + " é de " + minhaconta.Saldo + " Reais");
    }
}
