import java.util.Scanner;

public class ComissaoVenda {
    public static void main(String[] args) throws Exception {
        //comissão de 5%
        //identificação do vendedor, codigo da peça, preço unitario da peça, quantidade vendida

        Scanner scan = new Scanner(System.in);

        String nome;
        System.out.println("Escreva o nome do vendedor: ");
        nome = scan.next();

        int codigo;
        System.out.println("Insira o código do produto: ");
        codigo = scan.nextInt();

        Double preco;
        System.out.println("Insira o valor unitário da peça: ");
        preco = scan.nextDouble();

        int quantidade;
        System.out.println("Insira a quantidade vendida: ");
        quantidade = scan.nextInt();

        Double vendatotal = preco *quantidade;
        System.out.println("A venda total foi: " + vendatotal);

        Double resultado = (vendatotal *5) /100;

        System.out.println("O pagamento a ser recebido é: " + resultado);



    }
}