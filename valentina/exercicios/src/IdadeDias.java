import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) throws Exception {

        //receba a idade de uma pessoa em ano, mes e dia
        //exiba a idade em dias
        // ano 365 dias - mes 30 dias 

        Scanner scan  = new Scanner(System.in);

        int anos;
        System.out.println("Insira quantos vocÊ tem: ");
        anos = scan.nextInt();
        
        int meses;
        System.out.println("Insira quantos meses já passaram desde seu último aniversário: ");
        meses = scan.nextInt();

        int dias;
        System.out.println("Insira quantos dias ja passaram desde seu último mesversário: ");
        dias = scan.nextInt();

        int idade = (anos *360) + (meses *30) + dias;

        System.out.println("Sua idade em dias é aproximadamente: " + idade);
        



    }
}