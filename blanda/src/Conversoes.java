import java.util.Scanner;

import javax.smartcardio.Card;

import org.jcp.xml.dsig.internal.dom.DOMCryptoBinary;

public class Conversoes {
    public static void main(String[] args) throws Exception {
        int car = 82;
        System.out.println(car);

        String umChar = new Character((char)car).toString();
        System.out.println(umChar);

        Scanner entrada  = new Scanner(System.in);
        Double valor1, valor2, doubleResultado;
        String strValor1, strValor2, strResultado;


        // entradas do usuário
        System.out.println("Digite um valor: ");
        valor1 = entrada.nextDouble();
        System.out.println("Digite um valor: ");
        valor2 = entrada.nextDouble();

        //soma de doubles
        doubleResultado = valor1 + valor2;
        System.out.println(doubleResultado);

        // String = simbolos, letras, numeros tudo com "" ao redor
        // soma de strings = concatenar
        strValor1 = Double.toString(valor1);
        strValor2 = Double.toString(valor2);
                
        strResultado = strValor1 + strValor2;
        System.out.println(strResultado);
    

        // conversao logica
        boolean flag = false;
        int digitado = 1;

        // 0 ou 1
        flag = (digitado != 0);
        System.out.println(flag);

        // convertendo de String para Double
        String str = "";
        Double res = 0.0;
        str = strValor1 + strValor2;
        res = Double.valueOf(strValor1) + Double.valueOf(strValor2);

        System.out.println("Como era o valor string: " + str);
        System.out.println("Como fica o valor em Double: " + res);
        
        // convertendo de String para int
        String strValor = "29";
        int intValor = Integer.valueOf(strValor).intValue();

        intValor = intValor + 4;
        System.out.println(intValor);

        
        



    }
}