import java.util.Scanner;

public class ExerciciosString {
    public static void main(String[] args) throws Exception {
    // exercicio 1 
    Scanner entrada = new Scanner (System.in); 
    String informacao1; 
    int vogal = 0;

    System.out.println ("escreva uma informação");
    informacao1 = entrada.next();

    System.out.println (informacao1.length());
    System.out.println(informacao1.toUpperCase());


    for (int j = 0; j < informacao1.length(); j++){
        char carac = informacao1.charAt(j); 
        if (carac == 'a' || carac == 'e' ||  carac == 'i' || carac =='o'  || carac == 'u') {
            vogal ++; 
        }
    }
 System.out.println ("total " + vogal);  

// exercicio 2 Escreva um programa que dado um valor numérico digitado pelo usuário 
//(armazenado em uma variável inteira), imprima cada um dos seus dígitos por extenso.
//Exemplo, entre o número: 4571 Resultado: quatro, cinco, sete, um
 
Object system;
Scanner entrada = new Scanner (system.in);
String valor1; 

System.out.println ("digite um numero");


for (int j = 0; j < informacao1.length(); j++){
    char carac = informacao1.charAt(j); 
    if (carac == '1' ) {
        System.out.println("o numero digitado é um");
    if (carac == '2' ) {
            System.out.println("o numero digitado é dois");
    if (carac == '3' ) {
            System.out.println("o numero digitado é tres");
    if (carac == '4' ) {
            System.out.println("o numero digitado é quatro");
    if (carac == '5' ) {
            System.out.println("o numero digitado é cinco");
    if (carac == '6' ) {
            System.out.println("o numero digitado é seis");
    if (carac == '7' ) {
            System.out.println("o numero digitado é sete");
    if (carac == '8' ) {
            System.out.println("o numero digitado é oito");
    if (carac == '9' ) {
            System.out.println("o numero digitado é nove");
    if (carac == '0' ) {
            System.out.println("o numero digitado é zero");
    }
}






    }
}
