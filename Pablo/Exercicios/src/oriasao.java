/* informação pessoal: senha, nome de titular, usuario, cpf, numero da conta,  
*  Funcionalidades: sacar dinheir, consultar saldo, enviar dinheiro, emprestimo, depositar dinheiro, imprimir saldo


*/
public class oriasao {
    int senha;
    String nomeDoTitular;
    String usuario;
    int cpf;
    double saldo; 
    int numerodaconta;
    double limite;
    double salario;

    void sacar (double quantidade) {
         double novoSaldo = this.saldo - quantidade;
         this.saldo = novoSaldo;   
    }
   
    void depositar (double quantidade){
        saldo += quantidade;
    }

}

    class Programa {
        public static void main(String[] args) {
           //Criando uma conta
            oriasao minhaConta;
           minhaConta = new oriasao (); // Criou um objeto
        
           //Alterando os valores da Minha conta 
            minhaConta.nomeDoTitular = "Gustavo";
            minhaConta.saldo = 15.00; 
            
           minhaConta.sacar (200);

            minhaConta.depositar( 500);
           
            System.out.println("saldo atual do " + minhaConta.nomeDoTitular+" é de "+ minhaConta.saldo);

       
       
       
       
       
       
            }

    }



