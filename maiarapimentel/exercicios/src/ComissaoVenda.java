import java.util.Scanner;

public class ComissaoVenda{

    public static void main(String[] args) throws Exception{

        Scanner entrada = new Scanner(System.in);
        
        String Indvendedor;
        int Codpeça, Precopeça, Quantidadevendida;
        double comissao;

        System.out.println("digite seu nome:");
        Indvendedor = entrada.next();

        System.out.println("insira código da peça:");
        Codpeça = entrada.nextInt();

        System.out.println("informe o preço da peça:");
        Precopeça = entrada.nextInt();

        System.out.println("informe quanto foi vendido:");
        Quantidadevendida = entrada.nextInt();

     comissao = (Precopeça*Quantidadevendida)*0.05;

     System.out.println("sua comissão é:" + comissao);






    }

}