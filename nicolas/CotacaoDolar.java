import java.util.Scanner;
public class CotacaoDolar{

    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        
        int Cdolar, Vdolar, Vemreal;

         System.out.println("informe cotação:");
         Cdolar = entrada.nextInt();

         System.out.println("informe valor dólar:");
         Vdolar = entrada.nextInt();

         Vemreal = Vdolar*5;

         System.out.println("o valor convertido é:"+ Vemreal);



    }

}

