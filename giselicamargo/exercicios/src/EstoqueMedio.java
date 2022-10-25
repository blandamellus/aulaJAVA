import java.util.Scanner;

public class EstoqueMedio{
    public static void main (String args[]) {
     
        int Qmaximo = 10;
        int Qminimo = 2;
        int EMedia;
         EMedia = (Qmaximo + Qminimo)/2;
        System.out.println ("Valor médio é: " + EMedia );

        Scanner entrada = new Scanner(System.in);

        // mensagem para usuario escr

        Qmaximo = entrada.nextInt();
 
        Qminimo = entrada.nextInt();
      
        System.out.println ("O valor medio é: " + EMedia);



    }
}