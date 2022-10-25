import java.util.Scanner;

public class Aula14_exercicio_2 {
    public static void main(String[] args) {
        /* receber a lista de compras (em códigos)
         * somar o total da compra
         * exibir o total a ser pago pelo usuário  */
        Scanner entrada = new Scanner(System.in);
                                   // 0     1     2      3     4
        Double [] valoresProdutos = {5.0, 1.99, 29.99, 100.0, 35.5};
        int codigoProduto;
        Double totalPagar = 0.0;
        
        do {
            System.out.println("Informe o código do produto: ");
            codigoProduto = entrada.nextInt();
            if(codigoProduto == 99){
                System.out.println("Fechando a conta. Aguarde...");
            } else{
                totalPagar = totalPagar + valoresProdutos[codigoProduto];
                System.out.println("-----------------------------");
            }
        } while (codigoProduto != 99); // 99 é o código de saída
        
        System.out.println("O cliente precisa pagar o total de R$ " + totalPagar);

              


        




    }
}