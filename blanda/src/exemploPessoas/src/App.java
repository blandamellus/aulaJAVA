import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.html.HTMLDocument.RunElement;

public class App {
    public static void main(String[] args) throws Exception {
        // tipos primitivos: int, boolean, double, long, 
        // objetos: String, Scanner, Classes

        Pessoa serHumano = new Pessoa();

        serHumano.setNome("Joaquim Maria");
        serHumano.setSobrenome("Machado de Assis");
        serHumano.corOlhos = "Castanhos";
        serHumano.peso = 80.9;

        //System.out.println(serHumano.getNome());
        //System.out.println(serHumano.andar("Tênis"));

        String valor;

        valor = serHumano.comer();
        //System.out.println("ESTOU NO APP "+ valor);
        
        Scanner entrada = new Scanner(System.in);

        Double valor1, valor2, resultado=0.0;
        String mensagem, operacao;

        System.out.println("Entre com o primeiro valor: ");
        valor1 = entrada.nextDouble();

        System.out.println("Entre com o segundo valor: ");
        valor2 = entrada.nextDouble();

        System.out.println("Qual operação você deseja? ");
        operacao = entrada.next();

        Calculadora calc = new Calculadora();

        if (operacao.contains("soma")) {
            resultado = calc.soma(valor1, valor2);
            
        } else if(operacao.contains("subtracao")){
            resultado = calc.subtracao(valor1, valor2);

        } else if(operacao.contains("divisao")){
            resultado = calc.divisao(valor1, valor2);

        } else if(operacao.contains("multiplicacao")){
            resultado = calc.multiplicacao(valor1, valor2);
        } else if(operacao.contains("percent")){
            resultado = calc.percentual(valor1, valor2);
        } else{
            System.out.println("Operação inválida!");
        }

        System.out.println("O resultado da " + operacao + " = " + resultado );

        






    }
}
