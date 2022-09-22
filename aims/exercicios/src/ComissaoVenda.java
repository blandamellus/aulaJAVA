import java.util.Scanner;

public class ComissaoVenda {
    public static void main(String[] args) throws Exception {
        String nome;
        int codigo, quantidade;
        Double total,unitario;  
       Scanner entrada = new Scanner(System.in); 
       
            System.out.println("digite o valor unitario");
            unitario = entrada.nextDouble();
       

           System.out.println("digite o nome do vendedor");
            nome = entrada.next();

            System.out.println("digite o codigo da peça");
            codigo = entrada.nextInt();



            System.out.println("digite a quantidade vendida");
            quantidade = entrada.nextInt();
        
            System.out.println("vendedor " + nome);
            System.out.println("codigo" + codigo);
            System.out.println("valor unitario" + unitario);
            System.out.println("quantidade" + quantidade);
            
            total = (quantidade * unitario ) * 0.05;

            System.out.println("o valor total é" + total);
    

        }
}