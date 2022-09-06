import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) throws Exception {

        //Calcular o estoque médio de uma peça  
        //ESTOQUE MÉDIO = (QNTD MIN + QNTD MAX)/2

            Scanner scan = new Scanner(System.in);
            Double minimo;    
            System.out.println("Escreva a quantidade mínima: ");    
            minimo = scan.nextDouble();

            Double maximo;
            System.out.println("Escreva a quantidade máxima: ");
            maximo = scan.nextDouble();
                        
            Double media = (minimo + maximo) /2;
                  System.out.println("O estoque médio é " + media);

    }
}
   