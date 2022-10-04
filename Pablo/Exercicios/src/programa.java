import java.util.Scanner;

class Conta{
    int numeroconta;
    String NomeTitular;
    Double Saldo;
    Double Limite;
}

public class programa {

    public static  void  main(String[] args) {
        System.out.println("ola senhor , qual vai ser o serviço hoje?");
        Conta minhaconta;
        minhaconta = new Conta();
         
         minhaconta.NomeTitular = "Isabel Prado";
         minhaconta.Saldo = 15.00;
         minhaconta.Limite = 150.00;
         minhaconta.numeroconta = 48468;

         System.out.println("saldo atual do" + minhaconta.NomeTitular + "é de"+  minhaconta.Saldo + "Reais");




        
    }
}