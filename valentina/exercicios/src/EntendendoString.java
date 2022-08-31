public class EntendendoString {
    public static void main(String[] args) throws Exception {
        int numero;
        int numero1 = 0;

        String minhaString = new String();
        minhaString = "alguma coisa";

        String minhaString2 = "alguma coisa";

        String minhaString3 = new String("alguma coisa");

        System.out.println(minhaString);
        System.out.println(minhaString2);
        System.out.println(minhaString3);

        // Substituindo string
        String s = "Alguma ciusa";
        s = s.replace("texto", "novo texto");
        System.out.println(s);

        // Verifica dentro da variável a expressão que estou procurando
        String s2 = "Algum texto para validar o uso strings";
        System.out.println(s2.contains ("validar"));

        // Remove espaços do inicio e fim de variavel(string)
        String s3 = " meu texto de teste ";
        s3 = s3.trim();
        System.out.println(s3);

        // Conta e exibe a quantidade de caractéres da string
        String s4 = "Java";
        System.out.println(s4.length());

        // Transforma as letras em maiúsculo
        System.out.println(s4.toLowerCase());
        System.out.println(s4.toUpperCase());

        // Subtrai os caracteres de 0 até o indice informado
        String s6 = "Universidade";
        s6 = s6.substring(7);
        System.out.println(s6);

        /*
        if(numero == 5){

        }
        if(numero >= 5 && numero <= 5){

        }
        */

        String entrada
    }
}