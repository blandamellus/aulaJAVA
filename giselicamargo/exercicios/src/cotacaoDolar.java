import java.util.Scanner;
public class cotacaoDolar{

public static void main(String[] args) {
  
    int Cdolar;
    int Vdolar;
    int Resultado;

    Scanner entrada = new Scanner(System.in);
    // msg
    
    System.out.println("insira sua cotção em dolar") ;
    Cdolar = entrada.nextInt();
    
    System.out.println("insira seu valor em dolar");
    Vdolar = entrada.nextInt();
    
Resultado= (Vdolar*Cdolar);
System.out.println("O valor em Real é: " + Resultado);




    
 

}

}