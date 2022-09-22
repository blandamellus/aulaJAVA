import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        
        String  nomeResponsavel;
        int quantidade,valorUnitario;
        Double resultado;

        System.out.println("informe o Nome do Responsavel");
        nomeResponsavel = scan.next();

        System.out.println("informe a Quantidade");
        quantidade = scan.nextInt();

        System.out.println("valor Unitario");
        valorUnitario = scan.nextInt();
        resultado = (quantidade * valorUnitario) * 0.05;



        System.out.println("comissão do vendedor" + resultado);
        
    
    }
}
 
