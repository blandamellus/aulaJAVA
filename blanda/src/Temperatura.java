import java.util.Scanner;

/*
    1. Faça um programa que, que receba o valor da temperatura em graus celsius (Cº), converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F). As fórmulas estão abaixo: 
    F = C * 1.8 + 32; 
    K = C + 273.15; 
    Re = C * 0.8; 
    Ra = C * 1.8 + 32 + 459.67
    */

public class Temperatura {
    public static void main(String[] args) throws Exception {
    
        Scanner entrada = new Scanner(System.in);
        double C, K, Re, Ra, F;

        System.out.println("Informe a temperatura em Celsius: ");
        C = entrada.nextInt();

        F = C * 1.8 + 32;
        K = C + 273.15; 
        Re = C * 0.8; 
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Fahrenheit: " + F);
        System.out.println("A temperatura em Kelvin: " + K);
        System.out.println("A temperatura em Réaumur: " + Re);
        System.out.println("A temperatura em Rankine: " + Ra);
        
  
    }
}