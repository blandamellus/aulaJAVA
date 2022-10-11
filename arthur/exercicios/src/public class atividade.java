import java.util.Scanner;

public class atividade{
     public static void main(String[] args) {
     //Faça um program que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja invalido e continue pedindo ate que o usuario informe um valo valido.

Scanner entrada = new Scanner(System.in);
Double nota;
int contador;
System.out.println("informe uma nota:" );
nota = entrada.nextDouble();

while (contador != 1) {
    System.out.println("nota Valida!");
    nota = entrada.next
}
if(nota <= 0 && nota >= 10) {
    System.out.println("informe uma nota válida:" );
    nota = entrada.nextDouble();   
}




