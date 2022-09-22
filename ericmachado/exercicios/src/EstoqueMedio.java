import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) throws Exception {
       
    Scanner entrada = new Scanner(System.in); 
           int maximo;
           int minimo;
           int EstoqueMedio;
           System.out.println("escreva algo aqui");

    maximo = entrada.nextInt();
    System.out.println("escreva algo aqui");
    minimo = entrada.nextInt();
    System.out.println("escreva algo aqui");
    
    EstoqueMedio =(maximo+minimo)/2;
    System.out.println("O estoque medio equivale a: " + EstoqueMedio);


}
}

