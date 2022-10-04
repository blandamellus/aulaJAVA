import java.util.Scanner;
class contaBanco {

        int numeroConta;
        String nomeTitular;
        Double saldo;
        Double limite; 
    

 
    void sacar (double quantidade){
        double novoSaldo;
        novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
     }

     void depositar (double quantidade){
         this.saldo += quantidade; 
     }
    }

public class programaBanco{
    public static void main (String[] args){

    // CRIANDO A CONTA 
    contaBanco contaUsuario; 
    contaUsuario  = new contaBanco();
    
    //ALTERANDO VALORES 
    contaUsuario.nomeTitular = "Thomas Ricardo";
    contaUsuario.saldo = 18.098;
    contaUsuario.limite = 9.897;
    contaUsuario.numeroConta = 170106;

    //FAZER UM SAQUE 
    contaUsuario.sacar(200);

    contaUsuario.depositar (500); 


    System.out.println ("o saldo de Thomas Ricardo é de " + contaUsuario.saldo);

    /*CRIE UM SISTEMA EM JAVA ONDE UM PROFESSOR INSERA A NOTA DE UMA MATERIA E SOMA COM AS NOTAS 
    ANTERIORES DAQUELA MATERIA */

    int nota1; 
    int notasMatematica =0 ; 
    String nomeAluno;
    
    Scanner entrada = new Scanner (System.in);

    System.out.println ("digite o nome do aluno");
    nomeAluno = entrada.next();
    System.out.println("digite a nota do aluno");
    nota1 = entrada.nextInt();
    notasMatematica = notasMatematica + nota1; 
        System.out.println("a soma total do aluno é " + notasMatematica);


}
}