import java.util.Scanner;
public class numeroUsuario{
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int[] numero = new int[100];
        int contar1=0, contar3=0, contar4=0;

        do {
            System.out.println("entre com um numero: ");
            numero[contador] = entrada.nextInt();
       
             if(numero[contador] == 1){
              contar1 = contar1 + 1;
          }

             if(numero[contador] == 3){
              contar3 = contar3 + 1;
          }

             if(numero[contador] == 4){
              contar4 = contar4 + 1;
          }
            contador = contador + 1;

        } 
         while (contador < 100 && numero[contador] != -1);
    }
}
    